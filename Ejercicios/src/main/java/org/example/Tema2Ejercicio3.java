package org.example;

import java.util.Scanner;

public class Tema2Ejercicio3 {

    public void ejercicio3(){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Dime el valor de N :");
        int n = entrada.nextInt();

        System.out.println("Dime el m :");
        int m = entrada.nextInt();


        String N = Integer.toString(n);
        int longi = N.length();
        int total = longi - m;
        String N_1 = N.substring(0,total);

        System.out.println("El nuevo valor de N es... " + N_1);

    }
}
