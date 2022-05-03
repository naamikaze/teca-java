package lol;
import apis.PilaTDA;
import  impl.PilaTF;

public class eje {
    public void ejeA(){

        PilaTDA pila1 = new PilaTF();
        PilaTDA pila2 = new PilaTF();

        pila1.inicializarPila();
        pila2.inicializarPila();

        pila1.apilar(1);
        pila1.apilar(2);
        pila1.apilar(3);
        pila1.apilar(4);
        pila1.apilar(5);

        while(!pila1.pilaVacia()){
            pila2.apilar(pila1.tope());
            pila1.desapilar();
            System.out.println("Posicion: "+pila2.tope());
        }

    }
}
