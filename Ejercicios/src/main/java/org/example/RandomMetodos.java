package org.example;
import java.util.Random;
import java.util.Scanner;

public class RandomMetodos {
    public void random (){
        Random aleatorio =new Random();
        int numero= aleatorio.nextInt();

        numero = aleatorio.nextInt(6) + 1 ;//empieza desde 1 hasta 5, genera un numero entero;
        System.out.println(numero);

        double numero2 = aleatorio.nextDouble(); //desde 0 al 0.99
        System.out.println(numero2);

        numero2 = aleatorio.nextDouble()*6+1; //desde 1 al 5.99
        System.out.println(numero2);

        numero = (int) aleatorio.nextDouble()* 6 + 1;
        System.out.println(numero);

        numero2=Math.random()*6+1;
        System.out.println(numero2);

    }
}
