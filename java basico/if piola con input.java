package com.company;
import java.util.Scanner;

//Clase main
public class Main {
    //Ejecuto el programa main
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un numero: ");
        int numero = Integer.parseInt(scanner.nextLine());

        if(numero >= 23){
            System.out.println("anashe");
        }
        else{
            System.out.println("epic fail");
        }

    }
}
