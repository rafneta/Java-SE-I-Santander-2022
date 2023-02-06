package org.bedu.java.jse.basico.sesion6.ejemplo3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class Colecciones {
    public static void main(String[] args) {
        // asi es como se crea la interfaz de list
        List<String> listaCadenas = new ArrayList<>();

        listaCadenas.add("uno");
        listaCadenas.add("dos");
        listaCadenas.add("tres");
        listaCadenas.add("tres");
        listaCadenas.add("cuatro");
        listaCadenas.add("cinco");

        // primera forma del for
        for (int i = 0; i < listaCadenas.size(); i++) {
            System.out.println(listaCadenas.get(i));
        }



        // form preferida del for para estos casos
        for (String cadena : listaCadenas){
            System.out.println(cadena);
        }

        System.out.println("fin listas -------------");

        Set<String> setCadenas = new HashSet<>();

        setCadenas.add("uno");
        setCadenas.add("dos");
        setCadenas.add("tres");
        setCadenas.add("tres");
        setCadenas.add("cuatro");
        setCadenas.add("cinco");

        for (String cadena : setCadenas){
            System.out.println(cadena);
        }

        System.out.println("fin set -------------");

        List<Numero> listaNumeros = new ArrayList<>();
        listaNumeros.add(new Numero("uno"));
        listaNumeros.add(new Numero("dos"));
        listaNumeros.add(new Numero("tres"));
        listaNumeros.add(new Numero("tres"));
        listaNumeros.add(new Numero("cuatro"));
        listaNumeros.add(new Numero("cinco"));

        for (Numero numero : listaNumeros){
            System.out.println(numero.getNombre());
        }

        System.out.println("fin listanumeros -------------");

        Set<Numero> setNumeros = new HashSet<>();
        setNumeros.add(new Numero("uno"));
        setNumeros.add(new Numero("dos"));
        setNumeros.add(new Numero("tres"));
        setNumeros.add(new Numero("tres"));
        setNumeros.add(new Numero("cuatro"));
        setNumeros.add(new Numero("cinco"));

        for (Numero numero : setNumeros){
            System.out.println(numero.getNombre());
        }

        System.out.println("fin setnumeros -------------");






    }
}
