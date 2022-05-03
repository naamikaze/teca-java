package com.company;

//Clase main
public class Main {
    //Ejecuto el programa main
    public static void main(String[] args) {

        var nombre = "Pancho";
        System.out.println("Nueva linea: \n" + nombre);  // el \n es un salto de linea
        System.out.println("Tabulador: \t" + nombre); // el \t es un tabulador
        System.out.println("Retroceso: \b" + nombre); // el \b es un retroceso (borra un espacio), mientras mas ponga mas espacios borra
        System.out.println("Comilla simple: \'" + nombre + "'"); //Pone comillas
        System.out.println("Comilla doble: \"" + nombre + "\""); //Pone comillas dobles

    }
}
