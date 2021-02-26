package com.fundamentos.poo.interfaces.pt1;

public class MongoDB implements Conexion {

    @Override
    public void conectar(String url, String username, String password) {
        System.out.println("Mi implementación de conectar MONGODB");
        System.out.println("Conectando a " + url + " con el usuario y contraseña " + username + " " + password + "...");
    }

    @Override
    public void consulta(String consulta) {
        System.out.println("MONGODB: Realizando consulta..." + consulta);
    }

    @Override
    public boolean isActived() {
        System.out.println("MONGODB: Esta disponible?..." + true);
        return true;
    }

}
