package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Isbn {

    public void practica3(){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca ISBN: ");

        String isbn = "nada";

        try {
            isbn = teclado.next();
        }catch (InputMismatchException error){
            System.out.println("Error: El valor introducido no es correcto");
        }

        if(isbn.equals("X")){
            String reemplazar = isbn.replace("x", "10");
        }

        for (int i=0; i<=10;i++){

            char isbnn = isbn.charAt(i);

            if (){

            }
        }
    }
}
