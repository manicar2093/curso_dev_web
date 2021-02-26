package com.fundamentos.poo.interfaces.pt2;

public class Main {

    public static void main(String[] args) {
        Empleado e1 = new Empleado();

        /*
            Las interfaces no se pueden instanciar, pero se pueden usar como un tipo de dato. Recuerda que las interfaces solo declaran comportamiento.

            Vendedor v1 = new Vendedor(); // Esto marca un error
         */

        Vendedor v1 = new Empleado();

        v1.vender("Laptop", "El Mijin");
        v1.cargar(new String[]{"Lápices","Cuadernos", "Plumas"});

        Vendedor v2 = new CarritoDePapas();

        v2.vender("Chicharrones", "Un niño");
        v2.cargar(new String[]{"Papas", "Chicharrones", "Tones"});


    }
}
