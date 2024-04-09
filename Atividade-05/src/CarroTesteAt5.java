
public class CarroTesteAt5 {
    public static void main(String[] args) {

        CarroAt5 meuCarro = new CarroAt5();


        meuCarro.marca = "Toyota";
        meuCarro.modelo = "Corolla";
        meuCarro.ano = 2022;
        meuCarro.cor = "Prata";
        meuCarro.preco = 85000.00;


        meuCarro.ligar();
        meuCarro.acelerar();
        meuCarro.frear();
        meuCarro.desligar();
    }
}

