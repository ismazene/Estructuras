package org.example.mapas;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio2 {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Escribe una palabra...");
        String palabra = teclado.nextLine();

        Map<Character, Integer> mapaLetras = new HashMap<>();

        for (Character letra : palabra.toCharArray()) {
            mapaLetras.put(letra, mapaLetras.getOrDefault(letra, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entrada : mapaLetras.entrySet()) {
            System.out.println(entrada.getKey() + ": " + entrada.getValue());
        }
    }
}
