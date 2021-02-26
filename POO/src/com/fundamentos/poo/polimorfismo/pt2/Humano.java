package com.fundamentos.poo.polimorfismo.pt2;

/**
 * Humano representa todo lo que un ser humano tiene
 */
public class Humano {

    private boolean manos;
    private boolean boca;
    private boolean patas;
    private double altura;
    private double peso;

    public void hablar(){
        System.out.println("Soy un humano y hablo");
    }

    public void caminar(){
        System.out.println("Soy un humano y camino");
    }

    public void saltar(){
        System.out.println("Soy un humano y Salto");
    }

    public boolean isManos() {
        return manos;
    }

    public void setManos(boolean manos) {
        this.manos = manos;
    }

    public boolean isBoca() {
        return boca;
    }

    public void setBoca(boolean boca) {
        this.boca = boca;
    }

    public boolean isPatas() {
        return patas;
    }

    public void setPatas(boolean patas) {
        this.patas = patas;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
