package org.example.impresora_online;

import java.util.LinkedHashSet;
import java.util.Set;

public class AppImpresora {
    private static final String ID_PC = "PC1234";
    static LinkedHashSet<Peticion> colaPeticiones = new LinkedHashSet<>();

    public static void main(String[] args) {

        anyadirDocumento("prueba.pdf");
        anyadirDocumento("prueba.txt");
        anyadirDocumento("expediente.pdf");
        anyadirDocumento("notas.pdf");
        anyadirDocumento("expediente.pdf");
        imprimirDocumento();
        System.out.println(colaPeticiones);
        getNumPeticiones();
        verTodo();
        imprimirTodo();
    }

    public static void anyadirDocumento(String nombre_archivo) {
        if (nombre_archivo.endsWith(".pdf")) {
            if (colaPeticiones.add(new Peticion(ID_PC, nombre_archivo))) {
                System.out.println("Archivo " +  nombre_archivo + " añadido a la cola de impresion");
            } else {
                System.out.println("El archivo " + nombre_archivo + "no se que mas");
            }
        } else {
            System.out.println("El formato es erroneo");
        }
    }
    public static void imprimirDocumento(){
        System.out.println("Imprimiendo... " + colaPeticiones.getFirst().getNombre_archivo());
        System.out.println(colaPeticiones.removeFirst());
    }
    public static int getNumPeticiones(){
        return colaPeticiones.size();
    }
    public static void verTodo(){
        System.out.println("Cola de impresion " + colaPeticiones);
    }
    public static void imprimirTodo(){
        while (!colaPeticiones.isEmpty()){
            imprimirDocumento();    
        }
        System.out.println("La cola ha terminado");
    }
}
