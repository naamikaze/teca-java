package test;

// import dominio.*;  // Para importar todas las clases de un paquete
import dominio.Persona;

public class PersonaPrueba {
    //psvm
    public static void main(String[] args) {

        Persona persona1 = new Persona("Juan", 5000, false);

        persona1.setNombre("Juan Carlos");
        System.out.println("Nombre: "+persona1.getNombre());
        System.out.println("Sueldo: "+persona1.getSueldo());
        System.out.println("eliminado: "+persona1.isEliminado());

    }
}
