package org.example.funcionario;

public class Informe {

    private String tipo;
    private int codigo;
    private String descripcion;

    public Informe(int codigo, String tipo, String descripcion) {
        this.codigo = codigo;
        this.tipo = tipo;
        this.descripcion = descripcion;
    }

    public int getCodigo() {
        return codigo;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "Tipo: " + tipo + ", Código: " + codigo + ", Descripción: " + descripcion;
    }


}
