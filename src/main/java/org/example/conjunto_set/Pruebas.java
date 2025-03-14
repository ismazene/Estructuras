package org.example.conjunto_set;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Pruebas {
    public static void main(String[] args){

        Set<String> conjunto = new HashSet<>();

        conjunto.add("Agost FC");
        conjunto.add("Monnegre FC");
        conjunto.add("Socarrats FC");
        conjunto.add("Gimnastic de San Vicente");
        conjunto.add("Agosto FC");

        System.out.println(conjunto);

        Set<Integer> conjunto_adds = new LinkedHashSet<>();

        conjunto_adds.add(10);
        conjunto_adds.add(5);
        conjunto_adds.add(8);
        conjunto_adds.add(34);
        conjunto_adds.add(8);

        System.out.println(conjunto_adds);


        Set<String> conjunto_orden = new TreeSet<>();

        conjunto_orden.add("Solan de cabras");
        conjunto_orden.add("Font Vella");
        conjunto_orden.add("Bezoya");
        conjunto_orden.add("Lanjaron");
        conjunto_orden.add("Bezoya");

        System.out.println(conjunto_orden);
    }
}
