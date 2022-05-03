package ejerciciosPilaTDA;

import apis.PilaTDA;
import impl.PilaTF;

public class PromedioElementosPila {

	public static void main(String[] args) {
		PilaTDA p = new PilaTF();
		int suma = 0;
		int contador = 0;
		
		p.inicializarPila();
		
		p.apilar(10);
		p.apilar(20);
		p.apilar(30);
		p.apilar(40);
		p.apilar(50);

		while(!p.pilaVacia()) {
		System.out.println("Valor pila: " + p.tope());
		suma += p.tope();
		contador++;
		p.desapilar();	
		
		}		
		
		double promedio = suma / contador;
		System.out.println("Promedio: " + promedio);
		
	}

}