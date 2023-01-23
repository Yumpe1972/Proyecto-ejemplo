package com.unisys.ejercicios.herencias.TresNiveles;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
public class Piso extends Casa{
    public Integer numeroPiso;

    public Piso() {
        super();
        this.numeroPiso = 0;
    }

    public Piso(String direccion, Float metrosCuadrados, Integer numeroPiso) {
        super(direccion, metrosCuadrados);
        this.numeroPiso = numeroPiso;
    }

    @Override
    public String toString() {
        return "Piso{" +
                "numeroPiso=" + numeroPiso +
                ", direccion='" + direccion + '\'' +
                ", metrosCuadrados=" + metrosCuadrados +
                '}';
    }
}
