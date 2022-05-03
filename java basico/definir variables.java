package com.company;

//Clase main
public class Main {
    //Ejecuto el programa main
    public static void main(String[] args) {

        //Escribo una cadena
        System.out.println("Hola mundo desde Java");

        //Defino variable int (entero) con un valor de 10
        int miVariableEntera = 10;

        //Printeo la variable que cree
        System.out.println(miVariableEntera);

        //Una vez definida la variable (linea 12) no hace falta volver a poner int
        miVariableEntera = 5;

        //poniendo sout te hace un print rapido
        //System.out.println();

        System.out.println("Variable que cree: "+miVariableEntera);

        //Defino variable string (texto)
        String miVariableCadena = "Hola que tal";
        System.out.println(miVariableCadena);

        miVariableCadena = "Chau";
        System.out.println(miVariableCadena);

        //var sirve para crear texto o numeros y que lo identifique automaticamente.
        var miVariableEntera2 = 35;
        System.out.println(miVariableEntera2);

        var miVariableCadena2 = "Texto var";

        //con soutv imprime la ultima variable definida
        System.out.println("miVariableCadena2 = " + miVariableCadena2);

    }
}
