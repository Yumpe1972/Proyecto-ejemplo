package com.unisys.ejercicios;

public class Ejercicio05Perro {
    public String raza;

    public Ejercicio05Perro() {
    }

    public Ejercicio05Perro(String raza) {
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Perro{" +
                "raza='" + raza + '\'' +
                '}';
    }
}
