package com.fundamentos.curso.Operators;

public class Operators {

    public static void main(String[] args) {

        // Operadores Aritmeticos

        // Suma
        int a = 1;
        int b = 2;

        int total = a+b; // 3

        float c = 2.8f;
        float d = 27.9f;

        float total2 = c + d;

        // La concatenación tiene un costo de memoria alto

        String nombre = "Mijin";
        String apellido = ":3";
        String resultado = nombre + apellido; // El resulta do sumar 2 String es concatenación Mijin:3


        // Resta

        // No se pueden restar los string, los booleanos ni los char, solo los tipos primitivos

        int ar = 1;
        int br = 2;

        int totalr = ar-br;

        float cr = 2.8f;
        float dr = 27.9f;

        float total2r = cr - dr;

        // Multiplicación

        int am = 1;
        int bm = 2;

        int totalm = am * bm;

        float cm = 2.8f;
        float dm = 27.9f;

        float total2m = cm * dm;

        // División

        int ad = 1;
        int bd = 2;

        int totald = ad * bd;

        float cd = 2.8f;
        float dd = 27.9f;

        float total2d = cd * dd;

        // Módulo

        // El módulo da como resultado el rematente de la división de dos numeros. Por ejemplo:
        // 5 % 2 = 1 porque 5/2 = 2 y queda 1

        int amod = 9;
        int bmod = 2;

        int totalmod = amod % bmod;

        System.out.println(totalmod);

        // Operadores lógicos

        //  <       >       <=          >=          ==      !=         !   &&  ||
        //  Menor   Mayor   MenorIgual  MayorIgual  Igual   Distinto   Not AND OR

        boolean menor = 18 < 10; // false
        boolean mayor = 90 > 100; // false
        boolean menorIgual = 40 <= 40; // true
        boolean mayorIgual = 40 >= 40; // true

        // Un igual = es de asignación. Dos == es de comparación
        boolean igual = 40 == 40; // true

        boolean distinto = 30 != 40; // true
        boolean not = !(30 == 40); // true

        int edad = 18;
        String nombre2 = "Arturo";
        boolean and = edad >= 18 && edad <= 50 && nombre2 == "Arturo"; // Será true cuando todas las validaciones sean verdaderas. Resultado sería True

        int edad2 = 70;
        String nombre3 = "Arturo";
        boolean andFalse = edad2 >= 18 && nombre3 == "Arturo" && edad2 <= 50 ; // false


        int edad3 = 40;
        String nombre4 = "Manuel";
        boolean or = nombre4 == "Arturo" || edad3 >= 18 || edad3 <= 50; // Será true cuando una de las validaciones sea verdadera

        int edad4 = 70;
        String nombre5 = "Manuel";
        boolean andOr = nombre5 == "Arturo" || edad4 >= 30 && edad4 <= 60 ;




    }

}
