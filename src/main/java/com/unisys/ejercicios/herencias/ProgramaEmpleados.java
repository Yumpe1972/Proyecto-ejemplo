package com.unisys.ejercicios.herencias;

public class ProgramaEmpleados {
    public static void main(String[] args) {
        Empleado numero1 = new Empleado();
        System.out.println(numero1);
        Empleado numero2 = new Empleado("Pepe","43201333A",965123456,20000,"MP");
        System.out.println(numero2);
        numero1.setNombre("Patricia");
        numero1.setDni("26725645Z");
        numero1.setCargo("FC");
        numero1.setTlf(965324331);
        numero1.setSueldo(190000);
        System.out.println("Nombre empleados: " + numero1.getNombre() + ", " + numero2.getNombre());
        Jefe jefe1 = new Jefe();
        System.out.println(jefe1);
        jefe1.setNombre("MP");
        jefe1.cargo = "Brown dispatcher";
        jefe1.sueldo = 10000;
        jefe1.dni="11111111A";
        jefe1.tlf=666999234;
        System.out.println(jefe1);
        Currito currito1 = new Currito();
        System.out.println(currito1);
        currito1.setJefe("FC");
        currito1.sueldo=15000;
        System.out.println(currito1);
    }
}
