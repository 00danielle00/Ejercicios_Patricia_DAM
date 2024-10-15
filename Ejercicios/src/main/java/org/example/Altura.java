package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Altura {

    public void altura() {

        Scanner entrada = new Scanner(System.in);

        int altura = 0;

        try {
            System.out.println("Dime tu altura");
            altura= entrada.nextInt();

        }catch (InputMismatchException err){
            System.out.println("Error: El formato es invalido");
            return;
        }
        if (altura <= 150) {
            System.out.println("Persona de altura baja");

        } else if (altura >= 151 && altura <= 175) {

            System.out.println("persona de altura media");

        } else if (altura >= 176) {

            System.out.println("Persona alta");
        }
    }
}
