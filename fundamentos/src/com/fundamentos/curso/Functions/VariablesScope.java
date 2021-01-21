package com.fundamentos.curso.Functions;

public class VariablesScope {
    /*
        Hay dos tipos de scope(Alcance):
            - Global
            - Local
     */

    static String nombre = "Arturo"; // Esta variable se puede acceder  en todos los metodos de la clase
    static String apellido = "Mijin";


    public static void main(String[] args){

        int counter = 0; // Esta variable solo se puede acceder en todoo el contexto de main

        if(nombre == "Arturo") {

            String texto = "lo que caiga"; // Este solo se puede acceder desde el contexto del if. No es accesible desde su contexto padre

            counter++;

        }

        float miDinero = 9000f;
        String miMaterial = "cable coaxial";

        boolean yaInstaloMisCamaras = instalarCamaras(miDinero, 90.0f, miMaterial);
        System.out.println(yaInstaloMisCamaras);


    }

    public static void correr(){

        System.out.println(nombre);

    }

    public static boolean instalarCamaras(float dinero, float anticipo, String ...materiales){
        if(dinero < 800) {
            return false;
        }
        if(materiales[0] == "cable coaxial") {
            return true;
        }
        return true;
    }


}
