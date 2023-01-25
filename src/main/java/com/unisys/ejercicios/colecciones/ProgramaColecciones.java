package com.unisys.ejercicios.colecciones;

import java.util.*;

public class ProgramaColecciones {
    public static void main(String[] args) {
        Pieza p = new Pieza("MiTeclado","Teclado");
        Ordenador o = new Ordenador();
        o.setMarca("Dell");
        o.setModelo("Latitude");
        Set<Pieza> listado = new HashSet<>();
        for ( int i =0;i<4;i++){
            p= new Pieza("Pieza"+i, "Tipo "+i);
            listado.add(p);
        }
        // o.setPiezas(listado);
        System.out.println(o);
        System.out.println(p);
        System.out.println(listado);
        List<Pieza> listadoPiezas = new ArrayList<>(listado);
        Pieza p1 = new Pieza("MiRaton","Raton");
        Pieza p2 = new Pieza("MiDocking","Docking");
        Pieza p3 = new Pieza("MiUSB","USB");
        Pieza p4 = new Pieza("MiHDMI","HDMI");
        listadoPiezas.add(p1);
        listadoPiezas.add(p2);
        listadoPiezas.add(p3);
        listadoPiezas.add(p4);
        Set<Pieza> misPiezas = new HashSet<>(listadoPiezas);
        System.out.println(misPiezas);
        Pieza p5 = new Pieza("MiUSB","USB");
        misPiezas.add(p5);
        System.out.println(misPiezas);
        SortedSet<Pieza> piezasOrdenadas = new TreeSet<>(Comparator.comparing(Pieza::getNombre));
        piezasOrdenadas.add(p1);
        piezasOrdenadas.add(p2);
        piezasOrdenadas.add(p3);
        piezasOrdenadas.add(p4);
        System.out.println(piezasOrdenadas);
        Map<String,String> cliente = new HashMap<>();
        cliente.put("nombre","pepe");
        cliente.put("direccion","mi calle");
        cliente.put("tlf","677665+234");
        cliente.put("email","p@p.com");
        System.out.println(cliente);
        System.out.println(cliente.get("nombre"));
        List<Map<String,String>> listadoMapa = new ArrayList<>();
        listadoMapa.add(cliente);
        /*
            Si utilizo el mismo nombre de map al añadirlo al listado cambio los dos
         */
        cliente.put("nombre","JP");
        cliente.put("direccion","Mi Avenida");
        cliente.put("tlf","911231234");
        cliente.put("email","miemail@dominio.com");
        System.out.println(cliente);
        listadoMapa.add(cliente);
        System.out.println(listadoMapa);
    }
}
