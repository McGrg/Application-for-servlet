package com.mcgrg.connection;

import com.mcgrg.entity.ConstructionSites;
import com.mcgrg.entity.Response;

import java.util.LinkedList;

public class Main {
    public static void main(String[] a) {
        try {
//            Type itemListType = new TypeToken<List<ConstructionSites>>(){}.getType();
//            URL url = new URL("http://127.0.0.1:8080/ServletDBMySql");
//            HttpURLConnection urlconnection = (HttpURLConnection) url.openConnection();
//            BufferedReader br = new BufferedReader(new InputStreamReader(urlconnection.getInputStream()));
//            String s = br.readLine();
//            List<ConstructionSites> parsesites = new Gson().fromJson(s, itemListType );
//            for (ConstructionSites conssite:parsesites){
//                System.out.println(conssite.toString());

//            Type itemListType = new TypeToken<List<Usergroups>>() {
//            }.getType();
//            URL url = new URL("http://127.0.0.1:8080/ServletDBMySql");
//            HttpURLConnection urlconnection = (HttpURLConnection) url.openConnection();
//            List<Usergroups> parseusergroups = new Gson().fromJson(new InputStreamReader(urlconnection.getInputStream()), itemListType);
//            for (Usergroups usergroupr : parseusergroups) {
//                System.out.println(usergroupr.toString());
//            }
            Response resp = new Response();
            LinkedList<ConstructionSites> conslist = resp.getList();
            for (ConstructionSites conssite : conslist) {
                System.out.println(conssite.toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
