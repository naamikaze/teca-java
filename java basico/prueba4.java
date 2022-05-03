package com.company;
import java.util.Scanner;

//Clase main
public class Main {
    //Ejecuto el programa main
    public static void main(String[] args) {

        /*
        Tipos primitivos enterios: byte, short, int, long
        Generalmente se utiliza int
         */

        byte numeroByte = (byte)131;
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("Valor minimo byte: "+ Byte.MIN_VALUE);
        System.out.println("Valor maximo byte: "+ Byte.MAX_VALUE);
        
        short numeroShort = 10;
        System.out.println("numeroShort = " + numeroShort);

        System.out.println("Valor minimo short: "+ Short.MIN_VALUE);
        System.out.println("Valor maximo short: "+ Short.MAX_VALUE);

        System.out.println("Valor minimo int: "+ Integer.MIN_VALUE);
        System.out.println("Valor maximo int: "+ Integer.MAX_VALUE);

        long numeroLong = 10;
        System.out.println("Valor minimo long: "+ Long.MIN_VALUE);
        System.out.println("Valor maximo long: "+ Long.MAX_VALUE);



    }
}
