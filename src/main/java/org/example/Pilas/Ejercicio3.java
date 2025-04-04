package org.example.Pilas;

import java.util.Stack;

public class Ejercicio3 {
    public static void main(String[] args) {
        String[] casosDePrueba = {
                "({[]})()",
                ":)",
                "{[()()]}",
                "({[})",
                "{[",
                "()",
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
