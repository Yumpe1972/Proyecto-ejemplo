package com.unisys.ejercicios.herencias;

import java.util.Arrays;

public class Currito extends Empleado {
    public Empleado jefes[];

    @Override
    public String toString() {
        return "Currito{" +
                "jefes=" + Arrays.toString(jefes) +
                ", sueldo=" + sueldo +
                ", cargo='" + cargo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", tlf=" + tlf +
                '}';
    }
}
