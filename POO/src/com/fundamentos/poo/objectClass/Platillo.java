package com.fundamentos.poo.objectClass;

import java.util.Objects;

/**
 * TODAS LAS CLASES implicitamente extienden de la clase Object
 */
public class Platillo {

    private String name;
    private float price;
    private int preparationTime;

    public Platillo(String nombre, float price, int preparationTime) {
        this.name = nombre;
        this.price = price;
        this.preparationTime = preparationTime;
    }

    @Override
    public String toString(){
        return String.format("Platillo {nombre: %s, precio:%f, tiempoPreparacion: %d}", this.name, this.price, this.preparationTime);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        Platillo platillo = (Platillo) o;
        return Float.compare(platillo.price, price) == 0 && preparationTime == platillo.preparationTime && Objects.equals(name, platillo.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.name, this.price, this.preparationTime);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getPreparationTime() {
        return preparationTime;
    }

    public void setPreparationTime(int preparationTime) {
        this.preparationTime = preparationTime;
    }
}
