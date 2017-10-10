package com.jonmid.quizdos.Adapters;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.jonmid.quizdos.R;

/**
 * Created by CHRISTIAN on 10/10/2017.
 */

public class UserAdapterAnguloChristian extends RecyclerView.Adapter<UserAdapterAnguloChristian.ViewHolder>{


    @Override
    public UserAdapterAnguloChristian.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(UserAdapterAnguloChristian.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
         name;
         username;
         email;
         phone;
         namecompany;
         address;
         urlimage_user;

        public ViewHolder(View item) {
            super(item);
            textViewName = (TextView) item.findViewById(R.id.id_tv_item_namecountry);
            textViewCapital = (TextView) item.findViewById(R.id.id_tv_item_namecapital);
            textViewAlphs = (TextView) item.findViewById(R.id.id_tv_item_nameabbreviation);
        }
    }
}
