package org.example.Colas;

import java.util.Stack;

public class Ejercicio3 {
    public static void main(String[] args) {
        // Simulación de entrada de diferentes casos de prueba
        String[] casosDePrueba = {
                "({[]})()",  // Esperado: YES
                ":)",         // Esperado: NO
                "{[()()]}",   // Esperado: YES
                "({[})",      // Esperado: NO
                "{[",         // Esperado: NO
                "()",         // Esperado: YES
        };

        for (String prueba : casosDePrueba) {
            System.out.println(estaBalanceada(prueba) ? "YES" : "NO");
        }
    }

    public static boolean estaBalanceada(String cadena) {
        Stack<Character> pila = new Stack<>();

        for (char caracter : cadena.toCharArray()) {
            if (caracter == '(' || caracter == '{' || caracter == '[') {
                pila.push(caracter);
            }
            else if (caracter == ')' || caracter == '}' || caracter == ']') {
                if (pila.isEmpty()) {
                    return false;
                }

                char apertura = pila.pop();
                if (!esCorrespondiente(apertura, caracter)) {
                    return false;
                }
            }
        }

        return pila.isEmpty();
    }

    public static boolean esCorrespondiente(char apertura, char cierre) {
        return (apertura == '(' && cierre == ')') || (apertura == '{' && cierre == '}') || (apertura == '[' && cierre == ']');
    }
}
