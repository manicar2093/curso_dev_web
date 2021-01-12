package com.fundamentos.curso.ControlStatements;

public class DoWhile {

    public static void main(String[] args) {
        // do while

        // La diferencia es que se ejecuta primero lo que esta dentro del do y después
        // validara si la condición del while se cumple. Si sí, continua con el código.

        // En este ejemplo podemos ver que imprimira en pantalla el once, pero como
        // no se cumple la condición terminará el programa

        int counter = 520;

        do {

            System.out.println(counter);
            counter++;

        } while (counter <= 10);

        System.out.println(counter);

    }

}
