package com.fundamentos.poo.polimorfismo.pt2;

public class Main {

    public static void main(String[] args) {
        Ninia n1 = new Ninia();
        n1.hablar();
        n1.estudiar(); // Exclusivo de la clase Ninia


        Mujer m1 = new Ninia();
        //m1.estudiar(); // No puede usar porque, aun cuando la variable m1 guarda una instancia de Ninia, el tipo que se se esta usando para guardar la instancia no contiene el método
        m1.peinar(); // Exclusivo de mujer

        Humano h1 = new Ninia();
        //h1.estudiar(); // No puede usar porque, aun cuando la variable m1 guarda una instancia de Ninia, el tipo que se se esta usando para guardar la instancia no contiene el método
        //h1.peinar(); // No puede usar porque, aun cuando la variable m1 guarda una instancia de Ninia, el tipo que se se esta usando para guardar la instancia no contiene el método
        h1.hablar(); // Exclusivo de Humano

    }

}
