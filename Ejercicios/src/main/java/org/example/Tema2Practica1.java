package org.example;

import java.util.Scanner;

public class Tema2Practica1 {
    public void practica1(){

        // Practica 4, adivinar el numero de la suerte
        Scanner entrada = new Scanner(System.in);

        System.out.println("BIENVENIDO!, TE ADIVINAREMOS TU NUMERO DE LA SUERTE... ");
        System.out.println("Introduce tu fecha de nacimiento "+ " (dd/mm/aaaa): ");

        String fecha = entrada.next();

        String num1 = fecha.substring(0,2);// cojo el rango de numeros que quiero sumar
        String num2 = fecha.substring(3,5);
        String num3 = fecha.substring(6,10);

        int num_1 = Integer.parseInt(num1); // lo paso a numero entero para poder sumarlo
        int num_2 = Integer.parseInt(num2);
        int num_3 = Integer.parseInt(num3);

        int total = num_1 + num_2 + num_3; //Realizo la operación

        System.out.println(num_1 + "+" + num_2 + "+"+ num_3+ "="+ total   );

        String anyo = Integer.toString(total); //convertimos el año a carácter para realizar la suma con cada dígito del año
        String anyo_1 = anyo.substring(0,1);
        String anyo_2 = anyo.substring(1,2);
        String anyo_3 = anyo.substring(2,3);
        String anyo_4 = anyo.substring(3,4);

        int anyo1 = Integer.parseInt(anyo_1);
        int anyo2 = Integer.parseInt(anyo_2);
        int anyo3 = Integer.parseInt(anyo_3);
        int anyo4 = Integer.parseInt(anyo_4);

        int totalanyo = anyo1 + anyo2 + anyo3 + anyo4;
        System.out.println( anyo1 +  "+" + anyo2 + "+" +anyo3+ "+" + anyo4 +" = "+ totalanyo);
        System.out.println("Tu numero de la suerte es " + totalanyo);

        //hacer que n funcione con numeros negativos
        //hacer que no funcione intorduciendo 0s
        // establecer el / como patron


    }
}
