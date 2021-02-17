package com.fundamentos.poo.interfaces;

public interface Conexion {

    /*
        Por default todos los metodos que se colocan dentro de una interfaz son public.
        
        Una interfaz NO SE PUEDE INSTANCIAR
     */

    void conectar(String url, String username, String password);

    void consulta(String consulta);

    boolean isActived();

}