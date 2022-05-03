package lol;
import apis.PilaTDA;
import impl.PilaTF;
import impl.PilaTI;
public class EjeB {
    public void ejecutar(){

        PilaTDA pila1 = new PilaTF();
        PilaTDA pila2 = new PilaTI();

        pila1.inicializarPila();
        pila2.inicializarPila();

        pila1.apilar(1);
        pila1.apilar(2);
        pila1.apilar(3);

        while(!pila1.pilaVacia()){
            pila2.apilar(pila1.tope());
            pila1.desapilar();
        }

        while(!pila2.pilaVacia()){
            pila1.apilar(pila2.tope());
            pila2.desapilar();
        }

        while(!pila1.pilaVacia()){
            System.out.println("Posicion: " + pila1.tope());
            pila1.desapilar();
        }



    }
}
