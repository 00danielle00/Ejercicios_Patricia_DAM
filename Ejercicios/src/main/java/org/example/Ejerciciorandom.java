package org.example;
import java.util.Random;
import java.util.Scanner;

public class Ejerciciorandom {
    public void ejercicio1(){

        Random random = new Random();

        int num1 = random.nextInt(6)+1;
        System.out.println("El dado 1 da " + num1);

        int num2 = random.nextInt(6)+1;

        System.out.println("el dado 2 da " +num2);
        int res = num1 + num2;

        System.out.println("el total de ambos datos son " + res);

    }

    public void ejercicio2(){

      String  caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

              int tam = caracteres.length();

              Random randomm= new Random();

              int longitud_contrasenya = 12;

              int indice;

              String contrasenya = "";

              for (int i=0; i<longitud_contrasenya ;i++){

                  indice = randomm.nextInt (tam);
                  contrasenya += caracteres.charAt(indice);
              }

        System.out.println(contrasenya);

    }
    public void ejercicio3(){

        Scanner teclado = new Scanner(System.in);
        Random randomm= new Random();

        System.out.println("Dime un numero :");

        int min = teclado.nextInt();

        System.out.println("dime otro numero : ");

        int max = teclado.nextInt();

        if (min < max) {
            System.out.println("cuántos numeros quieres");
            int numero = teclado.nextInt();

            for (int i= 0; i < numero; i++){
                numero = randomm.nextInt(max - min + 1) + min;
                System.out.println(numero);
            }

        }
    }
    public void ejercicio4(){
        String  caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        int tam = caracteres.length();

        Random randomm= new Random();

        int longitud_contrasenya = 12;

        int indice;

        String contrasenya = "";

        for (int i=0; i<longitud_contrasenya ;i++){

            indice = randomm.nextInt (tam);
            contrasenya += caracteres.charAt(indice);
        }
        System.out.println(contrasenya);
    }
}

