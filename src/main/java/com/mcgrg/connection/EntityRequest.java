package com.mcgrg.connection;

import com.github.kevinsawicki.http.HttpRequest;
import com.google.gson.Gson;

import java.lang.reflect.Type;
import java.util.List;

/**
 * Created by MSI GT70 on 18.02.2017.
 */
public class EntityRequest<T> {
    public List<T> setRequest(Type itemListType) {
        List<T> parsegson = null;
        String strRequest = "SELECT * FROM diploma.materials;";
        try {
            HttpRequest request = HttpRequest.post("http://127.0.0.1:8080/ServletDBMySql", true, "sql", strRequest);
            System.out.println(request.code());
            if (request.code()==200) {
                parsegson = new Gson().fromJson(request.body(), itemListType);
            }
        } catch (HttpRequest.HttpRequestException e) {
            e.printStackTrace();
        }
        return parsegson;
    }
}
