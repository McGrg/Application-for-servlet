package com.mcgrg.connection;

import com.google.gson.reflect.TypeToken;
import com.mcgrg.entity.Materials;

import java.util.List;

public class Main {
    public static void main(String[] a) {
//        try {
//            Type itemListType = new TypeToken<List<ConstructionSites>>() {
//            }.getType();
//            URL url = new URL("http://127.0.0.1:8080/ServletDBMySql");
//            HttpURLConnection urlconnection = (HttpURLConnection) url.openConnection();
//            BufferedReader br = new BufferedReader(new InputStreamReader(urlconnection.getInputStream()));
//            String s = br.readLine();
//            List<ConstructionSites> parsesites = new Gson().fromJson(s, itemListType);
//            for (ConstructionSites conssite : parsesites) {
//                System.out.println(conssite.toString());
//            Type itemListType = new TypeToken<List<Usergroups>>() {
//            }.getType();
//            URL url = new URL("http://127.0.0.1:8080/ServletDBMySql");
//            HttpURLConnection urlconnection = (HttpURLConnection) url.openConnection();
//            List<Usergroups> parseusergroups = new Gson().fromJson(new InputStreamReader(urlconnection.getInputStream()), itemListType);
//            for (Usergroups usergroupr : parseusergroups) {
//                System.out.println(usergroupr.toString());
//            }
//            EntityListResponce<Materials> resp = new EntityListResponce<>();
//            LinkedList<Materials> conslist = resp.getList(new TypeToken<LinkedList<Materials>>() {
//            }.getType());
//            for (Materials conssite : conslist) {
//                System.out.println(conssite.toString());
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        EntityRequest er = new EntityRequest();
        List<Materials> materialslist = er.setRequest(new TypeToken<List<Materials>>(){}.getType());
        for (Materials mat :  materialslist) {
            System.out.println(mat.toString());
        }
    }
}
