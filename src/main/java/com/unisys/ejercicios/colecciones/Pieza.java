package com.unisys.ejercicios.colecciones;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pieza implements Serializable {
    public String nombre;
    public String tipoPieza;


}
