package ejecucion;
import apis.ColaPrioridadTDA;
import colaPrioridad.*;

public class Ejecucion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ColaPrioridadTDA objColaPrioridad = new ColaPrioridadDA();
		
		objColaPrioridad.inicializarCola();
		
		objColaPrioridad.acolarPrioridad(100, 10);
		objColaPrioridad.acolarPrioridad(200, 20);
		objColaPrioridad.acolarPrioridad(400, 40);
		objColaPrioridad.acolarPrioridad(300, 30);
		
		while(!objColaPrioridad.colaVacia()) {
			System.out.println("El elemento: " + objColaPrioridad.primero() + " Tiene la prioridad de :" + objColaPrioridad.prioridad());
			objColaPrioridad.desacolar();
		}
	}

}
