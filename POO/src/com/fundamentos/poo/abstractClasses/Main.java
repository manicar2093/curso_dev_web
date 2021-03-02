package com.fundamentos.poo.abstractClasses;

public class Main {

    /*
        Clases Abstractas.
        Nota: Una clase puede implementar x numero de interfaces. No hay limite.
     */

    public static void main(String[] args) {

        Mujer m = new Mujer();

        m.hablar();
        m.comer();

        /*
            Tambien se aplica el polimorfismo, solo que como diferencia este si podra llamar a la implementación de la clase Hija.
         */
        Humano h = new Mujer();
        h.comer();
        h.hablar();

        /*
            Igual que las interfaces, las clases abstractas no se pueden instanciar.
            Humano h1 = new Humano(); // Esto da error
         */

    }

}
