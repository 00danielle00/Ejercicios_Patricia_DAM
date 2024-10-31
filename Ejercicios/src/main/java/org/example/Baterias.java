package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Baterias {

    public void ejercicio1(){

        Scanner teclado = new Scanner(System.in);

        System.out.println("Cuantos numeros quieres introducir: ");

        int numero = teclado.nextInt();

        int mayorcero=0;
        int menorcero=0;
        int igualcero=0;

        for (int i=0; i < numero; i++){

            System.out.println("introduce los numeros: "+ (i+1)+ ":");
            int num = teclado.nextInt();

            if (num > 0){
                mayorcero++;
            } else if (num < 0) {
                menorcero++;
            }else{
                igualcero++;
            }
        }System.out.println("Los numero mayores a cero son " + mayorcero);
        System.out.println("Los numero menores a cero son " + menorcero);
        System.out.println("Los numero iguales a cero son " + igualcero);
    }
    public void ejercicio2(){

        Scanner teclado = new Scanner(System.in);

        System.out.println("Numero base: ");
        int base = teclado.nextInt();

        System.out.println("dime exponente");
        int exponente = teclado.nextInt();

        int total=1;

        for (int i=0;i < exponente;i++){
            total *=base;
        }
        System.out.println("el resultado de la potencia es " + total);

    }
    public void ejercicio3(){

        Scanner teclado = new Scanner(System.in);

        System.out.println("cuantos meses deseas financiarlo: ");

        int meses = teclado.nextInt();
        int pago = 10;
         int total = 0;

        System.out.println("detalles de la financiacion");
         for (int i = 1; i<= meses; i++){
             System.out.println("mes " +i + "= " + pago);
             total+=pago;
             total+=pago;
             pago*=2;
         }
        System.out.println("total a pagar: "+pago+ "€");
    }
    public void ejercicio4(){

        Scanner teclado = new Scanner(System.in);
        int nota=0;
        System.out.println("Dime tu nota: ");
        nota = teclado.nextInt();
        switch (nota){

            case 0: case 1: case 2: case 3: case 4:
                    System.out.println("INSUFICIENTE");
                break;

            case 5 :
                    System.out.println("SUFICIENTE");
                break;

            case 6:
                    System.out.println("BIEN");
                break;

            case 7: case 8:
                    System.out.println("NOTABLE");
                break;

            case 9: case 10:
                    System.out.println("SOBRESALIENTE");
                break;

            default:
                System.out.println("ERROR:EL NUMERO INTRODUCIDO NO ES VALIDO");

        }
    }
    public void ejercicio5(){

        Scanner teclado = new Scanner(System.in);
        int sueldo =0;
        int sueldo1000=0;
        int sueldomax = 0;

        for (int i = 0; i < 5; i++){

            System.out.println("dime sueldo "+ (i+1)+ " :");
             sueldo = teclado.nextInt();

            if (sueldo > sueldomax){
                sueldomax = sueldo;
            }

            if (sueldo > 1000){
                sueldo1000++;
            }
        }
        System.out.println("Los sueldos mayores que 1000€ son : " +sueldo);
        System.out.println("El sueldo maximo es : " +sueldomax+ " €");
    }
    public void ejercicio6(){

        Scanner teclado = new Scanner(System.in);

        System.out.println("Cuantas edades de alumnos vas a introducir :");

        int N = teclado.nextInt();

        int edad = 0;
        int estatura = 0;
        int mayores18 =0;
        int altura175=0;


        for (int i=0; i< N; i++){

            System.out.println("Introduce la edad del alumno " + (i+1)+" :");
            edad = teclado.nextInt();
            if (edad>=18){
                mayores18++;
            }

            System.out.println("Introduce la altura del alumno " + (i+1)+" :");
            estatura = teclado.nextInt();

            if (estatura >= 175){

                altura175++;
            }
        }
        System.out.println("Alumnos mayores que 18 :" + mayores18);
        System.out.println("Alumnos altura +175cm :" + altura175);

    }
    public void ejercicio7(){
        Scanner teclado = new Scanner(System.in);

        int secuencia=0;

        System.out.println("Dime un numero entero: ");
        secuencia= teclado.nextInt();

        while (secuencia <= 0){

            System.out.println("Error: el numero no puede ser menor o igual a cero");
            System.out.println("Introduce de nuevo el valor:");
            secuencia= teclado.nextInt();
        }


        int a = 0;
        int b = 1;
        System.out.println("Secuencia de numeros: "+a);
        for (int i=0; i<secuencia; i++){
            System.out.println(" " +b);
            int resultado =a+b;
            a=b;
            b=resultado;
        }
        System.out.println();
    }
}
