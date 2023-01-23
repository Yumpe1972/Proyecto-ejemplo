package com.unisys.ejercicios.herencias;

public class Persona {
    private String nombre;
    public String dni;
    public Integer tlf;

    public Persona(String nombre, String dni, Integer tlf) {
        this.nombre = nombre;
        this.dni = dni;
        this.tlf = tlf;
    }

    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Integer getTlf() {
        return tlf;
    }

    public void setTlf(Integer tlf) {
        this.tlf = tlf;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", tlf=" + tlf +
                '}';
    }
}
