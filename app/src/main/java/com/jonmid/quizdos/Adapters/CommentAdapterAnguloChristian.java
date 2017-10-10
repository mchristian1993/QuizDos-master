package com.jonmid.quizdos.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.jonmid.quizdos.Models.CommentModelAnguloChristian;
import com.jonmid.quizdos.Models.UserModelAnguloChristian;
import com.jonmid.quizdos.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by CHRISTIAN on 10/10/2017.
 */

public class CommentAdapterAnguloChristian extends RecyclerView.Adapter<CommentAdapterAnguloChristian.ViewHolder> {
    List<CommentModelAnguloChristian> commentList = new ArrayList<>();
    Context context;

    @Override
    public CommentAdapterAnguloChristian.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View item = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_comment_cardview, parent, false);

        // Pasar la vista (item.xml) al ViewHolder
        ViewHolder viewHolder = new ViewHolder(item);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(CommentAdapterAnguloChristian.ViewHolder holder, int position) {
        holder.name.setText(commentList.get(position).getName());
        holder.email.setText(commentList.get(position).getEmail());
        holder.body.setText(commentList.get(position).getBody());
    }

    @Override
    public int getItemCount() {
        return commentList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView name;
        TextView body;
        TextView email;

        ImageView urlimage_user;

        public ViewHolder(View item) {
            super(item);
            name = (TextView) item.findViewById(R.id.id_tv_comment_name);
            body = (TextView) item.findViewById(R.id.id_tv_comment_body);
            email = (TextView) item.findViewById(R.id.id_tv_comment_email);

            urlimage_user = (ImageView) item.findViewById(R.id.id_img_comment_picasso);
        }
    }
}
