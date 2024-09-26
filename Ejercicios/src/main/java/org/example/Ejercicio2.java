package org.example;

import java.util.Scanner;

public class Ejercicio2 {
    public void ejercicio2(){
        System.out.println("dime un numero");
        Scanner entrada = new Scanner(System.in);
        int num1 = entrada.nextInt();

        System.out.println("dime otro numero");
        int num2 = entrada.nextInt();

        if (num1 > num2) {
            System.out.println(num1 + " es mayor");

        }else{
            if (num2 > num1){
                System.out.println(num2 + " es mayor");
            }else if(num1==num2){
                System.out.println("ERROR:los numeros introducidos no pueden ser iguales");
            }
        }
    }
}
