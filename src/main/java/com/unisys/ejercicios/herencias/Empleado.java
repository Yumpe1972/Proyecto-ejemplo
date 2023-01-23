package com.unisys.ejercicios.herencias;

public class Empleado extends Persona{

    protected Integer sueldo;
    public String cargo;

    public Empleado(String nombre, String dni, Integer tlf, Integer sueldo, String cargo) {
        super(nombre,dni,tlf);
        this.sueldo = sueldo;
        this.cargo = cargo;
    }

    public Empleado() {
        super();
        this.sueldo=null;
        this.cargo=null;
    }

    public Integer getSueldo() {
        return sueldo;
    }

    public void setSueldo(Integer sueldo) {
        this.sueldo = sueldo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "sueldo=" + sueldo +
                ", cargo='" + cargo + '\'' +
                ", nombre='" + getNombre() + '\'' +
                ", dni='" + dni + '\'' +
                ", tlf=" + tlf +
                '}';
    }
}
