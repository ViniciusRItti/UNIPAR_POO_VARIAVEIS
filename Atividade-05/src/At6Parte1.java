public class ContaBancaria {
    private double saldo;
    private String numeroConta;

    public ContaBancaria(String numeroConta) {
        this.numeroConta = numeroConta;
        this.saldo = 0.0;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Erro: Valor de depósito inválido.");
        }
    }

    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Erro: Saldo insuficiente para efetuar o saque.");
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNumeroConta() {
        return numeroConta;
    }
}
