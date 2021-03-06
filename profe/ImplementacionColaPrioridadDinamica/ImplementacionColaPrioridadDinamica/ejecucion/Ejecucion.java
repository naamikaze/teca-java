package ejecucion;
import apis.ColaPrioridadTDA;

import colaPrioridad.*;

import java.util.Scanner;

public class Ejecucion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcion = 0;
		// TODO Auto-generated method stub
		ColaPrioridadTDA objColaPrioridad = new ColaPrioridadLD();
		
		objColaPrioridad.inicializarCola();
		
		while(opcion!= -1) {
			int prioridad = 0;
			int elemento = 0;
			System.out.println("Ingrese un elemento (-1 para salir): ");
			opcion = sc.nextInt();
			
			if(opcion >= 0) {
				elemento = opcion;
				System.out.println("Ingrese una prioridad para el elemento: ");
				prioridad = sc.nextInt();
				
				objColaPrioridad.acolarPrioridad(elemento, prioridad);
			}	
		}
		
		/*objColaPrioridad.acolarPrioridad(100, 10);
		objColaPrioridad.acolarPrioridad(200, 20);
		objColaPrioridad.acolarPrioridad(400, 40);
		objColaPrioridad.acolarPrioridad(300, 30);
		*/
		while(!objColaPrioridad.colaVacia()) {
			System.out.println("El elemento: " + objColaPrioridad.primero() + " Tiene la prioridad de :" + objColaPrioridad.prioridad());
			objColaPrioridad.desacolar();
		}
	}

}
