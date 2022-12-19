package org.example;
import com.google.gson.Gson;

public class ConvertToJson {

    public String toJson (User user) {
        Gson gson = new Gson();
        return gson.toJson(user);
    }
}
