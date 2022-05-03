package lol;
import apis.ColaTDA;
import impl.ColaPU;
import impl.ColaPI;
import java.util.*;

//Invertir el contenido de una Cola (NO pueden usarse Pilas auxiliares)
public class Ejer4C {
    public void ejecutar(){

        ColaTDA cola1 = new ColaPU();
        ColaTDA cola2 = new ColaPI();

        cola1.inicializarCola();
        cola2.inicializarCola();

        cola1.acolar(1);
        cola1.acolar(2);
        cola1.acolar(3);
        cola1.acolar(4);

        int contador = 0;
        while(!cola1.colaVacia()){
            contador++;
            cola2.acolar(cola1.primero());
            cola1.desacolar();
        }

    }
}
