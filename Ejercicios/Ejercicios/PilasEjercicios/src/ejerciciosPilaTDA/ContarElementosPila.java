package ejerciciosPilaTDA;
import apis.PilaTDA;
import impl.PilaTF;

public class ContarElementosPila {

	public static void main(String[] args) {
		PilaTDA p = new PilaTF();
		int contador = 0;
		
		p.inicializarPila();
		
		p.apilar(1);
		p.apilar(2);
		p.apilar(3);
		p.apilar(4);
		

		while(!p.pilaVacia()) {
		System.out.println("Valor pila:" + p.tope());	
		contador++;
		p.desapilar();		
		}
		
		System.out.println("Cantidad elementos pila:" + contador);	
		
	}
}