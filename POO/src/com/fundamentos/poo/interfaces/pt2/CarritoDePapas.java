package com.fundamentos.poo.interfaces.pt2;

public class CarritoDePapas implements Vendedor {


    @Override
    public void cargar(String[] cajas) {
        System.out.println("Cargando costales de papas:");
        for(String item : cajas) {
            System.out.println(item);
        }
    }

    @Override
    public void vender(String producto, String cliente) {
        System.out.println("Vendiendo una bolsita de " + producto +  " al transeunte " + cliente);
    }
}
