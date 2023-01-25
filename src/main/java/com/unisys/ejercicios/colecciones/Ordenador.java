package com.unisys.ejercicios.colecciones;

import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ordenador implements Serializable {
    private String marca;
    private String modelo;

    //private Set<Pieza> piezas;
    private List<Pieza> listadopieza;

    public Ordenador(String marca, String modelo, List<Pieza> listadopieza) {
        this.marca = marca;
        this.modelo = modelo;
        this.listadopieza = listadopieza;
    }

    public Ordenador() {
        this.marca="";
        this.modelo="";
//        this.listadopieza = new List<Pieza> for (Pieza pieza : listadopieza) {

    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public List<Pieza> getPiezas() {
        return listadopieza;
    }

    public void setPiezas(List<Pieza> listadopieza) {
        this.listadopieza = listadopieza;
    }
    @Override
    public String toString() {
        return "Ordenador{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
