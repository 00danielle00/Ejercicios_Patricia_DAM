package org.example;

import java.util.Scanner;

public class Practica3 {

    public void practica3() {
        System.out.println("¿Introduce tu nombre?:");
        Scanner entrada = new Scanner(System.in);
        String nombre = entrada.next();
        System.out.println("Hola " + nombre );
        System.out.println("Introduce tu edad:");
        int edad = entrada.nextInt();

        if (edad >= 18){
            System.out.println("Enhorabuena " + nombre + " puedes votar");

        }
        if(edad <= 18){
            System.out.println("Lo siento " + nombre + " no puedes votar");
            int resultado = 18 - edad;
            System.out.println("Te faltan " + resultado+ " años para ser mayor de edad" );
        }
    }
}
