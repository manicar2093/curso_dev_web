package com.fundamentos.poo.interfaces.pt2;

public class Empleado implements Vendedor {

    /*
        Esta clase Empleado que implementa Vendedor ahora tiene el comportamiento de la jerarquia entre Vendedor y Diablero.
     */

    @Override
    public void cargar(String[] cajas) {
        System.out.println("Cargando cajas de:");
        for(String item : cajas) {
            System.out.println(item);
        }
    }

    @Override
    public void vender(String producto, String cliente) {
        System.out.println("Vendiendo el producto " + producto +  " al cliente " + cliente);
    }


}
