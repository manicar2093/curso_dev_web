package com.fundamentos.poo;

public class Persona {

    /*
        Atributos o caracteristicas
     */
    String nombre;
    int edad;
    String direccion;
    float altura;
    float peso;

    /*
        Comportamiento o metodos
     */

    public void hablar() {
        System.out.println("Hola que hace, me llamo " + this.nombre);
    }

    public void dormir() {
        System.out.println("Me llamo " + this.nombre +" y estoy durmiendo");
    }

    public void comer() {
        System.out.println("Estoy comiendo");
    }

}