package org.example.funcionario;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Informe> pila = new Stack<>();

        agregarInforme(pila, 1, "ADMINISTRATIVO", "Tarea 1");
        agregarInforme(pila, 3, "perro", "Tarea inválida");
        agregarInforme(pila, 4, "ADMINISTRATIVO", "Tarea 4");
        agregarInforme(pila, 5, "EMPRESARIAL", "Tarea 5");
        agregarInforme(pila, 6, "PERSONAL", "Tarea 6");

        System.out.println("Contenido inicial de la pila:");
        System.out.println(pila);
        System.out.println("");


        //Recorre toda la pila y va borrando las cosas que hay dentro de ella.
        while (!pila.isEmpty()) {
            System.out.println("Eliminando elementos de la pila " + pila.pop());
        }

        agregarInforme(pila, 7, "EMPRESARIAL", "Tarea 7");
        agregarInforme(pila, 8, "PERSONAL", "Tarea 8");
        agregarInforme(pila, 9, "ADMINISTRATIVO", "Tarea 9");

        System.out.println("");
        System.out.println("Contenido de la pila después de agregar mas informes:");
        System.out.println(pila);

    }

    //Recibe una pila de Informes previamente creádo
    private static void agregarInforme(Stack<Informe> pila, int codigo, String tipo_informe, String descripcion) {
        if (tipo_informe.equalsIgnoreCase("ADMINISTRATIVO") || tipo_informe.equalsIgnoreCase("EMPRESARIAL") || tipo_informe.equalsIgnoreCase("PERSONAL")) {
            pila.push(new Informe(codigo, tipo_informe, descripcion));
        } else {
            System.out.println("");
            System.out.println("El tipo de informe " + tipo_informe + " no es valido.");
        }
    }
}
