package com.fundamentos.poo.herencia;

public class Ninia extends Mujer {

    private int anioEscolar;

    public void estudiar() {
        System.out.println("Estoy estudiando");
    }

    public Ninia(int anioEscolar, boolean cabelloLargo){
        /**
         * La palabra reservada super nos da una referencia a la clase padre y nos permite acceder a sus metodos
         */
        super.setCabelloLargo(cabelloLargo);
        this.anioEscolar = anioEscolar;
    }

    public Ninia(int anioEscolar, boolean cabelloLargo, boolean maquillada, double tamanioPie) {
        this.cabelloLargo = cabelloLargo;
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
