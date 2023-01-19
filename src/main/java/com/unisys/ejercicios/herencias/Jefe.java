package com.unisys.ejercicios.herencias;

import java.util.Arrays;

public class Jefe extends Empleado{
    public Empleado miembroGrupo[];

    public Empleado[] getMiembroGrupo() {
        return miembroGrupo;
    }

    public void setMiembroGrupo(Empleado[] miembroGrupo) {
        this.miembroGrupo = miembroGrupo;
    }

    @Override
    public String toString() {
        return "Jefe{" +
                "miembroGrupo=" + Arrays.toString(miembroGrupo) +
                ", sueldo=" + sueldo +
                ", cargo='" + cargo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", tlf=" + tlf +
                '}';
    }
}
