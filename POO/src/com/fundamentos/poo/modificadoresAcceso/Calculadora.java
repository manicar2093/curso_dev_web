package com.fundamentos.poo.modificadoresAcceso;

public class Calculadora {

    /*
        Embarrada de static.
        static: esta palabra reservada nos permite llamar a elementos static de una clase, esto sin crear una instancia de la misma.
        Ejemplo en com.fundamentos.poo.modificadoresAcceso.Main linea 17
     */
    public static String mensaje = "Holi desde calculadora";

    public static int sumar(int num1, int num2) {
        return num1 + num2;
    }

    public static int restar(int num1, int num2) {
        return num1 - num2;
    }

    public static int multi(int num1, int num2) {
        return num1 * num2;
    }

    public static int dividir(int num1, int num2) {
        return num1 / num2;
    }

}
