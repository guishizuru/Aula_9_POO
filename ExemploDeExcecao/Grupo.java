package ExemploDeExcecao;

import ExemploDeExcecao.Arma;
import ExemploDeExcecao.CategoriaInvalidaException;

import java.util.ArrayList;
import java.util.List;

public class Grupo {
    private List<Heroi> herois;

    public Grupo(){
        this.herois= new ArrayList<>();
    }
    public void adicionarHeroi(Heroi heroi) throws CategoriaInvalidaException {
        String categoria = heroi.getCategoria();
        switch (categoria){
            case "ARQUEIRO":
                heroi.setArma(Arma.ARCO);
                break;
            case "BARBARO":
                heroi.setArma(Arma.MACHADO);
                break;
            case "CAVALEIRO":
                heroi.setArma(Arma.ESPADA);
                break;
            case "LANCEIRO":
                heroi.setArma(Arma.LANCA);
                break;
            default:
                throw  new CategoriaInvalidaException("CATEGORIA INVÁLIDA !");
        }
        this.herois.add(heroi);
    }
}
