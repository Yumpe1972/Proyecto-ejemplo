package com.unisys.ejercicios.colecciones;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ProgramaColecciones {
    public static void main(String[] args) {
        Pieza p = new Pieza("MiTeclado","Teclado");
        Ordenador o = new Ordenador();
        o.setMarca("Dell");
        o.setModelo("Latitude");
        Set<Pieza> listado = new HashSet<>();
        for ( int i =0;i<4;i++){
            p= new Pieza("Pieza", "Tipo "+i);
            listado.add(p);
        }
        o.setPiezas(listado);
        System.out.println(o);
        System.out.println(p.);
        System.out.println(listado);
        List<Pieza> listadoPiezas = new ArrayList<>(listado);

    }
}
