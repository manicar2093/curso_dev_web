package com.fundamentos.curso.ControlStatements;

public class While {

    public static void main(String[] args) {

        // while == mientras
        // break == romper
        // Operador += -= ++ y --

        int counter = 0;

        while(counter < 9) {

            System.out.println(counter);
            //counter = counter + 1;
            //counter += 1; // simplifica el de arriba, pero no significa que no lo puedas usar.
            counter++; // Simplifica los dos arriba

        }

        System.out.println("Se ha salido de while :O");
        System.out.println();
        System.out.println("---------------------------");
        System.out.println();

        int counter2 = 0;

        while(true) {

            System.out.println(counter2);
            if(counter2 == 9) {
                break;
            }

            counter2++;

        }


    }

}
