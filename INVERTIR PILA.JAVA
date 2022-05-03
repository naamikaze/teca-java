import apis.PilaTDA;
import impl.PilaTF;
import impl.PilaTI;

public class Ejercicio_C {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //C) Invertir el contenido de una Pila. 
        
        PilaTDA pilaOriginal = new PilaTF();
        PilaTDA pilaCopia = new PilaTI();
        
        pilaOriginal.inicializarPila();
        pilaCopia.inicializarPila();
        
        
        pilaOriginal.apilar(1);
        pilaOriginal.apilar(2);
        pilaOriginal.apilar(3);
        pilaOriginal.apilar(4);
        
        while(!pilaOriginal.pilaVacia()) {
            pilaCopia.apilar(pilaOriginal.tope());
            pilaOriginal.desapilar();
        }
            
        while(!pilaCopia.pilaVacia()) {
            pilaOriginal.apilar(pilaCopia.tope());
            pilaCopia.desapilar();
            System.out.println("Valor de la pila original " + pilaOriginal.tope());
        }
        
        while(!pilaOriginal.pilaVacia()) {
            System.out.println("Valor de la pila Invertida: " + pilaOriginal.tope());
            pilaOriginal.desapilar();     
        }
    }
}