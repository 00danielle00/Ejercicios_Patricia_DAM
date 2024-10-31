package org.example;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Repasotema2 {
    public void ejercicio1() {

        Scanner teclado = new Scanner(System.in);
        System.out.println("cuantos numeros quieres introducir: ");
        int num = teclado.nextInt();

        int mayorcero = 0;
        int menorcero = 0;
        int igualcero = 0;

        for (int i = 0; i < num; i++) {
            System.out.println("introduce numero: " + (i + 1));
            int numero = teclado.nextInt();

            if (numero > 0) {
                mayorcero++;
            }
            if (numero < 0) {
                menorcero++;
            }
            if (numero == 0) {
                igualcero++;
            }
        }
        System.out.println("los numero mayores a 0 son : " + mayorcero);
        System.out.println("los numero menores a 0 son : " + menorcero);
        System.out.println("los numero iguales a 0 son : " + igualcero);

    }

    public void ejercicio2() {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Dime la base:");
        int base = teclado.nextInt();

        System.out.println("Dime el exponente:");
        int expo = teclado.nextInt();

        int potencia = 1;

        for (int i = 0; i < expo; i++) {

            potencia *= base;
        }
        System.out.println("El resultado es " + potencia);

    }

    public void ejercicio3() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("En cuantos meses los quieres financiar: ");
        int financiacion = teclado.nextInt();

        int mes = 10;
        int totalfinanciacion = 0;

        for (int i = 0; i < financiacion; i++) {
            System.out.println("Mes " + (i + 1) + " :" + mes + " €");
            totalfinanciacion += mes;
            mes += mes;
        }
        System.out.println("Financiacion de " + financiacion + " meses");
        System.out.println("Total a pagar :" + totalfinanciacion + " €");
    }

    public void ejercicio4() {

        Scanner teclado = new Scanner(System.in);

        int nota = 0;
        try {
            System.out.println("Dime tu nota: ");
            nota = teclado.nextInt();
        } catch (InputMismatchException err) {
            System.out.println("ERROR: el valor introducido no es valido");
            return;
        }

        switch (nota) {

            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("INSUFICIENTE");
                break;
            case 5:
                System.out.println("SUFICIENTE");
                break;
            case 6:
                System.out.println("BIEN");
                break;
            case 7:
            case 8:
                System.out.println("NOTABLE");
                break;
            case 9:
            case 10:
                System.out.println("SOBRESALIENTE");
                break;
            default:
                System.out.println("ERROR, VALOR MAL INTRODUCIDO");
                break;
        }

    }

    public void ejercicio5() {

        Scanner teclado = new Scanner(System.in);

        int sueldo = 0;

        int sueldomaximo = 0;
        int masdemil = 0;

        for (int i = 0; i < 5; i++) {
            try {
                System.out.println("Sueldo: " + (i + 1));
                sueldo = teclado.nextInt();
            } catch (InputMismatchException error) {
                System.out.println("ERROR:VALOR INTRODUCIDO ERRÓNEO");
                break;
            }

            if (sueldo > 1000) {
                masdemil++;
            }
            if (sueldo > sueldomaximo) {
                sueldomaximo = sueldo;
            }

        }
        System.out.println("Ganan mas de 1000€: " + masdemil);
        System.out.println("Sueldo más alto: " + sueldomaximo);

    }

    public void ejercicio6() {

        Scanner teclado = new Scanner(System.in);

        System.out.println("cuantos alumnos quieres introducir");
        int N = teclado.nextInt();

        int estatura = 0;
        int edad = 0;
        int mayores = 0;
        int altura = 0;

        for (int i = 0; i < N; i++) {
            System.out.println("Introduce la edad: " + (i + 1));
            edad = teclado.nextInt();
            System.out.println("Introduce la altura: " + (i + 1));
            estatura = teclado.nextInt();

            if (edad >= 18) {
                mayores++;
            }
            if (estatura >= 175) {
                altura++;
            }
        }
        System.out.println("Cantidad de alumnos mayores de 18: " + mayores);
        System.out.println("Cantidad de alumnos mayores que 175: " + altura);

    }

    public void ejercicio7() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese un la secuencia: ");

        int secuencia = teclado.nextInt();

        int a = 0;
        int b = 1;
        System.out.println(" " + a);
        for (int i = 0; i < secuencia; i++) {
            System.out.println(" " + b);
            int resultado = a + b;
            a = b;
            b = resultado;
        }
        System.out.println();
    }
}

