package com.unisys.ejercicios;

import java.util.Arrays;

public class Ejercicio03 {
    /*
        Definir array
        Inicializar
        Recorrer
        Mostrar valores
    */
    public static void main(String[] args){
        int[] miArray = new int[4];
        miArray[0]=1;
        miArray[1]=2;
        miArray[2]=3;
        miArray[3]=4;
        /*
            Con for
         */
        for (int i=0;i<4;i++){
            System.out.println("FOR Valor de la posición " + i + " de mi array es: " +miArray[i]);
        }
        /*
            Con while
         */
        int j = 0;
        while (j<4) {
            System.out.println("WHILE Valor de la posición " + j + " de mi array es: " + miArray[j]);
            j++;
        }
        /*
            Con Do While
         */
        int k=0;
        do {
            System.out.println("DO WHILE Valor de la posición " + k + " de mi array es: " + miArray[k]);
            k++;
        } while(k<4);
        /*
            Bucle de 2000
        */
        int elementos=0;
        float[] flotantes = new float[2000];
        Arrays.fill(flotantes,0f);
        flotantes[1]=7.3f;
        System.out.println(flotantes[1]);
        for (float valor:flotantes){
            elementos++;
        }
        System.out.println("El número de elementos del array es: " + elementos);
    }
}
