package org.example;

import java.util.Scanner;

public class Excepciones {

    public void excepciones (){

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce dividendo: ");
        String numero = teclado.next();
        System.out.println("Introduce divisor: ");
        int dividendo =0;

        if (teclado.hasNextInt()){
            dividendo = teclado.nextInt();
        }else {
            System.out.println("El formato no es numerico");
        }

        int num_entero = 0;
        int division = 0;

        try {
            num_entero = Integer.parseInt(numero);
            division =  dividendo / num_entero;


        }catch (NumberFormatException e1 ){
            System.out.println("No has escrito un numero... " + e1.getMessage());

        }catch (ArithmeticException e2 ){
            System.out.println("El dominador es 0, division erronea. " + e2.getMessage());
        }
        finally {
            if (num_entero != 0){
                System.out.println("El resultado es " + division);
            }
        }
    }
}
