package ejecucion;

public interface InterfazTV {
	public void prender();
	public void apagar();
	public void subirVolumen();
	public void bajarVolumen();
	public void cambiarCanal(int canal);
	public boolean obtenerEstado();
	public int obtenerCanal();
	public int obtenerVolumen();
}
