package com.unisys.ejercicios.herencias.TresNiveles;

public class CasaApp {
    public static void main(String[] args) {
        Casa primeraCasa = new Casa();
        System.out.println(primeraCasa);
        Chalet chalet = new Chalet();
        System.out.println(chalet);
        chalet.setDireccion("Madrid");
        chalet.setMetrosCuadrados(120.0F);
        chalet.setPlantas(2);
        System.out.println(chalet);
        chalet = new Chalet("Madrid", 120F, 2);
        System.out.println(chalet);
        Piso piso = new Piso();
        System.out.println(piso);
        piso = new Piso("Madrid", 120F, 6);
        System.out.println(piso);
        ChaletDeLujo chaletDeLujo = new ChaletDeLujo();
        System.out.println(chaletDeLujo);
        chaletDeLujo = new ChaletDeLujo("Madrid", 120.0F, 2, 5);
        System.out.println(chaletDeLujo);
    }
}
