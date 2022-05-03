package ejerciciosPilaTDA;
import apis.PilaTDA;
import impl.PilaTF;

public class SumarElementosPila {

	public static void main(String[] args) {
		PilaTDA p = new PilaTF();
		int suma = 0;
		
		p.inicializarPila();
		
		p.apilar(10);
		p.apilar(20);
		p.apilar(30);
		p.apilar(40);


		while(!p.pilaVacia()) {
		System.out.println("Valor pila: " + p.tope());
		suma += p.tope();
		p.desapilar();	
		
		}
		
		System.out.println("Suma pila: " + suma);
		
	}
	
}