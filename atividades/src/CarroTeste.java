
public class CarroTeste {
    public static void main(String[] args) {

        Carro meuCarro = new Carro();


        meuCarro.marca = "Toyota";
        meuCarro.modelo = "Corolla";
        meuCarro.ano = 2022;
        meuCarro.cor = "Prata";
        meuCarro.preco = 85000.00;


        System.out.println("Características do carro:");
        System.out.println("Marca: " + meuCarro.marca);
        System.out.println("Modelo: " + meuCarro.modelo);
        System.out.println("Ano: " + meuCarro.ano);
        System.out.println("Cor: " + meuCarro.cor);
        System.out.println("Preço: R$" + meuCarro.preco);


        meuCarro.ligar();
        meuCarro.acelerar();
        meuCarro.frear();
        meuCarro.desligar();
    }
}

