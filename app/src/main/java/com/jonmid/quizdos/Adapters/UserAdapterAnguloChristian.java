package com.jonmid.quizdos.Adapters;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
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
        TextView name;
        TextView username;
         TextView email;
        TextView  phone;
         TextView namecompany;
        TextView address;
       ImageView urlimage_user;

        public ViewHolder(View item) {
            super(item);
            name = (TextView) item.findViewById(R.id.id_tv_userinput_name);
            username = (TextView) item.findViewById(R.id.id_tv_userinput_username);
            email = (TextView) item.findViewById(R.id.id_tv_userinput_email);
            phone = (TextView) item.findViewById(R.id.id_tv_userinput_phone);
            namecompany = (TextView) item.findViewById(R.id.id_tv_userinput_namecompany);
            address = (TextView) item.findViewById(R.id.id_tv_userinput_address);
            urlimage_user = ( ImageView) item.findViewById(R.id.imageView);
        }
    }
}
