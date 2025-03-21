package org.example.mapas;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio2 {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Escribe una palabra...");
        String palabra = teclado.nextLine();

        Map<Character,Integer> mapaLetras = new HashMap<>();

        for (Character letra : palabra.toCharArray()){
            mapaLetras.put(letra,mapaLetras.getOrDefault(palabra,0)+1);
            // mapaLetras.put(palabra,mapaLetras.get(palabra)+1);
        }

        for (Map.Entry<String,Integer> palabra : mapaLetras.entrySet()){
            System.out.println(palabra.getKey() + ":" + palabra.getValue());
        }

    }
}