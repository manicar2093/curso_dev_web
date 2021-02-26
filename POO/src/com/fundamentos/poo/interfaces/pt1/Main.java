package com.fundamentos.poo.interfaces.pt1;

public class Main {

    /*
        Interfaces: Es un "contrato" que te ayuda a saber que comportamiento tiene una clase o que deberá tener. No es necesario escribir la implementación del comportamiento, solo se necesita saber la firma del metodo.
     */

    public static void main(String[] args) {

        MySQL mySQL = new MySQL();
        String consultaARealizar = "SELECT * FROM compras";

        realizarConsultaX(mySQL, consultaARealizar);

        realizarConsultaConInterfaz(mySQL, consultaARealizar);

        Redis redis = new Redis();
        realizarConsultaConInterfaz(redis, consultaARealizar);

        MongoDB mongoDB = new MongoDB();
        realizarConsultaConInterfaz(mongoDB, consultaARealizar);



    }

    public static void realizarConsultaX(MySQL conexion, String consulta) {

        conexion.isActived();
        conexion.consulta(consulta);
        System.out.println("-----------CONSULTA COMPLETADA-----------");

    }

    /*
        Adelanto a polimorfismo
     */
    public static void realizarConsultaConInterfaz(Conexion conexion, String consulta) {

        conexion.isActived();
        conexion.consulta(consulta);
        System.out.println("-----------CONSULTA COMPLETADA INTERFAZ-----------");

    }

}
