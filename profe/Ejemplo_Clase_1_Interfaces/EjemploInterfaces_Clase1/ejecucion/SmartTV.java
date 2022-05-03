package ejecucion;

public class SmartTV implements InterfazTV{
	private boolean estado; //Estado cuando es false decimos que está apagado, caso contrario true
	private int canal;
	private int volumen;
	
	public void prender() {
		if(this.estado==false)
			this.estado = true;
		
		System.out.println("Smart TV está prendido");
	}
	
	public void apagar() {
		if(this.estado == true)
			this.estado = false;
		
		this.volumen = 0;
		this.canal = 0;
		
		System.out.println("Smart TV está apagado");
	}
	
	public boolean obtenerEstado() {
		return this.estado;
	}
	
	public void cambiarCanal(int canal) {
		if(this.estado == true)
		{
			this.canal = canal;
			System.out.println("Cambiando canal del SmartTV");
		}else
			System.out.println("No se puede cambiar el canal cuando el televisor está apagado");
	}
	
	public void subirVolumen() {
		if(this.estado == true) {
			this.volumen ++;
			//System.out.println("Subiendo volúmen del Smart TV");
		}else
			System.out.println("No se puede subir el volúmen cuando el televisor está apagado");
	}
	
	public void bajarVolumen() {
		if(this.estado == true) {
			this.volumen --;
			//System.out.println("Bajando volúmen del Smart TV");
		}
		else
			System.out.println("No se puede subir el volúmen cuando el televisor está apagado");
	}
	
	public int obtenerCanal() {
		return this.canal;
	}
	
	public int obtenerVolumen() {
		return this.volumen;
	}
	
	public void conectarseAInternet() {
		System.out.println("Tv Conectándose a internet");
	}
}
