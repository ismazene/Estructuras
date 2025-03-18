package org.example.ProgramaMe;

import java.util.Scanner;
import java.util.Stack;

public class Parentesis_Balanceado{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        while (teclado.hasNextLine()) {
            String linea = teclado.nextLine();
            if (estaBien(linea)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
    public static boolean estaBien(String cadena) {
        Stack<Character> pila = new Stack<>();

        int i = 0;
        while (i < cadena.length()) {
            char caracter = cadena.charAt(i);

            if (caracter == '(' || caracter == '{' || caracter == '[') {
                pila.push(caracter);
            } else if (caracter == ')' || caracter == '}' || caracter == ']') {
                if (pila.isEmpty()) {
                    return false;
                }

                char apertura = pila.pop();
                if ((caracter == ')' && apertura != '(') || (caracter == '}' && apertura != '{') || (caracter == ']' && apertura != '[')) {
                    return false;
                }
            }
            i++;
        }
        return pila.isEmpty();
    }
}
