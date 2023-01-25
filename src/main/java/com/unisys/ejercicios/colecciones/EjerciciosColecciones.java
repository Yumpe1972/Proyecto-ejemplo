package com.unisys.ejercicios.colecciones;

import java.util.*;

public class EjerciciosColecciones {
    public static void main(String[] args) {
        List<String> listado = new ArrayList<>();
        listado.add("Primer Elemento");
        listado.add("Segundo Elemento");
        System.out.println(listado.get(0));
        for (String i:listado) {
            System.out.println(i);
        }
        listado.remove(1);
        System.out.println(listado);
        // En un Set no podemos coger uno específico
        Set<Integer> numeros = new TreeSet<Integer>();
        numeros.add(4);
        numeros.add(15);
        for (Integer i:numeros){
            System.out.println(i);
        }
        // Declaración mapa de clave Integer y valor String
        Map<Integer,String> objetoMapa = new HashMap<>();
        objetoMapa.put(1,"Primera Propiedad");
        objetoMapa.put(2,"Segunda Propiedad");
        System.out.println(objetoMapa.get(1));
        System.out.println(objetoMapa);
        System.out.println(objetoMapa.values());
        // Obtengo el conjunto de claves del mapa
        Set<Integer> claves = objetoMapa.keySet();
        for (Integer i:claves) {
            System.out.println("Clave " + i + ": " + objetoMapa.get(i));
        }
        //Otra opción. Recoger los valores
        Collection<String> coleccionValores = objetoMapa.values();
        for (String s:coleccionValores) {
            System.out.println(s);
        }

        Actor actor = new Actor();
        actor.setNombre("JB");
        actor.setGeneroFavorito("Comedia");
        actor.setAnyosExperiencia(32);

        Actor actriz = new Actor();
        actriz.setNombre("PC");
        actriz.setGeneroFavorito("Comedia");
        actriz.setAnyosExperiencia(25);
        // Creo de la serie
        List<Actor> listadoActores = new ArrayList<>();
        listadoActores.add(actor);
        listadoActores.add(actriz);

        Serie serie = new Serie();
        serie.setTitulo("Hola");
        serie.setGenero("Drama");
        serie.setListadoactores(listadoActores);
        System.out.println(serie);
    }
}
