package org.example;

import java.util.Scanner;

public class Ejercicio3 {
    public void ejercicio3(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("dime un numero");
        int num1 = entrada.nextInt();
        System.out.println("dime otro numero");
        int num2 = entrada.nextInt();

        while (num1==0 || num2==0){

            int resultado = num1 / num2;
            System.out.println("El resultado es " + resultado);
        }
        if (num1==0 || num2==0){
            System.out.println("Error:El divisor no puede ser 0");
        }
    }
}
