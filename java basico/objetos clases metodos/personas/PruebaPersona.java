public class PruebaPersona {
    // psvm
    //Creo un main donde ejecuto tod
    public static void main(String[] args) {
        //Creo una variable llamada persona1 con la plantilla de Persona que crre en la otra clase

        Persona persona1 = new Persona();

        //otra forma de llamar al objeto
        //Persona persona1;
        //persona1 = new Persona();

        //Le asigno un nombre y apellido propio a persona1
        persona1.nombre = "Pancho";
        persona1.apellido = "Pantera";

        //Llamo al metodo desplegarinfo con person1
        persona1.desplegarInfo();
        
        //
        
        Persona persona2 = new Persona();
        persona2.nombre = "Juan";
        //persona2.apellido = "Johnson";
        persona2.desplegarInfo();

        //Si imprimo la clase tal cual, nos muestra la referencia de memoria que ocupa la clase (lore)
        //System.out.println("persona2 = " + persona2);

    }
}
