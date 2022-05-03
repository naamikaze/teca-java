package pilas;

public class PilaTF implements PilaTDA {
	int[] a;
	int indice;
	
	public void inicializarPila() {
// TODO Auto-generated method stub
		a=new int[100]; // Declara un array de 100 elementos
		indice=0;// indice también es contador
	}

	public void Apilar(int x){
		a[indice] = x;
		indice++;
	}
	
	public void Desapilar(){
		indice--;
	}
	
	public boolean PilaVacia(){
		return (indice == 0);
	}
	
	public int Tope(){
		return a[indice -1];
	}
}
