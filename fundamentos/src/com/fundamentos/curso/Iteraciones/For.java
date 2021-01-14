package com.fundamentos.curso.Iteraciones;

public class For {

    public static void main(String[] args) {
        // For clásico

        // El for se compóne de 3 expresiones.
        // for(Variable para iterar;
        //     Condición que se debe cumplir para que se continue la iteración;
        //     El aumento de nuestra variable que asegura la salida del for){
        //          // Cuerpo del for
        //     }

        for(int i = 10; i >= 0; i--){
            //System.out.println(i);
            System.out.println("Estás en la iteración "+i);
        }

        // Es importante primero conocer los Array
        // Son conjuntos de datos. Se pueden declarar de cualquier tipo, ya sea primitivo
        // u Object

        System.out.println("Primer array");
        int[] primerArray = new int[]{90,23,12,78,77,80,100}; // Manera 1 de declaración
        // Para ingresar a los datos del array se usa la sintaxis
        // variable[index]
        // NOTA: Los index se cuentan desde el 0
        System.out.println(primerArray[0]);
        System.out.println(primerArray[1]);
        System.out.println(primerArray[2]);
        System.out.println(primerArray[3]);
        System.out.println(primerArray[4]);

        System.out.println();
        System.out.println("Segundo array");

        String[] segundoArray = {"90","23","12","78","77"}; // Manera 2 de declaración
        System.out.println(segundoArray[0]);
        System.out.println(segundoArray[1]);
        System.out.println(segundoArray[2]);
        System.out.println(segundoArray[3]);
        System.out.println(segundoArray[4]);

        System.out.println();
        System.out.println("Tercer array");

        // Esta declaración NO proporciona los valores que contendra el Array, pero
        // indica la cantidad de valores que puede contener
        int[] tercerArray = new int[5]; // Manera 3 de declaración
        System.out.println(tercerArray[0]);
        System.out.println(tercerArray[1]);
        System.out.println(tercerArray[2]);
        System.out.println(tercerArray[3]);
        System.out.println(tercerArray[4]);

        System.out.println();
        System.out.println("Tercer array. Asignando un valor");
        tercerArray[0] = 89;
        System.out.println(tercerArray[0]);

        System.out.println();
        System.out.println("Tercer array. Asignando un valor de index que no existe");
        //tercerArray[10] = 89; // Esto manda error :S. java.lang.ArrayIndexOutOfBoundsException: 10
        //System.out.println(tercerArray[10]);

        // Iteración de primerArray
        System.out.println();
        System.out.println();
        int[] iteracionArray = {90,23,12,78,77};
        System.out.println("La longitud de primerArray es " + primerArray.length);
        System.out.println("Iteración con el for clásico");

        for(int index = 0; index < iteracionArray.length; index++){
            System.out.println(iteracionArray[index]);
        }

        // For Each -> Por cada uno
        System.out.println();
        System.out.println();
        String[] forEachArray = {"Arturo","Alejandro","David","El Doc","Manuel"};
        System.out.println("Iteración con el for each");

        for(String item : forEachArray) {
            System.out.println(item);
            if(item == "David") {
                break;// Recuerda que se puede usar el break para salir de una iteración
            }

            if(item != "MiraNadaMas") {
                continue; // El continue es similar al break, pero este no termina la iteración, indica pase al siguiente elemento
            }

            /*
                Mucho mas código!! D:
             */
        }





    }

}
