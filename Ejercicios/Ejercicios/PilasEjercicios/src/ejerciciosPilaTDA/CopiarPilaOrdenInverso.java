package ejerciciosPilaTDA;
import apis.PilaTDA;
import impl.PilaTF;
import impl.PilaTI;

public class CopiarPilaOrdenInverso {

	public static void main(String[] args) {
		PilaTDA pilaOriginal = new PilaTF();
		PilaTDA pilaCopia = new PilaTI();
		
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
			System.out.println("Valor de la Pila Copia: " + pilaCopia.tope());
		}
	}
}
