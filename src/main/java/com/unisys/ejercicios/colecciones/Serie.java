package com.unisys.ejercicios.colecciones;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Serie implements Serializable {
    private static final long serialUID = 42L;
    private String titulo;
    private String genero;
    private Integer anyoPublicacion;
    private List<Actor> listadoactores;
}
