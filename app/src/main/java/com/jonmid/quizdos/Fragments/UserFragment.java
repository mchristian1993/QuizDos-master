package com.jonmid.quizdos.Fragments;


import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.jonmid.quizdos.Adapters.CommentAdapterAnguloChristian;
import com.jonmid.quizdos.Connection.HttpManagerAnguloChristian;
import com.jonmid.quizdos.Models.UserModelAnguloChristian;
import com.jonmid.quizdos.Parser.UserJsonAnguloChristian;
import com.jonmid.quizdos.R;

import org.json.JSONException;

import java.io.IOException;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class UserFragment extends Fragment {
    ProgressBar progressBar;
    Button button;
    RecyclerView recyclerView;
    List<UserModelAnguloChristian> countryList;

    CommentAdapterAnguloChristian adapterCountry;



    public UserFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_user, container, false);


    }

    public class TaskCountry extends AsyncTask<String, String, String> {
        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            progressBar.setVisibility(View.VISIBLE);
        }

        @Override
        protected String doInBackground(String... strings) {
            String content = null;

            try {
                content = HttpManagerAnguloChristian.getData(strings[0]);
            } catch (IOException e) {
                e.printStackTrace();
            }


            return content;
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);


            try {
                countryList = UserJsonAnguloChristian.getData(s);
            } catch (JSONException e) {
                e.printStackTrace();
            }


            processData();

            progressBar.setVisibility(View.GONE);
        }
    }

    public void processData() {
        adapterCountry = new CommentAdapterAnguloChristian (countryList, getApplicationContext());
        recyclerView.setAdapter(adapterCountry);
    }

    // Metodo para validar la conexion a internet public
    public Boolean isOnLine() {
        // Hacer llamado al servicio de conectividad utilizando el ConnectivityManager
        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);

        // Obtener el estado de la conexion a internet en el dispositivo
        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();

        // Validar el estado obtenido de la conexion
        if (networkInfo != null) {
            return true;
        } else {
            return false;
        }
    }

    public void loadData(View view) {
        if (isOnLine()) {
            TaskCountry taskCountry = new TaskCountry();
            taskCountry.execute("https://restcountries.eu/rest/v2/lang/es");
        } else {
            Toast.makeText(this, "Sin conexion", Toast.LENGTH_SHORT).show();
        }
    }
}
