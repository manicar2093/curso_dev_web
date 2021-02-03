package com.fundamentos.poo.constructores;

public class Main {

    public static void main(String[] args) {
        Computadora c1 = new Computadora("AMD", 8000);
        System.out.println(c1.getProcessor());
        System.out.println(c1.getRam());
        System.out.println(c1.getMonitor());
        System.out.println(c1.getSsd());

        System.out.println();
        System.out.println();

        Computadora c2 = new Computadora("Kingston", "Sony");
        System.out.println(c2.getProcessor());
        System.out.println(c2.getRam());
        System.out.println(c2.getSsd());
        System.out.println(c2.getMonitor());

        Computadora compuVacia = new Computadora();
    }

}
