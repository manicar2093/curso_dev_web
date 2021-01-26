package com.fundamentos.poo;

public class Main {

    public static void main(String[] args) {

        /*
         * Para instanciar una clase se usa la palabra reservada new, el nombre de clase y parentesis. Es importante que la variable sea del mismo tipo que la clase.
         *
         * La palabra instanciar quiere decir que se hara un objeto usando la plantilla x.
         */
        Persona arturo = new Persona();

        /*
            Con el punto podemos acceder a los atributos y metodos que una clase contenga.
         */
        arturo.nombre = "Arturo";
        arturo.edad = 24;
        arturo.peso = 70f;
        arturo.altura = 1.73f;
        arturo.direccion = "Una dirección";

        System.out.println("Persona{nombre: " + arturo.nombre + ", Edad: " + arturo.edad + "}");
        arturo.hablar();


        Persona manuel = new Persona();
        manuel.nombre = "Manuel";
        manuel.edad = 27;
        manuel.peso = 87f;
        manuel.altura = 1.69f;
        manuel.direccion = "Su casa";

        System.out.println("Persona{nombre: " + manuel.nombre + ", Edad: " + manuel.edad + "}");
        manuel.dormir();




    }

}
