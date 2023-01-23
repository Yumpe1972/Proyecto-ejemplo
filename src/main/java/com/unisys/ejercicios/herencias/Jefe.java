package com.unisys.ejercicios.herencias;

public class Jefe extends Empleado{
    public Integer miembrosGrupo;

    public Integer getMiembrosGrupo() {
        return miembrosGrupo;
    }

    public void setMiembrosGrupo(Integer miembrosGrupo) {
        this.miembrosGrupo = miembrosGrupo;
    }

    @Override
    public String toString() {
        return "Jefe{" +
                "miembrosGrupo=" + miembrosGrupo +
                ", sueldo=" + sueldo +
                ", cargo='" + cargo + '\'' +
                ", nombre='" + getNombre() + '\'' +
                ", dni='" + dni + '\'' +
                ", tlf=" + tlf +
                '}';
    }

}
