package com.company;

public class TryCatchMain {

    public static void main(String[] args) {

        //int resultado = 5 / 0;   //ejm para manejar el error
        //System.out.println("Fin");

        try {
            int resultado = 5 / 0;
        } catch (ArithmeticException e) {  //aricmetic para capturar la excepcion concreta
            e.printStackTrace();
        }
        System.out.println("Fin");
    }
}
