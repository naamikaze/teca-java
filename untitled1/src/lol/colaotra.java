package lol;
import apis.ColaTDA;
import impl.ColaPI;
public class colaotra {
    public void ejecutar(){

        ColaTDA cola1 = new ColaPI();
        ColaTDA cola2 = new ColaPI();
        cola1.inicializarCola();
        cola2.inicializarCola();

        cola1.acolar(1);
        cola1.acolar(2);
        cola1.acolar(3);
        cola1.acolar(4);

        while(!cola1.colaVacia()){
            cola2.acolar(cola1.primero());
            cola1.desacolar();
        }

        while(!cola2.colaVacia()){
            System.out.println("POSICION: "+cola2.primero());
            cola2.desacolar();
        }
    }
}
