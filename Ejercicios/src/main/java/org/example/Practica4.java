package org.example;

import java.util.Scanner;

public class Practica4 {

    public void practica4() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el multiplicador (3 cifras):");
        int num1 = entrada.nextInt();

        System.out.println("Introduce el multiplicador (3 cifras):");
        int num2 = entrada.nextInt();

        int resultado = num1*num2;

        String numC = Integer.toString(num1); //convertimos el número a carácter
        String numC_1 = numC.substring(2,3); //cogemos la primera cifra (desde posión 0 hasta 1)
        String numC_2 = numC.substring(1,2);
        String numC_3 = numC.substring(0,1);

        int num_1 = Integer.parseInt(numC_1);
        int num_2 = Integer.parseInt(numC_2);
        int num_3 = Integer.parseInt(numC_3);

        int resultado2 = num_1*num2;
        int resultado3 = num_2* num2;
        int resultado4 = num_3* num2;
        
        System.out.println("El producto de la multiplicación es: " + resultado);
        System.out.println("El proceso es:");
        System.out.println( "  " +num1 );
        System.out.println("x " + num2);
        System.out.println("------");
        System.out.println(" " + resultado2);
        System.out.println( resultado3+"x" );
        System.out.println(resultado4+"xx");
        System.out.println("------");
        System.out.println(resultado);

    }
}
