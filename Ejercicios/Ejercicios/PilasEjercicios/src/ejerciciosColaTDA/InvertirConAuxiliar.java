package ejerciciosColaTDA;
import apis.ColaTDA;
import impl.ColaPI;
import apis.PilaTDA;
import impl.PilaTF;

public class InvertirConAuxiliar {

	public static void main(String[] args) {
        ColaTDA c = new ColaPI();        
        PilaTDA pila1 = new PilaTF();
        
        c.inicializarCola();
        pila1.inicializarPila();

        c.acolar(1);
        c.acolar(2);
        c.acolar(3);
        c.acolar(4);

        while(!c.colaVacia()) {
            System.out.println("Valor Cola: " + c.primero());
            pila1.apilar(c.primero());
            c.desacolar();

        }

        while(!pila1.pilaVacia()) {
            System.out.println("Valor Pila: " + pila1.tope());
            c.acolar(pila1.tope());
            pila1.desapilar();
            
        }

        while(!c.colaVacia()) {
            System.out.println("Valor Cola Invertida: " + c.primero());
            c.desacolar();
            
        }
        
    }
	
}