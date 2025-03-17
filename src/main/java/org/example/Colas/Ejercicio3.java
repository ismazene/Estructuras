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

    // Metodo que verifica si la cadena está balanceada
    public static boolean estaBalanceada(String cadena) {
        Stack<Character> pila = new Stack<>();

        // Iterar sobre cada carácter de la cadena
        for (char caracter : cadena.toCharArray()) {
            // Si es un delimitador de apertura, lo agregamos a la pila
            if (caracter == '(' || caracter == '{' || caracter == '[') {
                pila.push(caracter);
            }
            // Si es un delimitador de cierre, verificamos que sea el correspondiente
            else if (caracter == ')' || caracter == '}' || caracter == ']') {
                if (pila.isEmpty()) {
                    return false; // No hay elemento para cerrar
                }

                char apertura = pila.pop();
                if (!esCorrespondiente(apertura, caracter)) {
                    return false; // No corresponde el tipo de cierre
                }
            }
        }

        // Si la pila está vacía, todos los delimitadores fueron correctamente balanceados
        return pila.isEmpty();
    }

    // Metodo que verifica si un delimitador de apertura corresponde con un cierre
    public static boolean esCorrespondiente(char apertura, char cierre) {
        return (apertura == '(' && cierre == ')') ||
                (apertura == '{' && cierre == '}') ||
                (apertura == '[' && cierre == ']');
    }
}
