package com.fundamentos.poo.polimorfismo.pt1;

public class Oracle implements Conexion {

    private String url;
    private String username;
    private String password;

    public Oracle(String url, String username, String password) {
        this.url = url;
        this.username = username;
        this.password = password;
    }

    @Override
    public void conectar() {

        System.out.println("Conectando a la url "+this.url+"...");
        System.out.println("------------CONEXIÓN EXITOSA------------");

    }

    @Override
    public boolean isActived() {
        System.out.println("Validando url "+this.url+" este activa...");
        return true;
    }

    public String esteEsOtroMetodoX(){
        System.out.println("Llamando a metodo x");
        return "esteEsOtroMetodoX";
    }


}
