package com.fundamentos.poo.modificadoresAcceso;

public class Computadora {

    /*
        Existen 4 modificadores de acceso que tienen un efecto diferente en los elementos de una clase.
        Estos se pueden usar en clases, atributos y métodos. Detalles y consulta: https://picodotdev.github.io/blog-bitix/2020/01/los-modificadores-de-acceso-de-clases-propiedades-y-metodos-en-java/
     */

    /*
        private: los elementos de la clase que tengan este modificador solo serán conocidos por la misma clase y modificables por la misma clase. Con ellos vienen los conceptos de getter y setter.
     */

    private String marca;
    private void calcularPrecio() {
        System.out.println("calculando precio");
    }

    /*
        Getters: Get = Obtener
     */

    public String getMarca() {
        return this.marca;
    }

    /*
        Setters: Set = Colocar o asignar
     */

    public void setMarca(String marcar) {
        this.marca = marcar;
    }



    /*
        public: los elementos de la clase que contengan este modificador podrán ser accedidas, modificada y conocidas por cualquier clase.
     */

    public String modelo;
    public void prender(){
        System.out.println("prendiendo computadora");
        this.calcularPrecio();
    }

    /*
        default: cuando no se declara ningun modificador, el elemento de la clase solo puede ser accedida por clases de su mismo paquete
     */

    int precio;

    /*
        protected: este solo puede ser visto dentro del mismo paquete y en clases hijas de la clase contenedora (Más detalles en herencia)
     */

    protected String os;

}
