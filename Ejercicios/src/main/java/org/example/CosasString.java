package org.example;

public class CosasString {
    public void caracteres (){
        String frase = "Victor y chao. Roberto bye";

        int tam = frase.length();
        System.out.println( "el tamano es "+ tam);

        char letra = frase.charAt(14);
        System.out.println( "la letra en la posicion 14 es "+ letra);

        String trozo = frase.substring(6,11);
        System.out.println("un trozo de la frase es " + trozo);

        String concatenar = frase.concat(trozo);
        System.out.println("concateno la frase con el trozo de frase anterior " + concatenar);

        int posicion = frase.indexOf("y");
        System.out.println("La posicion de a letra y es " + posicion);

        posicion = frase.indexOf("y", 8); //por si quieres saltarte otra y en caso de que la tengas repetida
        System.out.println("La posicion de a letra y es, saltando desde el 8 " + posicion);

        posicion = frase.lastIndexOf("y");
        System.out.println(" la ultima posicion y La posicion de a letra y es, saltando desde el 8 " + posicion);

        String mayusculas = frase.toUpperCase();
        System.out.println("una frase en mayusculas " + mayusculas);

        String minusculas = frase.toLowerCase();
        System.out.println("una frase en minusculas " + minusculas);

        String nombre = "Danielle                   ";
        System.out.println("Mi nombre leido desde base de datos es " + nombre + ".");

        nombre = nombre.trim();
        System.out.println("Mi nombre quitando espacios es " +nombre+ ".");

        String sinespacios = frase.replace( " ", "");
        System.out.println("Mi frase sin espacios es " + sinespacios);

        String reemplazar = frase.replace("chao", "hola");


        String palabra1 = "hola";
        String palabra2 = "adios";

        if (palabra1.equals(palabra2)){
            System.out.println("Son iguales " +palabra1+ "=" + palabra2);
        }else {
            System.out.println("no son iguales" +palabra1+ "=" +palabra2);
        }
        String palabra3 = "hola";
        String palabra4 = "Hola";

        if (palabra3.equalsIgnoreCase(palabra4)){
            System.out.println("Son iguales " +palabra3+ "=" + palabra4);
        }else {
            System.out.println("no son iguales" +palabra3+ "=" +palabra4);
        }

    int unicode = frase.compareTo(palabra1);

        if (unicode<0){
            System.out.println("valor unicode " + unicode+ " La cadena " +frase + "es mas pequena que " +palabra1);
        }else {
            if (unicode==0){
                System.out.println("valor unicode " + unicode+" la cadena "+ frase+ "tiene el mismo valor que unicode" +palabra1);
            }else {
                System.out.println("valor unicode " + unicode+" la cadena "+ palabra1+ "Es mas pequena que" +frase);
            }
        }




    }
}
