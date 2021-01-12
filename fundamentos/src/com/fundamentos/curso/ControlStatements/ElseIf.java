package com.fundamentos.curso.ControlStatements;

import java.util.Scanner;

public class ElseIf {

    public static void main(String[] args) {

        // else if
        // Nos permite realizar diferentes validaciones para que, cuando se cumpla alguna de ellas
        // se termina la validación.
        // Se puede agregar un else para cachar cuando ninguna de las validaciones se cumplió.

        int edad = 90;

        if(edad == 0 || edad == 3) {

            System.out.println("Eres un bebé");

        } else if(edad == 4 || edad == 11) {

            System.out.println("Eres un niño chiquito");

        } else if(edad == 12 || edad == 21) {

            System.out.println("Eres un adolecente");

        } else {
            System.out.println("No sabemos que onda con tu edad");
        }

        System.out.println("Saliendo del else if");



    }
}
