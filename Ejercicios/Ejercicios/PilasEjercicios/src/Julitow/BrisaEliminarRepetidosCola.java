package Julitow;
import apis.ColaTDA;
import impl.ColaPU;
import apis.ConjuntoTDA;
import impl.ConjuntoLD;

public class BrisaEliminarRepetidosCola {

    public static void main(String[] args) {
        ColaTDA C = new ColaPU();
        ConjuntoTDA conjunto = new ConjuntoLD();
        C.inicializarCola();
        conjunto.inicializarConjunto();

        C.acolar(1);
        C.acolar(2);
        C.acolar(3);
        C.acolar(4);
        C.acolar(4);
        eliminarRepetidos(C,conjunto);

        while(!C.colaVacia()) {
            System.out.println("Cola sin repetidos: " + C.primero());
            C.desacolar();
        }

    }

    public static void eliminarRepetidos(ColaTDA C, ConjuntoTDA conjunto) {
        ColaTDA cola = new ColaPU();
        cola.inicializarCola();
        while(!C.colaVacia()) {
            int primero = C.primero();
            if (!conjunto.pertenece(primero)) {
                cola.acolar(primero);
                conjunto.agregar(primero);

            }
            C.desacolar();

        }
        while(!cola.colaVacia()) {
            C.acolar(cola.primero());
            cola.desacolar();
        }


    }

}