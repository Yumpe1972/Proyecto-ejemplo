package com.unisys.ejercicios;

public class Ejercicio02 {
    public static void main(String[] args) {
        /*
            Bucle while
         */
        int i=0;
        while (i<=10){
            System.out.println("Vuelta numero: " + i);
            i++;
        }
        /*
            Bucle do
         */
        i=0;
        do {
            i++;
            System.out.println("DO WHILE, Vuelta numero: " + i);
        } while (i<10);
        for(i=0;i<10;i++){
            System.out.println("FOR, Vuelta numero: " + (i+1));
        }
        int edad=21;
        if (edad>=18){
            System.out.println("Con " + edad + " años se puede conducir");
        }
        else{
            System.out.println("Con " + edad + " años NO PUEDES conducir");
        }
        switch (edad){
            case 18:
                System.out.println("Puedes conducir");
                break;
            case 21:
                System.out.println("Puedes beber en USA");
                break;
            default:
                System.out.println("Tu edad es de: " + edad);
                break;
        }
        /*
            Bucle while con salida break y continue
         */
        i=1;
        while (i<=10){
            System.out.println("Vuelta numero: " + i);
            i++;
        }
    }
}
