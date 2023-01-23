package com.unisys.ejercicios.herencias;

public class Currito extends Empleado {
    public String jefe;


    public String getJefe() {
        return jefe;
    }

    public void setJefe(String jefe) {
        this.jefe = jefe;
    }



    @Override
    public String toString() {
        return "Currito{" +
                "jefes=" + jefe +
                ", sueldo=" + sueldo +
                ", cargo='" + cargo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", tlf=" + tlf +
                '}';
    }
}
