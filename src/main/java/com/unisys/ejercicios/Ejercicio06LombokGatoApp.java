package com.unisys.ejercicios;

public class Ejercicio06LombokGatoApp {
    public static void main(String[] args) {
        Ejercicio06LombokGato gatito = new Ejercicio06LombokGato();
        System.out.println(gatito);
        gatito.setNombre("Orejas");
        gatito.setApellido1("grandes");
        gatito.setApellido2("y tiesas");
        gatito.setEdad(4);
        System.out.println(gatito);
        Ejercicio06LombokGato gatazo = new Ejercicio06LombokGato("Paco","Perez","Urizaburru",6);
        System.out.println(gatazo);
    }
}
