package com.unisys.ejercicios.herencias.TresNiveles;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
public class Casa {
    public String direccion;
    public Float metrosCuadrados;

    public Casa() {
        direccion="";
        metrosCuadrados=0.0f;
    }
}
