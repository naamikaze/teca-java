package ejecucion;
import apis.ConjuntoTDA;
import impl.ConjuntoTA;

public class Ejecucion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConjuntoTA conjuntoA = new ConjuntoTA();
		ConjuntoTA conjuntoB = new ConjuntoTA();
		ConjuntoTA conjuntoResultado;
		
		conjuntoA.inicializarConjunto();
		conjuntoB.inicializarConjunto();
		
		conjuntoA.agregar(1);
		conjuntoA.agregar(2);
		conjuntoA.agregar(3);
		conjuntoA.agregar(4);
		
		conjuntoB.agregar(1);
		conjuntoB.agregar(4);
		conjuntoB.agregar(5);
		conjuntoB.agregar(6);
		
		conjuntoResultado = diferenciaSimetrica(conjuntoA, conjuntoB);
		
		while(!conjuntoResultado.conjuntoVacio()) {
			int valor = conjuntoResultado.elegir();
			System.out.println("Valor del conjunto: " + valor);
			conjuntoResultado.sacar(valor);
		}
	}
	
	private static ConjuntoTA diferenciaSimetrica(ConjuntoTA objConjuntoA, ConjuntoTA objConjuntoB) {
		ConjuntoTA objConjuntoResultado = new ConjuntoTA();
		ConjuntoTA objConjuntoAuxiliar = new ConjuntoTA();
		
		
		objConjuntoAuxiliar.inicializarConjunto();		
		objConjuntoResultado.inicializarConjunto();
		
		objConjuntoA = copiarConjunto(objConjuntoA, objConjuntoAuxiliar);
		
		while(!objConjuntoAuxiliar.conjuntoVacio()) {
			int valor = objConjuntoAuxiliar.elegir();
			
			if(!objConjuntoB.pertenece(valor))
				objConjuntoResultado.agregar(valor);
			
			objConjuntoAuxiliar.sacar(valor);
		}
		
		while(!objConjuntoB.conjuntoVacio()) {
			int valor = objConjuntoB.elegir();
			
			if(!objConjuntoA.pertenece(valor))
				objConjuntoResultado.agregar(valor);
			
			objConjuntoB.sacar(valor);
		}
		
		return objConjuntoResultado;
	}
	
	private static ConjuntoTA copiarConjunto(ConjuntoTA conjuntoOrig, ConjuntoTA conjuntoCopia) {
		ConjuntoTA conjuntoDevolver = new ConjuntoTA();
		conjuntoDevolver.inicializarConjunto();
		
		while(!conjuntoOrig.conjuntoVacio()) {
			int valor = 0;
			valor = conjuntoOrig.elegir();
			conjuntoCopia.agregar(valor);
			conjuntoDevolver.agregar(valor);
			conjuntoOrig.sacar(valor);
		}
		
		return conjuntoDevolver;
		
	}

}
