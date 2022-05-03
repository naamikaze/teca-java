package Operaciones;

public class PruebaAritmetica {

    //psvm
    public static void main(String[] args) {

        Aritmetica aritmetica1 = new Aritmetica();

        aritmetica1.a = 5;
        aritmetica1.b = 3;
        //aritmetica1.sumar();

        //Asigno q esa variable sea el return de la clase sumarConRetorno
        int resultado = aritmetica1.sumarConRetorno();
        System.out.println("resultado = " + resultado);

        //llamo al metodo sumarconargumentos y le asigno dos parametros
        resultado = aritmetica1.sumarConArgumentos(5, 8);
        System.out.println("Resultado usando argumentos = " + resultado);

    }




}
