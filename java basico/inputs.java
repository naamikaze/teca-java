package com.company;
import java.util.Scanner;

//Clase main
public class Main {
    //Ejecuto el programa main
    public static void main(String[] args) {


        //Importamos la clase para poder usar el scanner y lo asignamos a una variable (consola)
        Scanner consola = new Scanner(System.in);

        System.out.println("Ingrese el usuario: ");
        //Creo una variable usuario que basciamente es consola y le agreglo el nextline para que lea una linea completa
        var usuario = consola.nextLine();

        System.out.println("Ingrese el titulo: ");
        //Ya teniendo definido consola arriba(11) puedo usarlo para otras variables.
        var titulo = consola.nextLine();

        System.out.println("Resultado = " + titulo + " " + usuario);

    }
}
