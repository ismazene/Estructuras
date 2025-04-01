package org.example.iteradores;

public class Empresa {
    private String nombre;
    private int empleados;

    public Empresa(int empleados, String nombre) {
        this.empleados = empleados;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Empresa{" + "nombre='" + nombre + '\'' + ", empleados=" + empleados + '}';
    }
}

