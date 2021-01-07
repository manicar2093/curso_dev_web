package com.fundamentos.curso.TiposDatos;

public class TipoDeDatos {

    public static void main(String[] args) {

        //
        // Tipos de datos Primitivos
        //

        /*
            Todos se escriben con minuscula! :O

            int Valores enteros
            long Valores enteros

            boolean true o false 1 y 0

            float Valores con punto flotante.
            double Valores con punto flotante.

            char Valores de un byte de tamaño. Character
         */

        //
        // Declaración de variables.
        //


        int anio; // Especifica un variable de tipo entero. Aparta un espacio en memoria.
        // nombres de variables sin caracteres especiales.
        int edad = 12; // Especifica un variable de tipo entero.


        // Los char se declaran con comillas simples
        char gender = 'M';

        //
        // String
        //

        // Nota: String -> Es un conjunto de chars. Array.
        String cadena = "Esto es una cadena";
        String vacio = "";
        String nulo = null;

        //
        // Imprimir en pantalla
        //


        // print Imprime el contenido, pero no agrega nada.
        System.out.print("Hola desde print");

        // println Imprime el contenido y le agreaga un salto de linea \n.
        // Es como si hicieras un print con \n al final
        System.out.println("Hola desde println");
        System.out.print("Hola desde print con enter \n");
        System.out.println(":3");

        System.out.print("te amo \t baby \n");




    }

}
