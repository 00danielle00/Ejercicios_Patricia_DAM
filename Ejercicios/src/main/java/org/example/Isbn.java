package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Isbn {

    public void practica3(){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca un ISBN: ");

        String isbn = "";

        try {
            isbn = teclado.next();
        }catch (InputMismatchException error){
            System.out.println("Error: El valor introducido no es correcto");
            return;
        }

       if (isbn.length() != 10){
           System.out.println("Error: El ISBN debe contener 10 dígitos");
           return;
       }

       int isbntotal = 0;

        for (int i=0; i< 9;i++){
            String num = isbn.substring(i, i+1);
            int numero = Integer.parseInt(num);
            isbntotal += numero * (10 - i);
        }

        String ultimonum = isbn.substring(9);
        if (ultimonum.equals("X")){
            isbntotal += 10;
        } else{
            int ultimo = Integer.parseInt(ultimonum);
            isbntotal += ultimo;
        }

        if (isbntotal % 11 == 0){
            System.out.println("El código ISBN es válido");
        }else {
            System.out.println("El código ISBN no es válido");
        }
    }
}
