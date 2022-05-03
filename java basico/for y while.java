package com.company;
import java.util.Scanner;

//Clase main
public class Main {
    //Ejecuto el programa main
    public static void main(String[] args) {

        System.out.println("WHILE DE 3");
        var conta = 0;
        while(conta < 3){
            System.out.println("Paso = " + (conta+1));
            conta++;
        }

        System.out.println(" ");

        System.out.println("FOR DE 3");
        //Primera parte defino el contador, segunda establezco la condicion y tercera lo q hace, es como si usara el while.
        for(var contador = 0; contador < 3 ; contador++ ){
            System.out.println("Paso = " + (contador+1));
        }

    }
}
