package org.example.mapas;

import java.util.HashMap;

public class Pruebas {
    public static void main(String[] args) {
        HashMap<String,Integer> mapaNotas = new HashMap<>();

        mapaNotas.put("Ismael",3);
        mapaNotas.put("David", 5);
        mapaNotas.put("Antonio", 1);
        mapaNotas.put("Cesar", 5);

        System.out.println(mapaNotas);

        mapaNotas.put("Ismael" , 6);
        System.out.println(mapaNotas.get("Ismael"));

        mapaNotas.remove("Antonio");
        System.out.println(mapaNotas);

        if (mapaNotas.containsKey("Cesar")){
            System.out.println("Cesar existe");
        }
        if (mapaNotas.containsValue(10)){
            System.out.println("OLEEE alguien tiene 10");
        }

        System.out.println(mapaNotas.keySet());
        System.out.println(mapaNotas.values());

        for (String claves : mapaNotas.keySet()){
            System.out.println("Clave: " + claves);
        }
        for (Integer notas : )
    }
}
