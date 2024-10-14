package org.example;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Programa1 {

    public void programa1() {

        Scanner entrada = new Scanner(System.in);

        System.out.println("ELIGE UN MODO:");
        System.out.println("1.MODO1");
        System.out.println("2.M0DO2");

        String modo = entrada.next();
        LocalDateTime hoy = LocalDateTime.now();
        int anyo_actual = hoy.getYear();
        int anyo_2 = 1800;

        boolean error = false;

        if (modo.equals("1")) {

            System.out.println("Introduce un anyo: ");
            String anyo = entrada.next();
            try {
                anyo_2 = Integer.parseInt(anyo);
            } catch (NumberFormatException e) {
                System.out.println("Has introducido un formato erroneo");
            }
            if (anyo_2 < 1900 || anyo_2 > anyo_actual) {
                System.out.println("El anyo introducido es correcto");
                error = true;
            }

        } else if (modo.equals("2")) {
            int edad = 0;
            System.out.println("Introduce tu edad: ");

            if (entrada.hasNextInt()) {
                edad = entrada.nextInt();
            } else {
                System.out.println("La edad introducida no tiene formato valido");
            }
            if (edad < 0) {
                System.out.println("la edad introducida no es valida");
                error = true;
            } else {
                anyo_2 = anyo_actual - edad;
            }

        } else {
            System.out.println("El modo introducido no es correcto");
        }
        if (error == false) {
            if (anyo_2 >= 1900 && anyo_2 <= 1927) {
                System.out.println("Eres de la generacion no bautizada");
            } else if (anyo_2 >= 1920 && anyo_2 <= 1927) {
                System.out.println("Eres de la gen silent");
            } else if (anyo_2 >= 1945 && anyo_2 <= 1964) {
                System.out.println("Eres de la gen baby boomers");
            } else if (anyo_2 <= 1965 && anyo_2 <= 1981) {
                System.out.println("Eres de la gen X");
            } else if (anyo_2 >= 1982 && anyo_2 <= 1994) {
                System.out.println("eres de la gen millennial");
            } else if (anyo_2 >= 1995 && anyo_2 <= 2009) {
                System.out.println("Eres de la gen Z");
            } else {
                System.out.println("no eres de ninguna gen");
            }
        }
    }
}
