package org.example.conjunto_set;
import java.util.*;

public class Ejercicio1 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        Set<String> frase_dividida = new HashSet<>();

        System.out.println("Ingresa una frase");
        String frase = teclado.nextLine();

        String[] frase_vector = frase.split(" ");

        for (int i = 0; i < frase_vector.length; i++) {
            frase_dividida.add(frase_vector[i]);
        }
        System.out.println(frase_dividida);
    }
}

