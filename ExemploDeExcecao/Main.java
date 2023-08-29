package ExemploDeExcecao;

import ExemploDeExcecao.CategoriaInvalidaException;
import ExemploDeExcecao.Grupo;
import ExemploDeExcecao.Heroi;

public class Main {
    public static void main(String[] args) {
        Grupo grupo = new Grupo();
        try {
            grupo.adicionarHeroi(new Heroi("Marcus", "LADINO"));
        }catch (CategoriaInvalidaException exception){
            System.out.println(exception.getMessage());
            System.out.println("Insira uma das categorias: \nCAVALEIRO \nLANCEIRO \nBARBARO \nARQUEIRO");
        }

    }
}
