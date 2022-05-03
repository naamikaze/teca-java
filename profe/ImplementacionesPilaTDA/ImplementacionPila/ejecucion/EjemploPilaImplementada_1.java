package ejecucion;
import pilas.*;

public class EjemploPilaImplementada_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PilaTDA objPila = new PilaTI();
		
		objPila.inicializarPila();
		
		objPila.Apilar(10);
		objPila.Apilar(20);
		objPila.Apilar(30);
		objPila.Apilar(40);
		objPila.Apilar(50);
		
		while(!objPila.PilaVacia()) {
			System.out.println("Valor de la pila: " + objPila.Tope());
			objPila.Desapilar();
		}
		

	}

}
