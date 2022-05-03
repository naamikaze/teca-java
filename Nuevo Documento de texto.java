package colas;
import apis.ColaTDA;
import impl.ColaPU;
import java.util.;

public class InvertirColaSinAux {

    public static void main(String[] args) {
         TODO Auto-generated method stub
        ColaTDA cola = new ColaPU();
        cola.inicializarCola();
        ArrayList Integer aux = new ArrayList();


        cola.acolar(1);
        cola.acolar(2);
        cola.acolar(3);
        cola.acolar(4);



        int contador = 0;
        while (!cola.colaVacia()) {
            aux.add(cola.primero());
            contador += 1;
            cola.desacolar();

        }

        while (contador != 0){
            cola.acolar(aux.get(contador));
            System.out.println(Cola Invertida + cola.primero());
            contador--;


        }



    }

}