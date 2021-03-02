package com.fundamentos.poo.objectClass;

public class Main {

    /*
        Clase Object
     */

    public static void main(String[] args) {
        Platillo p1 = new Platillo("Enchiladas", 59.90f, 30);
        Platillo p2 = new Platillo("Enchiladas", 59.90f, 30);

        /*
            Cuando no está sobreescrito nos imprime el paquete, clase y espacio en memoria en el que se encuentra el objeto
         */
        System.out.println(p1.toString());
        /*
            Se puede omitir la llamada al metodo ya que println llama al metodo toString()
         */
        System.out.println(p1);

        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());

        System.out.println(p1.equals(p2));

    }

}
