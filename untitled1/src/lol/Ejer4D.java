package lol;
import apis.ColaTDA;
import apis.PilaTDA;
import impl.ColaPI;
import impl.PilaTF;

public class Ejer4D {
    //Determinar si los elementos finales de la Cola C1 coinciden o no con los de la Cola C2.
    public void ejecutar(){


        ColaTDA cola1 = new ColaPI();
        cola1.inicializarCola();

        ColaTDA cola2 = new ColaPI();
        cola2.inicializarCola();

        cola1.acolar(1);
        cola1.acolar(2);
        cola1.acolar(3);
        cola1.acolar(4);

        cola2.acolar(5);
        cola2.acolar(6);
        cola2.acolar(7);
        cola2.acolar(8);

        PilaTDA pila1 = new PilaTF();
        pila1.inicializarPila();

        PilaTDA pila2 = new PilaTF();
        pila2.inicializarPila();

        while(!cola1.colaVacia()){
            pila1.apilar(cola1.primero());
            cola1.desacolar();
        }

        while(!pila1.pilaVacia()){
            cola1.acolar(pila1.tope());
            pila1.desapilar();
        }

        int finalPrimeraCola = cola1.primero();

        while(!cola2.colaVacia()){
            pila2.apilar(cola2.primero());
            cola2.desacolar();
        }

        while(!pila2.pilaVacia()){
            cola2.acolar(pila2.tope());
            pila2.desapilar();
        }

        int finalSegundaCola = cola2.primero();

        if(finalPrimeraCola==finalSegundaCola){
            System.out.println("Los finales son iguales");
        }
        else {
            System.out.println("Los finales no son iguales");
        }

        //System.out.println("finalPrimeraCola = " + finalPrimeraCola);
        //System.out.println("finalSegundaCola = " + finalSegundaCola);
    }
}
