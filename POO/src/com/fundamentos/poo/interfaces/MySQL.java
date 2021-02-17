package com.fundamentos.poo.interfaces;

public class MySQL implements Conexion {

    @Override
    public void conectar(String url, String username, String password) {
        System.out.println("Mi implementación de conectar MYSQL");
        System.out.println("Conectando a " + url + " con el usuario y contraseña " + username + " " + password + "...");
    }

    @Override
    public void consulta(String consulta) {
        System.out.println("MYSQL: Realizando consulta..." + consulta);
    }

    @Override
    public boolean isActived() {
        System.out.println("MYSQL: Esta disponible?..." + true);
        return true;
    }


}
