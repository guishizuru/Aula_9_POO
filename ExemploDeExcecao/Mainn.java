package ExemploDeExcecao;

import java.util.Scanner;

public class Mainn {
    public static void main(String[] args) throws CategoriaInvalidaException {
        Scanner scanner = new Scanner(System.in);
        String nome = scanner.next();

        if(nome.contains("Ramos")){
            throw new CategoriaInvalidaException("Ramos, Não !");
        }
    }
}
