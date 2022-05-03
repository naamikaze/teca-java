public class Persona {
    //Defino atributos de clase (informacion de lo que tiene)
    //Le puedo asignar un valor por default o no le puedo asignar nada y queda como "null"
    String nombre = "No ingresado";
    String apellido;

    //Metodos (las ejecuciones que puede tener el objeto)

    //Void significa q no devuelve nada
    //El parentesis recibe inforamcion (como si fueran clases de python)
    public void desplegarInfo(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Apellido: "+apellido);
    }
}
