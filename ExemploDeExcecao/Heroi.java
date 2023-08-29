package ExemploDeExcecao;

import ExemploDeExcecao.Arma;

public class Heroi {
    private String nome;
    private String categoria;
    private Arma arma;

    public Heroi(String nome, String  categoria){
        this.nome = nome;
        this.categoria = categoria;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    public Arma getArma() {
        return arma;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String  getCategoria() {
        return categoria;
    }
}
