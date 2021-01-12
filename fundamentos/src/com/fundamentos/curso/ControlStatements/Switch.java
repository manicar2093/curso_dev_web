package com.fundamentos.curso.ControlStatements;

public class Switch {

    public static void main(String[] args) {
        // switch

        // Aqui se usa la palabra reservada break

        // Switch toma la variable y la valida con todos los casos registrados. Si Se cumple alguno
        // se realiza el proceso escrito en el case. Si ninguno se cumple se realiza lo escrito en
        // default.

        // Es importante que se coloque la palabra reservada break para indicar el termino del
        // proceso en casa case. Si se quiere hacer una validación en cascada se puede omitir

        // Se pueden apilar casos que tengan la misma forma de procesar

        String nombre = "Alejandro";

        switch (nombre) {

            case "Christian":
            case "Manuel":
                System.out.println("Sacate de aquí, sonso");
                break;
            case "Alejandro":
            case "Arturo":
                System.out.println("Bienvenido, carnal :D");
                break;
            default:
                System.out.println("No sabemos quien eres ni que hacer contigo");
                break; // No recuerdo si sí va aqui, pero por si acaso xD

        }

        System.out.println("Switch validado");



    }

}
