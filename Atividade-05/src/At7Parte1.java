public class Produto {
    private int codigo;
    private String descricao;
    private double preco;
    private int quantidadeEmEstoque;

    public Produto(int codigo, String descricao, double preco, int quantidadeEmEstoque) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void adicionarEstoque(int quantidade) {
        if (quantidade > 0) {
            quantidadeEmEstoque += quantidade;
            System.out.println("Estoque adicionado com sucesso. Nova quantidade em estoque: " + quantidadeEmEstoque);
        } else {
            System.out.println("Quantidade inválida para adicionar ao estoque.");
        }
    }

    public void removerEstoque(int quantidade) {
        if (quantidade > 0 && quantidade <= quantidadeEmEstoque) {
            quantidadeEmEstoque -= quantidade;
            System.out.println("Estoque removido com sucesso. Nova quantidade em estoque: " + quantidadeEmEstoque);
        } else {
            System.out.println("Quantidade inválida para remover do estoque .");
        }
    }
}

