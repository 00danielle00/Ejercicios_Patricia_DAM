package org.example;

import java.util.Scanner;

public class Practica3 {

    public void practica3() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce tu nombre:");

        String nombre = entrada.nextLine();
        System.out.println("Hola " + nombre);

        int edad = 0;
        while (edad <= 0) {

            System.out.println("Introduce tu edad:");
            edad = entrada.nextInt();
            if (edad <= 0) {
                System.out.println("Error, la edad no puede ser un numero negativo");
            }
        }

            if (edad >= 18) {
                System.out.println("Enhorabuena " + nombre + ", puedes votar");
            } else {
                System.out.println("Lo siento " + nombre + ", no puedes votar");
                int resultado = 18 - edad;
                System.out.println("Te faltan " + resultado + " años para ser mayor de edad");
            }
        }
    }

