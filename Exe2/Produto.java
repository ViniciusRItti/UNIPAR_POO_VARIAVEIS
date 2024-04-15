package Exe2;

public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    public Produto(String nome, double preco, int quantidadeEmEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$" + preco);
        System.out.println("Quantidade em Estoque: " + quantidadeEmEstoque);
    }

    public void vender(int quantidade) {
        if (quantidade <= quantidadeEmEstoque) {
            quantidadeEmEstoque -= quantidade;
            System.out.println(quantidade + " unidades de " + nome + " vendidas.");
        } else {
            System.out.println("Estoque insuficiente para vender " + quantidade + " unidades de " + nome + ".");
        }
    }

    public void adicionarEstoque(int quantidade) {
        quantidadeEmEstoque += quantidade;
        System.out.println(quantidade + " unidades de " + nome + " adicionadas ao estoque.");
    }

    public static void main(String[] args) {
        Produto produto1 = new Produto("Tenis", 299.99, 30);
        Produto produto2 = new Produto("Camiseta", 50.00, 250);

        System.out.println("Produto 1:");
        produto1.exibirInformacoes();
        System.out.println();

        System.out.println("Produto 2:");
        produto2.exibirInformacoes();
        System.out.println();

        produto1.vender(15);
        produto1.adicionarEstoque(20);
        produto2.vender(200);
        produto2.adicionarEstoque(100);
    }
}

