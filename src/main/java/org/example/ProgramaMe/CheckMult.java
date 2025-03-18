package org.example.ProgramaMe;

import java.util.Scanner;

public class CheckMult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int n = scanner.nextInt();
            if (n == 0) {
                break;
            }

            String resultado = checkmult(n, 0);
            System.out.println(resultado);
        }

    }
    public static String checkmult(int n, int ceros) {
        if (n < 10) {
            return n + "" + ceros;
        }
        int p = 1;
        int i = n;

        while (i > 0) {
            int digito = i % 10;
            if (digito == 0) {
                ceros++;
            } else {
                p *= digito;
            }
            i /= 10;
        }

        if (p < 10) {
            return p + "" + ceros;
        } else {
            return checkmult(p, ceros);
        }
    }
}
