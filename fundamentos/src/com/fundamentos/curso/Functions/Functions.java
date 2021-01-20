package com.fundamentos.curso.Functions;

import java.util.Scanner;

public class Functions {

    public static void main(String[] args) {

        /*

            Las funciones sirven para crear codigo reutilizable y hacer el código para comprensible. Sintaxis:

            <modificadores> <tipo de retorno> <nombre de la funcion>(parametro1, parametro2,...) {
                // Cuerpo de la función
            }

            Ejemplo:
            public static int suma(int a, int b, int c){
                //Cuerpo de la función
            }

            Toda esta parte 'public static int suma(int a, int b, int c)' se le conoce como firma del metodo o función


         */
        int suma0 = 2 + 4 + 9;
        System.out.println(suma0);

        /*
            Las funciones se pueden llamar las veces que requieras :D
         */
        suma();

        /*
            Si la función regresa algun resultado se puede almacenar ese dato en una variable del mismo tipo que regresa la función. En este caso
            la función regresa un String y se recibe con un String
         */
        String saludo = decirHola();
        System.out.println(saludo);

        /*
            Cuando una función regresa algun dato se puede meter dentro de otra función para que el return pase directo a las siguiente.
            Es importante que el metodo que envuelve sí reciba el tipo de valor.

            Las funciones anidadas se validan de adentro hacia afuera. Lo que significa que si tenemos x funciones anidadas la primera que se
            correra será la que este más adentro. Por ejemplo:

            System.out.println(decirHola(obtenerNombre()));

            Aquí obtenerNombre se ejecutará primero
         */
        System.out.println(decirHola());

        /*
            Las funciones pueden recibir parametros para realizar un trabajo.
         */
        int result = suma(4,6,90);
        System.out.println(result);

        int edad1 = 24;
        int edad2 = 26;
        int edad3 = 40;

        int resultEdad = suma(edad1, edad2, edad3);
        System.out.println(resultEdad);

        /*
            Los valores que puede recibir pueden ser de cualquier tipo: desde primitivos hasta objetos
         */
        System.out.println(decirHolaA("Arturo", 24));
        System.out.println(decirHolaA("Manuel", 27));

        /*
            Variatic Variables indica que puedes enviar a una función x cantidad de datos del tipo que solicita. En el ejemplo de abajo la función
            sumarVariosNumeros recibe datos de tipo int...x datos de tipo int
         */
        System.out.println("Funcion con variatic variables");
        System.out.println(sumarVariosNumeros(9,90,8,13,2,4,5,67,54,12,12,252,2345,234,12,1,3,234,568,458,123,123,34,12,456,34,5623,4512,34));

        /*
            Ejemplo de DI(Dependency Injection) Inyección de Dependencias.
            Quiere decir que a la función le pasaras todoo lo que necesite para que realice su trabajo
         */
        /*
            Sin inyección
         */
        System.out.println(decirHolaDesdeScan());

        /*
            Con inyección
         */
        Scanner scan = new Scanner(System.in);
        decirHolaDesdeScanInyectado(scan);
        decirHolaDesdeScanInyectado(scan);
    }

    public static void suma() {
        int suma = 2 + 4 + 9;
        System.out.println(suma);
    }

    public static int suma(int a, int b, int c) {
        return a + b + c;
    }

    /*
        La anotación int ...numeros indica que la función puede recibir x cantidad de datos de tipo int. Cuando utilizamos la variable numeros
        dentro de la función lo manejaremos como un Array; en este caso de numeros.

        Esta anotación se puede usar en conjunto con otras variables, la única condición es que se encuentre hasta el final de los parametros que
        utilizará de la función. Por ejemplo:

            public static void realizarCuenta(String mensaje, float ...cantidades){
                //Cuerpo de la función
            }
     */
    public static int sumarVariosNumeros(int ...numeros){
        int total = 0;
        for(int i : numeros) {
            total += i;
        }
        return total;
    }

    public static String decirHola() {
        return "Hola desde la función decirHola! :D"; // Indica que la función regresará un valor
    }

    public static String decirHolaA(String nombre, int edad) {
        return "Me llamo " + nombre + " y tengo " + edad;
    }

    /*
        Este se puede mejorar con algunos temas de inyección de dependencias.
     */
    public static String decirHolaDesdeScan() {
        System.out.println("decirHolaDesdeScan crea un nuevo Scanner por cada llamada");
        Scanner scan = new Scanner(System.in);
        System.out.println("Dime tu edad, carnal: ");
        String name = scan.nextLine();
        return "Te llamas " + name;
    }

    /*
        Con inyección de dependencia :D. Mucha mejor opción!
     */
    public static String decirHolaDesdeScanInyectado(Scanner scan) {
        System.out.println("decirHolaDesdeScanInyectado utiliza el Scanner que se pasa como parametro en la función");
        System.out.println("Dime tu edad, carnal: ");
        String name = scan.nextLine();
        return "Te llamas " + name;
    }


}
