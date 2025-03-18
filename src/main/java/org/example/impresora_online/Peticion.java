package org.example.impresora_online;

import lombok.Getter;

@Getter
public class Peticion {

    private String id;
    private String nombre_archivo;

    public Peticion(String id, String nombre_archivo) {
        this.id = id;
        this.nombre_archivo = nombre_archivo;
    }

    @Override
    public String toString() {
        return "Peticion{" + "id='" + id + '\'' + ", nombre_archivo='" + nombre_archivo + '\'' + '}';
    }
}
