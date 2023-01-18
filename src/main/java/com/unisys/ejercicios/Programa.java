package com.unisys.ejercicios;

public class Programa {
    public static void main(String[] args) {
        Perro toby = new Perro();
        toby.raza="Terrier";
        Perro otto = new Perro();
        otto.raza="Pastor Alemán";
        System.out.println(toby.raza);
        System.out.println(otto.raza);
        Perro fluky = new Perro("Pastor de aguas");
        fluky.setRaza("Bulldog");
        System.out.println(fluky.getRaza());
        System.out.println(toby.toString());
        System.out.println(otto.toString());
        System.out.println(fluky.toString());
    }
}
