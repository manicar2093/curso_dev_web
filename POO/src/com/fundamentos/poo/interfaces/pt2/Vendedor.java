package com.fundamentos.poo.interfaces.pt2;

public interface Vendedor extends Diablero {

    /*
        Entre interfaces se puede extender tal como en las clases normales. Esta interfaz Vendedor hereda el comportamiento de Diablero.
     */

    void vender(String producto, String cliente);

}
