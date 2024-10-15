package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {

    public void calculadora () {

        Scanner entrada = new Scanner(System.in);

        System.out.println("BIENVENIDO A LA CALCULADORA RAPIDA");

        System.out.println("Introduce un operando");
        int op1 = 0;

        try {
            op1 = entrada.nextInt();

        }catch (InputMismatchException error){
            System.out.println("ERROR:El valor introducido es incorrecto");
            return;
        }

        System.out.println("Introduce el signo a aplicar (+, -, /, x, R): ");

        String signo = entrada.next();

        if(signo.equals("R")){
            if (op1 <= 0){
                System.out.println("ERROR:LA RAIZ CUADRADA NO PUEDE SER MENOR O IGUAL A 0");
                return;
            }else {
            System.out.println("El resultado es "+ Math.sqrt(op1));
            return;
            }
        }

        System.out.println("Introduce un segundo operando: ");

        int op2 = 0;

        try {
             op2 = entrada.nextInt();
        }catch (InputMismatchException error2){
            System.out.println("ERROR:El valor introducido es incorrecto");
            return;
        }


        switch (signo){

            case "-":
                int total = op1 - op2;
                System.out.println("El resultado es " + total);
                break;

            case "+":
                int total_suma = op1 + op2;
                System.out.println("El resultado es " + total_suma);
                break;

            case "/":
                try{
                    int total_div = op1/op2;
                    System.out.println("El resultado es " + total_div);

                }catch (ArithmeticException err){
                    System.out.println("Error: No puedes dividir entre ceros");
                }
                break;

            case "x":
                int total_mul = op1*op2;
                System.out.println("El resultado es " + total_mul);
                break;

            default:
                System.out.println("Error: dato no valido");
                break;
        }
    }
}
