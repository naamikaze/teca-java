package ejecucion;

public class Ejecucion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Televisor tvComedor = new Televisor();
		Televisor tvPieza1 = new Televisor();
		
		tvComedor.prender();
		System.out.println("�El tv del comedor est� prendido?: " + tvComedor.obtenerEstado());
		
		tvComedor.cambiarCanal(11);
		System.out.println("El tv del comedor est� en el canal: " + tvComedor.obtenerCanal());
		
		for(int i = 0; i< 10; i++) {
			tvComedor.subirVolumen();
		}
		
		System.out.println("El televisor est� en el nivel de vol�men: " + tvComedor.obtenerVolumen());
		
		tvPieza1.cambiarCanal(13);
		//tvPieza1.canal = 13;
		
		System.out.println("�El televisor est� prendido?" + tvPieza1.obtenerEstado());
		System.out.println("El tv de la pieza1 est� en el canal " + tvPieza1.obtenerCanal());
		
	}

}
