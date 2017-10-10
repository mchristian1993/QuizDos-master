package com.jonmid.quizdos.Parser;

import com.jonmid.quizdos.Models.UserModelAnguloChristian;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by CHRISTIAN on 10/10/2017.
 */

public class UserJsonAnguloChristian {

    public static List<UserModelAnguloChristian> getData(String content) throws JSONException {
        JSONArray jsonArray = new JSONArray(content);
        List<UserModelAnguloChristian> userList = new ArrayList<>();
        for (int i = 0; i < jsonArray.length(); i++) {
            JSONObject item = jsonArray.getJSONObject(i);
            UserModelAnguloChristian user = new UserModelAnguloChristian();
            user.setName(item.getString("name"));
            user.setUsername(item.getString("username"));
            user.setEmail(item.getString("email"));
            user.setPhone(item.getString("phone"));

            JSONObject item1 = item.getJSONObject("address");
            user.setAddress(item1.getString("street"));

            JSONObject item2 = item.getJSONObject("company");
            user.setNamecompany(item2.getString("name"));

            userList.add(user);
        }
        return userList;
    }
}
