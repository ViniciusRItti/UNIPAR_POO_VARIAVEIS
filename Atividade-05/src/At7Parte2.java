package br.unipar.main;
import br.unipar.objeto.Produto;

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto(1, "Produto ...", 10.5, 50);

        System.out.println("Descrição do produto: " + produto1.getDescricao());
        System.out.println("Preço do produto: " + produto1.getPreco());
        System.out.println("Quantidade em estoque: " + produto1.getQuantidadeEmEstoque());

        produto1.adicionarEstoque(20);
        produto1.removerEstoque(15);
    }
}
