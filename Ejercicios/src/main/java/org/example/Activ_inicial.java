package org.example;

import java.util.Scanner;

public class Activ_inicial {

    public void ejecutar() {
        System.out.println("¿Como te llamas?");
        Scanner entrada = new Scanner(System.in);
        String nombre = entrada.next();

        System.out.println("¿A que curso vas?");
        String curso = entrada.next();

        System.out.println("Hola " + nombre + ", bienvendo a " + curso + ".");

        System.out.println("introduce un numero");
        int num1 = entrada.nextInt();

        System.out.println("introduce otro numero");
        int num2 = entrada.nextInt();

        int resultado = num1 + num2;

        System.out.println("El resultado de la suma es: " + resultado);
    }


}
