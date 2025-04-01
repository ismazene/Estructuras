package org.example.iteradores;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class Pruebas {

    public static void main(String[] args) {

        LinkedList<String> empresas = new LinkedList<>(Arrays.asList("NTT","DXC","CALCONUT","ICAROCLOUD"));

        Iterator<String> it = empresas.iterator();

        while (it.hasNext()){
            String empresa = it.next();
            if (empresa.equals("DXC")){
                it.remove();
            }
        }
        System.out.println(empresas);

        ArrayList<Empresa> listaEmpresas = new ArrayList<>();
        listaEmpresas.add(new Empresa(6, "NTT"));

    }
}
