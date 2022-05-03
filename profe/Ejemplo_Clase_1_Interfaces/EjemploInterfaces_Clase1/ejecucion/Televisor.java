package ejecucion;


public class Televisor implements InterfazTV{
	private boolean estado; //Estado cuando es false decimos que está apagado, caso contrario true
	private int canal;
	private int volumen;
	
	public void prender() {
		if(this.estado==false)
			this.estado = true;
	}
	
	public void apagar() {
		if(this.estado == true)
			this.estado = false;
		
		this.volumen = 0;
		this.canal = 0;
	}
	
	public boolean obtenerEstado() {
		return this.estado;
	}
	
	public void cambiarCanal(int canal) {
		if(this.estado == true)
			this.canal = canal;
		else
			System.out.println("No se puede cambiar el canal cuando el televisor está apagado");
	}
	
	public void subirVolumen() {
		if(this.estado == true)
			this.volumen ++;
		else
			System.out.println("No se puede subir el volúmen cuando el televisor está apagado");
	}
	
	public void bajarVolumen() {
		if(this.estado == true)
			this.volumen --;
		else
			System.out.println("No se puede subir el volúmen cuando el televisor está apagado");
	}
	
	public int obtenerCanal() {
		return this.canal;
	}
	
	public int obtenerVolumen() {
		return this.volumen;
	}
}
