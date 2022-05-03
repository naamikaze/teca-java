package lol;
import apis.PilaTDA;
import impl.PilaTF;
public class contapila {
    public void ejecutar(){

        int cont = 0;
        int acum = 0;
        double resu;
        PilaTDA pila1 = new PilaTF();

        pila1.inicializarPila();

        pila1.apilar(1);
        pila1.apilar(2);
        pila1.apilar(3);
        pila1.apilar(4);

        while(!pila1.pilaVacia()){
            cont++;
            acum += pila1.tope();
            pila1.desapilar();
        }

        resu = (double)acum/cont;
        System.out.println("Resultado: "+resu);


    }
}
