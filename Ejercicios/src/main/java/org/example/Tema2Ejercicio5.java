package org.example;

import java.util.Scanner;

public class Tema2Ejercicio5 {
    public void ejercicio5 (){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese una cadena jugador1...");
        String cadena = entrada.nextLine();
        System.out.println("Ingrese una palabra jugador2...");

        String palabra = entrada.next();

        int intentos = 10;

        while (intentos > 0){
            if (cadena.contains(palabra)){
                System.out.println("Enhorabuena, has adivinado la palabra");
                break;
            }else{
                intentos = intentos -1;
                System.out.println("Error, no has adivinado la palabra" + " Te quedan " + intentos + " intentos");
                palabra = entrada.next();
            }
        }
        if (intentos == 0){
        System.out.println("se te han acabado los intentos!!");
        }
    }
}
