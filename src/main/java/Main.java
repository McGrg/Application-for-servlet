import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class Main {
    public static void main(String[] a) {
        try {
            Type itemListType = new TypeToken<List<ConstructionSites>>(){}.getType();
            URL url = new URL("http://127.0.0.1:8080/simple");
            HttpURLConnection urlconnection = (HttpURLConnection) url.openConnection();
            BufferedReader br = new BufferedReader(new InputStreamReader(urlconnection.getInputStream()));
            String s = br.readLine();
            List<ConstructionSites> parsesites = new Gson().fromJson(s, itemListType );
            for (ConstructionSites canssite:parsesites){
                System.out.println(canssite.toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
