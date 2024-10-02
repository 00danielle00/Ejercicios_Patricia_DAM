package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio3 {
    public void ejercicio3() {
        Scanner entrada = new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;

        while (num1 == 0 && num2 == 0) {
                System.out.println("dime un numero");
                num1 = entrada.nextInt();

                System.out.println("dime otro numero");
                num2 = entrada.nextInt();

                if (num1 == 0 && num2 == 0) {
                System.out.println("Error, el divisor no puede ser cero");
            }
                else {
                    int resultado = num1 / num2;
                    System.out.println("El resultado es " + resultado);
                }
             }
        }
    }
