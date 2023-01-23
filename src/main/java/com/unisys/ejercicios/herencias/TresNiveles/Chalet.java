package com.unisys.ejercicios.herencias.TresNiveles;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Chalet extends Casa{
    public Integer plantas;

    public Chalet(String direccion, Float metrosCuadrados, Integer plantas) {
        super(direccion, metrosCuadrados);
        this.plantas = plantas;
    }

    @Override
    public String toString() {
        return "Chalet{" +
                "plantas=" + plantas +
                ", direccion='" + direccion + '\'' +
                ", metrosCuadrados=" + metrosCuadrados +
                '}';
    }
}
