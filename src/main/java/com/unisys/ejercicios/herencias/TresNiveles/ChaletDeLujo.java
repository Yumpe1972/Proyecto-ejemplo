package com.unisys.ejercicios.herencias.TresNiveles;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
public class ChaletDeLujo extends Chalet{
    public Integer banyos;

    public ChaletDeLujo() {
        this.banyos = 0;
    }

    public ChaletDeLujo(String direccion, Float metrosCuadrados, Integer plantas, Integer banyos) {
        super(direccion, metrosCuadrados, plantas);
        this.banyos = banyos;
    }

    @Override
    public String toString() {
        return "ChaletDeLujo{" +
                "banyos=" + banyos +
                ", plantas=" + plantas +
                ", direccion='" + direccion + '\'' +
                ", metrosCuadrados=" + metrosCuadrados +
                '}';
    }
}
