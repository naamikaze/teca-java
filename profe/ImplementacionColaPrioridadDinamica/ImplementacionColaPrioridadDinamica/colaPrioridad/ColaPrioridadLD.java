package colaPrioridad;
import apis.ColaPrioridadTDA;

public class ColaPrioridadLD implements ColaPrioridadTDA{
	NodoPrioridad mayorPrioridad;
	
	public void inicializarCola() {
		mayorPrioridad = null;
	}
	
	public void acolarPrioridad(int x, int prioridad) {
		//Creo el nuevo nodo que voy a acolar
		NodoPrioridad nuevo = new NodoPrioridad();
		nuevo.info = x;
		nuevo.prioridad = prioridad;
		
		//si la cola est� vac�a o bien es m�s prioritario que 
		//el primero hay que agregarlo al principio
		
		if(mayorPrioridad == null || prioridad > mayorPrioridad.prioridad){
			nuevo.sig = mayorPrioridad;
			mayorPrioridad = nuevo;
		}else {
			//Sabemos que mayorPrioridad no es null
			NodoPrioridad aux = mayorPrioridad;
			
			while(aux.sig!= null && aux.sig.prioridad >= prioridad) {
				aux = aux.sig;
			}
			nuevo.sig = aux.sig;
			aux.sig = nuevo;
		}
		
	}
	
	public void desacolar() {
		mayorPrioridad = mayorPrioridad.sig;
	}
	
	public int primero() {
		return mayorPrioridad.info;
	}
	
	public boolean colaVacia() {
		return (mayorPrioridad == null);
	}
	
	public int prioridad() {
		return mayorPrioridad.prioridad;
	}
}
