package com.fundamentos.poo.herencia;

public class Main {

    public static void main(String[] args) {

        Mujer m = new Mujer();
        m.setCabelloLargo(true);

        m.hablar();
        m.peinar();

        Ninia n = new Ninia(5, true);
        n.hablar();
        System.out.println(n.isCabelloLargo());
        System.out.println(n.getAnioEscolar());



    }

}
