package com.fundamentos.poo.interfaces.pt1;

public class Redis implements Conexion {

    @Override
    public void conectar(String url, String username, String password) {
        System.out.println("Mi implementación de conectar REDIS");
        System.out.println("Conectando a " + url + " con el usuario y contraseña " + username + " " + password + "...");
    }

    @Override
    public void consulta(String consulta) {
        System.out.println("REDIS: Realizando consulta..." + consulta);
    }

    @Override
    public boolean isActived() {
        System.out.println("REDIS: Esta disponible?..." + true);
        return true;
    }
}
