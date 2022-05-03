package colaPrioridad;

import apis.ColaPrioridadTDA;

public class ColaPrioridadDA implements ColaPrioridadTDA {
	int [] elementos;
	int [] prioridades;
	int indice;

	public void inicializarCola() {
		elementos = new int[100];
		prioridades = new int[100];
		indice = 0;
	}
	
	public void acolarPrioridad(int x, int prioridad) {
		int j;
		// Encuentra lugar donde acolar al nuevo elemento desplazando a derecha
		for(j = indice;j>0 && prioridades[j-1]>=prioridad; j--) {
			elementos[j] = elementos[j-1];// Desplazo a derecha
			
			prioridades[j] = prioridades[j-1];// Desplazo a derecha
		}
		elementos[j] = x;
		prioridades[j] = prioridad;
		indice++;
	}

	public void desacolar() {
		indice--;
	}
	
	public boolean colaVacia() {
		return(indice==0);
	}
	
	public int primero() {
		return elementos[indice-1];
	}
	
	public int prioridad() {
		return prioridades[indice-1];
	}
}

