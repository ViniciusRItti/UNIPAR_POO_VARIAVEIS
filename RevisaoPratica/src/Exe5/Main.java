package Exe5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Produto produto1 = new Produto("Camiseta");
        Produto produto2 = new Produto("Calça", 49.99);
        Produto produto3;

        System.out.println("Digite o nome do produto:");
        String nome = scanner.nextLine();
        System.out.println("Digite o preço do produto:");
        double preco = scanner.nextDouble();
        System.out.println("Digite a quantidade em estoque do produto:");
        int quantidade = scanner.nextInt();

        produto3 = new Produto(nome, preco, quantidade);

        System.out.println("\nProdutos criados:");
        System.out.println("Produto 1 - Nome: " + produto1.getNome() + ", Preço: " + produto1.getPreco() +
                ", Quantidade em Estoque: " + produto1.getQuantidadeEmEstoque());
        System.out.println("Produto 2 - Nome: " + produto2.getNome() + ", Preço: " + produto2.getPreco() +
                ", Quantidade em Estoque: " + produto2.getQuantidadeEmEstoque());
        System.out.println("Produto 3 - Nome: " + produto3.getNome() + ", Preço: " + produto3.getPreco() +
                ", Quantidade em Estoque: " + produto3.getQuantidadeEmEstoque());
    }
}