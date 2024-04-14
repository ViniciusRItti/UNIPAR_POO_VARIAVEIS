import br.unipar.objeto.ContaBancaria;

class Main {
    public static void main(String[] args) {
        ContaBancaria minhaConta = new ContaBancaria("12345");

        minhaConta.depositar(1000.00);

        minhaConta.sacar(500.00);

        System.out.println("Saldo atual: R$" + minhaConta.getSaldo());
    }
}
