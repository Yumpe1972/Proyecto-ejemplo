package com.unisys.ejercicios;

public class Ejercicio04 {
    public static void main(String[] args){
        String saludo = "Hola";
        System.out.println(saludo.length());
        System.out.println(saludo.charAt(3));
        System.out.println(saludo.toUpperCase());
        System.out.println(saludo.toLowerCase());
        System.out.println(saludo.indexOf("l"));
        String saludo2 ="Adios";
        if (saludo.equals(saludo2))
            System.out.println("Son iguales");
        else
            System.out.println("NO son iguales");
    }
}
