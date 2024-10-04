package org.example;

import java.util.Scanner;

public class Ejercicio4 {
    public void ejercicio4(){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce primer numero");
        int num1 = entrada.nextInt();
        System.out.println("Introduce segundo numero");
        int num2 = entrada.nextInt();
        System.out.println("Introduce tercer numero");
        int num3 = entrada.nextInt();

        if (num1 == num2 || num1==num3 || num2==num3){
            System.out.println("Error, hay numeros introducidos que son iguales.");
        }else {
            int minimo = Math.min( num1,Math.min(num2, num3));
            System.out.println(
                    "El minimo es " + minimo
            );
        }

    }
}
