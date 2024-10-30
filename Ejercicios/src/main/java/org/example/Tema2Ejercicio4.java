package org.example;

import java.util.Scanner;

public class Tema2Ejercicio4 {
    public void ejercicio4(){

        String texto = "Hola Mundo, bienvenido a Mundo. Mundo es genial.";
        String subcadena = "Mundo";

        int total = (texto.length() - texto.replace(subcadena, "").length()) / subcadena.length();
        System.out.println(total);




    }
}
