package com.jonmid.quizdos.Parser;

import com.jonmid.quizdos.Models.CommentModelAnguloChristian;
import com.jonmid.quizdos.Models.UserModelAnguloChristian;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by CHRISTIAN on 10/10/2017.
 */

public class CommentJsonAnguloChristian {

    public static List<CommentModelAnguloChristian> getData(String content) throws JSONException {
        JSONArray jsonArray = new JSONArray(content);
        List<CommentModelAnguloChristian> commentList = new ArrayList<>();
        for (int i = 0; i < jsonArray.length(); i++) {
            JSONObject item = jsonArray.getJSONObject(i);
            CommentModelAnguloChristian comment = new CommentModelAnguloChristian();


           comment.setName(item.getString("name"));
            comment.setEmail(item.getString("email"));
           comment.setBody(item.getString("body"));




            commentList.add(comment);
        }
        return commentList;
    }
}
