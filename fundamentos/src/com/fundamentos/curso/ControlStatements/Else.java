package com.fundamentos.curso.ControlStatements;

public class Else {

    public static void main(String[] args) {

        // else == si no

        int edad = 60;

        if(edad >= 18 && edad <= 40) {

            System.out.println("Eres mayor de edad y tienes menos de 40");

        } else {

            System.out.println("No eres mayor de edad o eres un ruco mayor a 40");

        }

        System.out.println("If Else validado");
    }

}
