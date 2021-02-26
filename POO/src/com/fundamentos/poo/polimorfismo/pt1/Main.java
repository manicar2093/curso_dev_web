package com.fundamentos.poo.polimorfismo.pt1;

public class Main {

    public static void main(String[] args) {

        Oracle c1 = new Oracle("https://unaurl.com", "administrator", "administrator");

        c1.conectar();
        c1.isActived();
        c1.esteEsOtroMetodoX();

        /*
            Cuando se guarda una instancia de una clase dentro de un tipo de interfaz, solo se podrán usar los metodos declarados en dicha interfaz. Por ejemplo:
                Oracle tiene el metodo estoEsOtroMetodoX, pero la interfaz Conexion no y al estar usando la interfaz Conexion como tipo, solo se pueden acceder a las implementaciones que indica Conexion
         */
        Conexion c2 =  new Oracle("https://otraurl.com.mx", "Admin", "Admin");
        c2.conectar();
        c2.isActived();


    }
}
