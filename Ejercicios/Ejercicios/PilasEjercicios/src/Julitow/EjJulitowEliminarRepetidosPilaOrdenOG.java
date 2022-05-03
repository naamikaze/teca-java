package Julitow;
import apis.PilaTDA;
import impl.PilaTF;

public class EjJulitowEliminarRepetidosPilaOrdenOG {

	/*
	Eliminar de una Pila P las repeticiones de elementos, dejando un representante de cada uno de
	los elementos presentes originalmente. Se deberá respetar el orden original de los elementos, y
	en el caso de los repetidos se conservará el primero que haya ingresado en P.
	*/

	public static void main(String[] args) {
	        PilaTDA pilaP  = new PilaTF();
	        pilaP.inicializarPila();

	        pilaP.apilar(1);
	        pilaP.apilar(2);
	        pilaP.apilar(3);
	        pilaP.apilar(1);
	        pilaP.apilar(4);
	        pilaP.apilar(4);
	        pilaP.apilar(3);

	        eliminarRepetidos(pilaP);
	    }

	    public static void eliminarRepetidos(PilaTDA pilaOriginal) {
	        PilaTDA pilaCopia = new PilaTF();
	        PilaTDA pilaResultante = new PilaTF();
	        pilaResultante.inicializarPila();
	        pilaCopia.inicializarPila();
	        int[] arrayValores = new int[7];

	        pilaOriginal = copiarPilaInvertida(pilaOriginal, pilaCopia, arrayValores);



	        while (!pilaOriginal.pilaVacia()) {
	            modificarRepetidosArray(arrayValores, pilaOriginal.tope());
	            pilaOriginal.desapilar();
	        }

	        generarPilaResultante(arrayValores, pilaResultante);
	        System.out.println("Pila sin elementos repetidos");
	        while (!pilaResultante.pilaVacia()) {
	            System.out.println("Valor: " + pilaResultante.tope());
	            pilaResultante.desapilar();
	        }
	    }

	    public static void generarPilaResultante(int[] array, PilaTDA pila) {
	        for (int i = 0; i < array.length; i ++) {
	            if (array[i] != 0) {
	                pila.apilar(array[i]);
	            }
	        }
	    }

	    public static PilaTDA copiarPilaInvertida(PilaTDA pilaOriginal, PilaTDA pilaCopia, int[] array) {
	        PilaTDA pilaAux = new PilaTF();
	        pilaAux.inicializarPila();
//	        int[] arrayValores = new int[7];
//	        int index = 0;

	        while (!pilaOriginal.pilaVacia()) {
	            pilaCopia.apilar(pilaOriginal.tope());
//	            arrayValores[index] = pilaOriginal.tope();
	            pilaOriginal.desapilar();
//	            index++;
	        }

	        array = crearArrayValores(pilaCopia, array);

	        for (int i = array.length - 1; i >= 0 ; i--) {
	            pilaAux.apilar(array[i]);
	        }
	        return pilaAux;
	    }

	    public static int[] crearArrayValores(PilaTDA pila, int[] array) {

	        int index = 0;

	        while (!pila.pilaVacia()) {
	            array[index] = pila.tope();
	            pila.desapilar();
	            index++;
	        }
	        return array;
	    }
	    
	    public static void modificarRepetidosArray(int[] array, int valor) {
	        int contador = 0;
	        for (int i = 0; i < array.length; i++) {
	            if (array[i] == valor) {
	                contador ++;
	                if (contador > 1) {
	                    array[i] = 0;
	                }
	            }
	        }
	    }
}