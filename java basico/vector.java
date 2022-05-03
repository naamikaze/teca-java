public class vector {
    //declaro el vector con 10 espacios
    int[] numeros = new int[10];

    //tambien lo puedo declarar con cosas adentro ya
    //int[] numeros = new int[]{1,2,3,4,5};
    
    //Hago un for con la longitud del vector
    for (int i = 0; i<numeros.lenght; i++){
        numeros [i] = (int) Math.pow(i, 3); //Basicamentre le mto la posicion del vector elevada al cubo para llenar algo
    }
    
    for (int num: numeros){
        System.out.println("num = " + num);
    }
}
