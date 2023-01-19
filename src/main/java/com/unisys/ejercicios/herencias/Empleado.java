package com.unisys.ejercicios.herencias;

public class Empleado extends Persona{

    public Integer sueldo;
    public String cargo;

    public Empleado(String nombre, String dni, Integer tlf, Integer sueldo, String cargo) {
        super();
        this.sueldo = sueldo;
        this.cargo = cargo;
    }

    public Empleado() {
        super();
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
}
