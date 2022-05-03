package lol;
import apis.ColaTDA;
import impl.ColaPI;
import apis.PilaTDA;
import impl.PilaTI;


//Invertir el contenido de una Cola (pueden usarse Pilas auxiliares)
public class Ejer4B {
    public void ejecutar(){

        ColaTDA cola1 = new ColaPI();
        cola1.inicializarCola();

        PilaTDA pila1 = new PilaTI();
        pila1.inicializarPila();

        cola1.acolar(1);
        cola1.acolar(2);
        cola1.acolar(3);
        cola1.acolar(4);

        while(!cola1.colaVacia()){
            pila1.apilar(cola1.primero());
            cola1.desacolar();

        }

        while(!pila1.pilaVacia()){
            cola1.acolar(pila1.tope());
            pila1.desapilar();
        }

        while(!cola1.colaVacia()){
            System.out.println("posicion: "+cola1.primero());
            cola1.desacolar();
        }
    }
}
