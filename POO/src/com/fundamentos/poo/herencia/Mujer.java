package com.fundamentos.poo.herencia;

/**
 *
 * Mujer esta herendado todos los atributos y comportamientos que el humano tiene. TODOS los que permite la clase que sean compartidas.
 *
 * NOTA: Recuerda los modificadores de acceso.
 *
 */
public class Mujer extends Humano {

    /**
     *
     * LOS ATRIBUTOS NO SE PUEDEN SOBREESCRIBIR
     *
     */
    protected boolean cabelloLargo;
    protected boolean maquillada;
    protected double tamanioPie;

    public Mujer(){}

    public Mujer(boolean cabelloLargo, boolean maquillada, double tamanioPie){
        this.cabelloLargo = cabelloLargo;
        this.maquillada = maquillada;
        this.tamanioPie = tamanioPie;
    }

    /**
     * Mujer tiene su propio comportamiento y puede tener los que quiera.
     */
    public void peinar(){
        System.out.println("Me estoy peindado");
    }

    /**
     * Y tambien puede sobreescribir los comportamientos que hereda del padre
     */
    @Override // Esta anotación no afecta nada y solo indica que este comportamiento viene del padre y se esta modificando aquí
    public void hablar(){
        System.out.println("Soy mujer y asi hablo");
    }

    public boolean isCabelloLargo() {
        return cabelloLargo;
    }

    public void setCabelloLargo(boolean cabelloLargo) {
        this.cabelloLargo = cabelloLargo;
    }

    public boolean isMaquillada() {
        return maquillada;
    }

    public void setMaquillada(boolean maquillada) {
        this.maquillada = maquillada;
    }

    public double getTamanioPie() {
        return tamanioPie;
    }

    public void setTamanioPie(double tamanioPie) {
        this.tamanioPie = tamanioPie;
    }
}
