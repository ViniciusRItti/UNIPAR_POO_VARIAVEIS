package exe3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Produto[] produtos = new Produto[10];
        int totalProdutos = 0;

        while (true) {
            System.out.println("\nSelecione a operação:");
            System.out.println("1. Adicionar novo produto");
            System.out.println("2. Atualizar preço ou quantidade em estoque");
            System.out.println("3. Exibir detalhes de um produto específico");
            System.out.println("4. Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do produto:");
                    String nome = scanner.nextLine();
                    System.out.println("Digite o preço do produto:");
                    double preco = scanner.nextDouble();
                    System.out.println("Digite a quantidade em estoque:");
                    int quantidade = scanner.nextInt();

                    Produto novoProduto = new Produto(nome, preco, quantidade);
                    produtos[totalProdutos] = novoProduto;
                    totalProdutos++;
                    System.out.println("Produto adicionado com sucesso!");
                    break;
                case 2:
                    System.out.println("Digite o nome do produto:");
                    String nomeProduto = scanner.nextLine();
                    boolean produtoEncontrado = false;
                    for (int i = 0; i < totalProdutos; i++) {
                        if (produtos[i].getNome().equals(nomeProduto)) {
                            produtoEncontrado = true;
                            System.out.println("Produto encontrado. O que deseja atualizar?");
                            System.out.println("1. Preço");
                            System.out.println("2. Quantidade em estoque");
                            int escolha = scanner.nextInt();
                            scanner.nextLine(); // Consumir a quebra de linha

                            switch (escolha) {
                                case 1:
                                    System.out.println("Digite o novo preço:");
                                    double novoPreco = scanner.nextDouble();
                                    produtos[i].setPreco(novoPreco);
                                    System.out.println("Preço atualizado com sucesso!");
                                    break;
                                case 2:
                                    System.out.println("Digite a nova quantidade em estoque:");
                                    int novaQuantidade = scanner.nextInt();
                                    produtos[i].setQuantidadeEmEstoque(novaQuantidade);
                                    System.out.println("Quantidade em estoque atualizada com sucesso!");
                                    break;
                                default:
                                    System.out.println("Opção inválida.");
                            }
                            break;
                        }
                    }
                    if (!produtoEncontrado) {
                        System.out.println("Produto não encontrado.");
                    }
                    break;
                case 3:
                    System.out.println("Digite o nome do produto:");
                    nomeProduto = scanner.nextLine();
                    produtoEncontrado = false;
                    for (int i = 0; i < totalProdutos; i++) {
                        if (produtos[i].getNome().equals(nomeProduto)) {
                            produtoEncontrado = true;
                            System.out.println("Detalhes do produto:");
                            System.out.println("Nome: " + produtos[i].getNome());
                            System.out.println("Preço: R$" + produtos[i].getPreco());
                            System.out.println("Quantidade em Estoque: " + produtos[i].getQuantidadeEmEstoque());
                            break;
                        }
                    }
                    if (!produtoEncontrado) {
                        System.out.println("Produto não encontrado.");
                    }
                    break;
                case 4:
                    System.out.println("Saindo...");
                    System.exit(0);
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}