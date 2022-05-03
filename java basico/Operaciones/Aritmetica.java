package Operaciones;

public class Aritmetica {
    //En casos de numeros el default quedan en 0
    int a;
    int b;

    //public void sumar(int valor1, int valor2)
    public void sumar(){
        int resultado = a + b;
        System.out.println("resultado = " + resultado);
    }

    //Pongo public y despues el tipo de valor que va a devovler, en este caso int.
    public int sumarConRetorno(){

        //int resultado = a+b;
        //return resultado;

        //pongo el return asi para hacerlo mas facil pero lo ideal seria hacerlo como arriba
        return a+b;
    }

    //Entre los parentesis estan los parametros que le mande
    public int sumarConArgumentos(int arg1, int arg2){
        a = arg1;
        b = arg2;
        //return a+b;
        return sumarConRetorno();
    }

}
