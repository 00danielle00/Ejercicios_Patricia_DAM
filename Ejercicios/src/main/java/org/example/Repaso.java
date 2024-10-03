package org.example;

import java.util.Scanner;

public class Repaso {
    public void repaso() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Dime un numero: ");
        int num1 = entrada.nextInt();
        System.out.println("Dime otro numero");
        int num2 = entrada.nextInt();
        System.out.println("Elige el tipo de operación");

        System.out.println("1.Suma");
        System.out.println("2.Resta");
        System.out.println("3.Multiplicación");
        System.out.println("4.Division");
        int op = entrada.nextInt();
        switch (op) {
            case 1:
                int resultado = num1 + num2;
                System.out.println("La suma es: " + resultado);
                break;
            case 2:
                int resultado1 = num1 - num2;
                System.out.println("La resta es: " + resultado1);
                break;
            case 3:
                int resultado2 = num1 * num2;
                System.out.println("La multiplicacion es: " + resultado2);
                break;
            case 4:
                int resultado3 = num1 / num2;
                System.out.println("La division es: " + resultado3);
                break;
            default:System.out.println("Error:Vuelve a introducir numero");
        }
    }
}
