package ejerciciosColaTDA;
import apis.ColaTDA;
import impl.ColaPI;

public class InvertirCola {

	public static void main(String[] args) {
		ColaTDA c = new ColaPI();
		ColaTDA colaAux = new ColaPI();
		ColaTDA cola3 = new ColaPI();
		ColaTDA cola4 = new ColaPI();
		
		c.inicializarCola();
		colaAux.inicializarCola();
		cola3.inicializarCola();
		cola4.inicializarCola();
		
		c.acolar(1);
		c.acolar(2);
		c.acolar(3);
		c.acolar(4);		
		
		for (int i = 0; i < 3; i++) {
			System.out.println("Valor Cola: " + c.primero());
			colaAux.acolar(c.primero());
			c.desacolar();		
		}
		System.out.println("Valor Cola: " + c.primero());
		
		for (int i = 0; i < 2; i++) {
			cola3.acolar(colaAux.primero());
			colaAux.desacolar();
		}
		
		cola4.acolar(cola3.primero());
		cola3.desacolar();		
		
		c.acolar(colaAux.primero());
		c.acolar(cola3.primero());
		c.acolar(cola4.primero());
		
		while(!c.colaVacia()) {
			System.out.println("Valor Cola Invertida: " + c.primero());
			c.desacolar();
		}
		
	}
	
}
