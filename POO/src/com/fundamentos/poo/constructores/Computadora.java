package com.fundamentos.poo.constructores;

public class Computadora {

    private String processor;
    private int ram;
    private String ssd;
    private String monitor;

    // Contructores
    /*
        Todas las clases tienen un constructor vacío por defecto.
        public Computadora(){}
        Pero cuando no está registrado explicitamente en la clase es sobreescrito por
        el contructor que se escriba.
     */

    public Computadora(){}

    public Computadora(String processor, int ram){
        this.processor = processor;
        this.ram = ram;
    }

    public Computadora(String ssd, String monitor) {
        this.ssd = ssd;
        this.monitor = monitor;
    }

    // Métodos



    // Getters and Setters
    public String getProcessor() {
        return this.processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public int getRam() {
        return this.ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getSsd() {
        return ssd;
    }

    public void setSsd(String ssd) {
        this.ssd = ssd;
    }

    public String getMonitor() {
        return monitor;
    }

    public void setMonitor(String monitor) {
        this.monitor = monitor;
    }
}
