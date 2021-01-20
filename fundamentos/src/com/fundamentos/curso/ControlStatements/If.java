package com.fundamentos.curso.ControlStatements;

public class If {

    public static void main (String[] args) {
        // if

        int edad = 60;
        // && agrupa preguntas y todas deben ser verdad (true=
        // || agrega una pregunta alterna o condición adicional

        // if == si

        // Por ejemplo: (Palabras humanas y modo java)
        // Humano:  te llamas Arturo? y tienes 18 o mas edad?
        // Java:    name == "Arturo" && edad >= 18

        if(edad >= 18 && edad <= 40 || edad == 50 && edad < 30) {
            System.out.println("Eres mayor de edad y tienes menos de 40");
        }

        System.out.println("If validado");
    }
}
