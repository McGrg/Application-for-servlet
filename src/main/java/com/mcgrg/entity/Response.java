package com.mcgrg.entity;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.LinkedList;

/**
 * Created by MSI GT70 on 17.02.2017.
 */
public class Response<T> {
    public LinkedList<T> getList()

    {
        Type itemListType = new TypeToken<LinkedList<T>>(){}.getType();
        URL url = null;
        LinkedList<T> parsegson = null;
        try {
            url = new URL("http://127.0.0.1:8080/ServletDBMySql");
            HttpURLConnection urlconnection = null;
            urlconnection = (HttpURLConnection) url.openConnection();
            parsegson = new Gson().fromJson(new InputStreamReader(urlconnection.getInputStream()), itemListType);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return parsegson;
    }
}
