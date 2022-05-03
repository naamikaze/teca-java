package com.company;

//Clase main
public class Main {
    //Ejecuto el programa main
    public static void main(String[] args) {

        var usuario = "Pancho";
        var titulo = "Pantera";

        //Concateno las dos variables de arriba
        var union = titulo + " " + usuario;
        System.out.println("union = " + union);

        var i = 3;
        var j = 4;

        //Suma de los dos enteros i + j
        System.out.println(i + j);

        //Hace la suma pero concatena usuario
        System.out.println(i + j + usuario);

        //En este caso concatena tod, siempre funciona de izquierda a derecha la suma
        System.out.println(usuario + i + j);

        //Si pongo parentesis prioriza el parentesis
        System.out.println(usuario + (i + j));



    }
}
