package com.fundamentos.poo.modificadoresAcceso;

public class Main {

    public static void main(String[] args) {

        Computadora c1 = new Computadora();
        //c1.marca = "HP";
        c1.modelo = "MX0091-LP";
        c1.precio = 90;
        c1.os = "";
        c1.prender();

        c1.setMarca("HP");
        System.out.println("tengo una computadora " + c1.getMarca());

        Calculadora.sumar(2,3);
        System.out.println(Calculadora.mensaje);


    }

}
