package org.example;

public class Main {
    public static void main(String[] args) {
        User user = new User("Liudmyla", "Levchuk");
        ConvertToJson convertToJson = new ConvertToJson();
        String userToJson = convertToJson.toJson(user);
        System.out.println(userToJson);
    }
}