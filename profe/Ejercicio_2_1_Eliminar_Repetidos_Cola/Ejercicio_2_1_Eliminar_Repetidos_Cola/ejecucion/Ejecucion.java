package ejecucion;
import apis.ColaTDA;
import impl.ColaLD;
import impl.ColaPU;

public class Ejecucion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ColaTDA cola = new ColaPU();
		ColaTDA colaRepetidos = new ColaPU();
		
		cola.inicializarCola();
		colaRepetidos.inicializarCola();
		
		cola.acolar(1);
		cola.acolar(1);
		cola.acolar(2);
		cola.acolar(3);
		
		colaRepetidos = devolverRepetidos(cola);
		
		while(!colaRepetidos.colaVacia()) {
			System.out.println("El elemento: " + colaRepetidos.primero() + "Está repetido ");
			colaRepetidos.desacolar();
		}
	}
	
	public static ColaTDA devolverRepetidos(ColaTDA colaVerificar) {
		int[] arrayCola = new int[100];
		ColaTDA colaRepetidos = new ColaPU();
		int i = 0;
		
		ColaTDA colaCopia = new ColaPU();
		
		colaCopia.inicializarCola();
		colaRepetidos.inicializarCola();
		
		colaVerificar = copiarCola(colaVerificar, colaCopia);
		
		cargarValoresArray(colaCopia, arrayCola);
		
		while(!colaVerificar.colaVacia()) {
			if(repetido(arrayCola, colaVerificar.primero())) {
				colaRepetidos.acolar(colaVerificar.primero());
			}
			colaVerificar.desacolar();
		}
		
		return colaRepetidos;
	}
	
	public static void cargarValoresArray(ColaTDA cola, int[] array) {
		int i = 0;
		while(!cola.colaVacia()) {
			array[i] = cola.primero();
			cola.desacolar();
			i++;
		}
	}
	
	public static ColaTDA copiarCola(ColaTDA colaOriginal, ColaTDA colaCopia) {
		ColaTDA colaAux = new ColaPU();
		colaAux.inicializarCola();
		
		while(!colaOriginal.colaVacia()) {
			colaCopia.acolar(colaOriginal.primero());
			colaAux.acolar(colaOriginal.primero());
			
			colaOriginal.desacolar();
		}
		
		return colaAux;
	}
	
	public static boolean repetido(int[] array, int valor) {
		boolean estaRepetido = false;
		int contador = 0;
		int i;
		for(i=0; i<array.length; i++) {
			if(array[i] == valor) {
				contador++;
				if(contador>1)
				{
					estaRepetido = true;
					return estaRepetido;
				}
			}
		}
		return estaRepetido;
	}

}
