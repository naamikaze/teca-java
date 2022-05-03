package ejecucion;

public class Ejecucion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Televisor tvComedor = new Televisor();
		Televisor tvPieza1 = new Televisor();
		
		tvComedor.prender();
		System.out.println("¿El tv del comedor está prendido?: " + tvComedor.obtenerEstado());
		
		tvComedor.cambiarCanal(11);
		System.out.println("El tv del comedor está en el canal: " + tvComedor.obtenerCanal());
		
		for(int i = 0; i< 10; i++) {
			tvComedor.subirVolumen();
		}
		
		System.out.println("El televisor está en el nivel de volúmen: " + tvComedor.obtenerVolumen());
		
		tvPieza1.cambiarCanal(13);
		//tvPieza1.canal = 13;
		
		System.out.println("¿El televisor está prendido?" + tvPieza1.obtenerEstado());
		System.out.println("El tv de la pieza1 está en el canal " + tvPieza1.obtenerCanal());
		
	}

}
