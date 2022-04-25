package com.company;

import java.util.Locale;

public class StringMain {

    public static void main(String[] args) {

        //La clase String

        /*
        length()
        startsWith()
        endsWith()
        indexOf()
        subString()
        trim()
        equals()
        compareTo()
         */

        String mensaje = " Hola mundo ";
        System.out.println(mensaje.length());

        String mensajeMayus = mensaje.toUpperCase();
        System.out.println(mensajeMayus);
        System.out.println(mensajeMayus.trim()); //Quitamos espacios iniciales y finales.

        mensajeMayus = mensajeMayus.trim();
        String otroString = "HOLA MUNDO";
        if (mensajeMayus.equals(otroString)){  // equals -> Compara la cadena de texto contra un objeto
            System.out.println("Verdadero");
        }
    }
}
