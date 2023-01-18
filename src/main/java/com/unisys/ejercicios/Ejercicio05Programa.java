package com.unisys.ejercicios;

public class Ejercicio05Programa {
    public static void main(String[] args) {
        Ejercicio05Perro toby = new Ejercicio05Perro();
        toby.raza="Terrier";
        Ejercicio05Perro otto = new Ejercicio05Perro();
        otto.raza="Pastor Alemán";
        System.out.println(toby.raza);
        System.out.println(otto.raza);
        Ejercicio05Perro fluky = new Ejercicio05Perro("Pastor de aguas");
        fluky.setRaza("Bulldog");
        System.out.println(fluky.getRaza());
        System.out.println(toby.toString());
        System.out.println(otto.toString());
        System.out.println(fluky.toString());
    }
}
