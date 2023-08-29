package src;
public class Lista {
    Object[] elementos;
    public Lista(){
        this.elementos = new Object[0];
    }
    public void adicionarElemento(Object elemento){
        if(elementos.length % 10 == 0){
            int quociente = (elementos.length / 10) +1;
            Object[] novoArray = new Object[quociente * 10];
            int i;
            for (i = 0; i < elementos.length; i++) {
                novoArray[i] = elementos[i];
            }
            novoArray[i] = elementos;

        }elementos[elementos.length - 1] = elementos;
    }
}
