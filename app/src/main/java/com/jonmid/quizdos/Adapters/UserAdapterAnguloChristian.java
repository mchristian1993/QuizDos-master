package com.jonmid.quizdos.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.jonmid.quizdos.Models.UserModelAnguloChristian;
import com.jonmid.quizdos.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by CHRISTIAN on 10/10/2017.
 */

public class UserAdapterAnguloChristian extends RecyclerView.Adapter<UserAdapterAnguloChristian.ViewHolder>{

    List<UserModelAnguloChristian> userList = new ArrayList<>();
    Context context;

    public UserAdapterAnguloChristian(List<UserModelAnguloChristian> userList, Context context) {
        this.userList = userList;
        this.context = context;
    }

    @Override


    public UserAdapterAnguloChristian.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View item = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_user, parent, false);

        // Pasar la vista (item.xml) al ViewHolder
        ViewHolder viewHolder = new ViewHolder(item);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(UserAdapterAnguloChristian.ViewHolder holder, int position) {
        holder.name.setText(userList.get(position).getName());



    }

    @Override
    public int getItemCount() {
        return userList.size();
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
