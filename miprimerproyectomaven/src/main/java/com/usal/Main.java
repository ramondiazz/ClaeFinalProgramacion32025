package com.usal;
import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        Gson gson = new Gson();
        Persona persona = new Persona("Ramon", "Díaz");
        String personaJSON = gson.toJson(persona);
        System.out.println(personaJSON);
    }
}