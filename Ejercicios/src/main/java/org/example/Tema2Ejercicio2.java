package org.example;

import java.util.Scanner;

public class Tema2Ejercicio2 {
    public void ejercicio2(){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Dime una palabra...");
        String palabra1 = entrada.next();

        System.out.println("Dime otra palabra...");
        String palabra2 = entrada.next();

        int tam = palabra1.length();
        int tam2 = palabra2.length();

        if (tam > tam2){
            System.out.println("La palabra " + palabra1 + " es mas larga");
        }else{
            System.out.println("La palabra " + palabra2 + " es mas larga");
        }

    }
}
