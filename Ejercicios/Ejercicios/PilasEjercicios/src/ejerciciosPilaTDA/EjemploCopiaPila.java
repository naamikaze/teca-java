package ejerciciosPilaTDA;
import apis.PilaTDA;
import impl.PilaTF;

public class EjemploCopiaPila {

    public static void main(String[] args) {
        PilaTDA pila = new PilaTF();
        PilaTDA pilaCopia= new PilaTF();
        
        pila.inicializarPila();
        pilaCopia.inicializarPila();

        pila.apilar(1);
        pila.apilar(2);
        pila.apilar(3);
        pila.apilar(4);

        pila = copiarPila(pila,pilaCopia);
        
        print("original", pila);
        print("copia", pilaCopia);
        
//        while(!pila.pilaVacia()) {
//            System.out.println("Valor de la pila original: " + pila.tope());
//            pila.desapilar();
//        }

//        while(!pilaCopia.pilaVacia()) {
//            System.out.println("Valor de la pila Copia: " + pilaCopia.tope());
//            pilaCopia.desapilar();
//
//        }

    }
    
    public static void print(String s, PilaTDA pila) {
    	while(!pila.pilaVacia()) {
        	System.out.println("Valor de la pila " + s + ": " + pila.tope());
        	pila.desapilar();
    	}
    	
    }
    	
    public static PilaTDA copiarPila(PilaTDA pilaOriginal, PilaTDA pilaCopia) {
        PilaTDA pilaAuxiliar = new PilaTF();
        pilaAuxiliar.inicializarPila();

        while (!pilaOriginal.pilaVacia()) {
            pilaCopia.apilar(pilaOriginal.tope());
            pilaAuxiliar.apilar(pilaOriginal.tope());

            pilaOriginal.desapilar();
        }

        return pilaAuxiliar;
        
    }

}