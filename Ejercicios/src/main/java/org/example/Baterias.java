package org.example;

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
}
