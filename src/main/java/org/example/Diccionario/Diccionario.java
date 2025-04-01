package org.example.Diccionario;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Diccionario {
    // Propiedad del diccionario (HashMap) para almacenar las palabras en español e inglés
    private Map<String, String> diccionario;

    // Constructor que inicializa el diccionario como un HashMap vacío
    public Diccionario() {
        this.diccionario = new HashMap<>();
    }

    // Metodo para agregar una nueva pareja de palabras (español, inglés)
    public void nuevoPar(String espanol, String ingles) {
        diccionario.put(espanol, ingles);
    }

    // Metodo para traducir una palabra en español a inglés
    public String traduce(String espanol) {
        return diccionario.getOrDefault(espanol, "No se encuentra la palabra");
    }

    // Metodo para obtener una palabra aleatoria en español del diccionario
    public String palabraAleatoria() {
        Object[] palabras = diccionario.keySet().toArray();
        Random rand = new Random();
        return (String) palabras[rand.nextInt(palabras.length)];
    }

    // Metodo para obtener la primera letra de la traducción en inglés de una palabra en español
    public char primeraLetraTraduccion(String espanol) {
        String traduccion = diccionario.get(espanol);
        if (traduccion != null && !traduccion.isEmpty()) {
            return traduccion.charAt(0);
        }
        return ' ';
    }
}
