package org.example;

import java.util.Scanner;

public class Contrasenya {

    public void Ejercicio1() {

        Scanner teclado = new Scanner(System.in);

        String pass = "patata";
        String password;

        do {
            System.out.println("introduce tu contraseña");
            password = teclado.next();
        }
        while (!password.equals(pass));{

            System.out.println("Bienvenido, contraseña correcta");
        }

    }

    public void Ejercicio2(){

        Scanner teclado = new Scanner(System.in);

        System.out.println("Dime un numero: ");

        int numero = teclado.nextInt();

        for (int i=numero;i>=1;i--){
            if (i%2 ==0) {
                System.out.println(i);
            }
        }
    }
    public void Ejercicio3(){

        for (int i=1;i<=50;i++){
            if (i%3 == 0) {
                System.out.println(i);
            }
        }
    }
    public void Ejercicio4(){

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una cadena: ");
         String cadena = teclado.next();

         for (int i = 0; i < cadena.length(); i++){
             System.out.println(cadena.charAt(i));
         }

    }
    public void Ejercicio5(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una numero: ");
        int numero = teclado.nextInt();

        for (int i = 1; i <= 10 ; i++){
            int total = numero*i;
            System.out.println(numero + " x " +i +" = "+ total);

        }

    }
    public void Ejercicio6(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("cuantos numeros quieres sumar: ");
        int numero = teclado.nextInt();

        int sumatotal =0;

        for (int i = 1; i <= numero ; i++){
            System.out.println("Inserta nº"+ i +":");
            int sumar = teclado.nextInt();
            sumatotal +=sumar;

        }
System.out.println("El resultado es " + sumatotal);
    }
    public void Ejercicio7(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime un numero ");
        int numero = teclado.nextInt();
        int factorial =1;
        for (int i = 1 ; i <=numero ; i++){
            factorial*=i;

        }
        System.out.println( "El factorial es "+  factorial);
    }
    public void Ejercicio8(){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Dime una cadena :");

        String cadena = entrada.next();

        String cadenainvertida = " ";

        for (int i = cadena.length() -1; i >= 0; i--){
          cadenainvertida+= cadena.charAt(i);
        }
    System.out.println("la cadena invertida es " + cadenainvertida);
    }
}
