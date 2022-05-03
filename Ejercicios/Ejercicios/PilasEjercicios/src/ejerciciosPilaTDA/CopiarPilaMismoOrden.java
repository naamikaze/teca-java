package ejerciciosPilaTDA;
import apis.PilaTDA;
import impl.PilaTF;

public class CopiarPilaMismoOrden {

	public static void main(String[] args) {
		PilaTDA pilaOriginal = new PilaTF();
		PilaTDA pilaCopia = new PilaTF();
		
		pilaOriginal.inicializarPila();
		pilaCopia.inicializarPila();
		
		pilaOriginal.apilar(10);
		pilaOriginal.apilar(20);
		pilaOriginal.apilar(30);
		pilaOriginal.apilar(40);
		pilaOriginal.apilar(50);
		
		while(!pilaOriginal.pilaVacia()) {
			pilaCopia.apilar(pilaOriginal.tope());
			pilaOriginal.desapilar();
			
		}
		
		while(!pilaCopia.pilaVacia()) {
			System.out.println("Valor de la Pila Copia: " + pilaCopia.tope());
			pilaCopia.desapilar();		
			
		}
	}
}
