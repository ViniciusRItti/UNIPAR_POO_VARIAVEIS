package Exe1;

public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private String cor;

    public Carro(String marca, String modelo, int ano, String cor) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void exibirInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);
    }

    public static void main(String[] args) {
        Carro carro1 = new Carro("Chevrolet", "Prisma", 2020, "Preto");
        Carro carro2 = new Carro("Chevrolet", "S10", 2021, "Branco");

        System.out.println("Informações do Carro 1:");
        carro1.exibirInformacoes();
        System.out.println();

        System.out.println("Informações do Carro 2:");
        carro2.exibirInformacoes();
        System.out.println();

        System.out.println("Atualizando informações do Carro 1:");
        carro1.setAno(2023);
        carro1.setCor("Branco");
        carro1.exibirInformacoes();
    }
}
