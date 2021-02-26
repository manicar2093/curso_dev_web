package com.fundamentos.poo.polimorfismo.pt2;

public class Ninia extends Mujer {

    private int anioEscolar;

    public void estudiar() {
        System.out.println("Estoy estudiando");
    }

    @Override
    public void hablar() {
        /**
         * La palabra reservada super nos da una referencia a la clase padre y nos permite acceder a sus metodos
         */
        super.hablar();

        System.out.println("Una niña habla diferente, perros");
    }

    public int getAnioEscolar() {
        return anioEscolar;
    }

    public void setAnioEscolar(int anioEscolar) {
        this.anioEscolar = anioEscolar;
    }
}
