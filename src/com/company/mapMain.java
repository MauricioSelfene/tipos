package com.company;

import java.util.HashMap;
import java.util.Map;

public class mapMain {

    public static void main(String[] args) {

        Map <String, String> personas = new HashMap<>();

        personas.put("11111111-1", "Nombre Persona 1");
        personas.put("11111111-2", "Nombre Persona 2");
        personas.put("11111111-3", "Nombre Persona 3");

        System.out.println(personas);

        for(String key : personas.keySet()){
            System.out.println(key);
        }

        for(String value : personas.values()){
            System.out.println(value);
        }

        for (Map.Entry<String, String> pair : personas.entrySet()){
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }
}
