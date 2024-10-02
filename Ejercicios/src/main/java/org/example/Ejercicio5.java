package org.example;

import java.util.Scanner;

public class Ejercicio5 {
    public void ejercicio5(){

        Scanner entrada = new Scanner(System.in);
        System.out.println("tienes tomate?: ");
        String tomate = entrada.next();
        System.out.println("tienes aceite?: ");
        String aceite = entrada.next();
        System.out.println("tienes jamon?: ");
        String jamon = entrada.next();


        if (tomate.equals("no") ){
            System.out.println("Tienes que ir a comprar");
        }else{
            System.out.println("No tenemos que ir a comprar");
        }
        if (aceite.equals("no")){
            System.out.println("Tienes que ir a comprar");
        } else if (jamon.equals("no")) {
            System.out.println("Necesitas ir a comprar");
        }else {
            System.out.println("No tienes que ir a comprar");
        }


    }
}
