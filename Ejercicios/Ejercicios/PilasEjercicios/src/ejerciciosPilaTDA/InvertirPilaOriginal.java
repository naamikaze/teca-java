package ejerciciosPilaTDA;
import apis.PilaTDA;
import impl.PilaTF;

public class InvertirPilaOriginal {
	
    public static void main(String[] args) {
        PilaTDA pilaOriginal = new PilaTF();
        PilaTDA pilaAux= new PilaTF();
        
        pilaOriginal.inicializarPila();
        pilaAux.inicializarPila();

        pilaOriginal.apilar(1);
        pilaOriginal.apilar(2);
        pilaOriginal.apilar(3);
        pilaOriginal.apilar(4);
        
        while(!pilaOriginal.pilaVacia()) {
        	pilaAux.apilar(pilaOriginal.tope());
        	pilaOriginal.desapilar();           
        }
        
	    while(!pilaAux.pilaVacia()) {
	    	pilaOriginal.apilar(pilaAux.tope());
        	System.out.println("Valor de la pila original: " + pilaOriginal.tope());
	    	pilaAux.desapilar();
	    }
	    
	    while(!pilaOriginal.pilaVacia()) {
		    System.out.println("Valor de la pila original invertida: " + pilaOriginal.tope());
		    pilaOriginal.desapilar();     
	    }
    }
}