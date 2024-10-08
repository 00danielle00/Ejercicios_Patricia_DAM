package org.example;

import java.util.Scanner;

public class Tema2Ejercicio1 {

    public void ejercicio1(){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce una palabra o frase:");
        String frase = entrada.nextLine();

        int longitud = frase.length();
        int mitad = longitud / 2;
        System.out.println( "La longitud del texto es: "+ longitud);

        String sinespacios = frase.replace( " ", "");
        System.out.println("Texto sin espacios: " + sinespacios);

        String mitad1 = frase.substring(0,mitad);
        String mitad2 = frase.substring(mitad,longitud);



        System.out.println("Texto dividido en 2 mitades: " +" Primera mitad del texto es " + mitad1 + " y la segunda mitad del trozo es " + mitad2);

        String mayusculas = frase.toUpperCase();
        System.out.println("Texto a mayúsculas: " + mayusculas);
    }
}
