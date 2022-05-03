package ejerciciosColaTDA;
import apis.ColaTDA;
import impl.ColaPI;

public class PasarCola {

	public static void main(String[] args) {
		ColaTDA c = new ColaPI();
		ColaTDA colaCopia = new ColaPI();
		c.inicializarCola();
		colaCopia.inicializarCola();
		
		c.acolar(1);
		c.acolar(2);
		c.acolar(3);
		c.acolar(4);
		
		while(!c.colaVacia()) {
			System.out.println("Valor cola: " + c.primero());
			colaCopia.acolar(c.primero());
			c.desacolar();
			
		}
		
		while(!colaCopia.colaVacia()) {
			System.out.println("Valor cola copia: " + colaCopia.primero());
			colaCopia.desacolar();
			
		}
		
	}

}