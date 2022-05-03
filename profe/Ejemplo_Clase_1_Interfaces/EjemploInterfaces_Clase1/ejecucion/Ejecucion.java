package ejecucion;

public class Ejecucion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Televisor tvComedor = new Televisor();
		Televisor tvPieza1 = new Televisor();
		SmartTV tvSmart = new SmartTV();
		InterfazTV tvNoSmart = new Televisor();
		
		utilizarTV(tvSmart);
		
		tvSmart.conectarseAInternet();
		
		System.out.println("--------------------------------");
		
		utilizarTV(tvNoSmart);
		
		
		
	}
	
	private static void utilizarTV(InterfazTV tv) {
		tv.prender();
		System.out.println("¿El tv está prendido?: " + tv.obtenerEstado());
		
		tv.cambiarCanal(11);
		System.out.println("El tv está en el canal: " + tv.obtenerCanal());
		
		for(int i = 0; i< 10; i++) {
			tv.subirVolumen();
		}
		
		System.out.println("El volúmen del TV es: " + tv.obtenerVolumen());
		
	}

}
