package com.unisys.ejercicios.colecciones;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Actor implements Serializable {
    private static final long serialVersionUID = 1L;
    private String nombre;
    private String generoFavorito;
    private Integer anyosExperiencia;
    private List<Actor> reparto;

    public Actor(String nombre, String generoFavorito, Integer anyosExperiencia, List<Actor> reparto) {
        this.nombre = nombre;
        this.generoFavorito = generoFavorito;
        this.anyosExperiencia = anyosExperiencia;
        this.reparto = reparto;
    }
}
