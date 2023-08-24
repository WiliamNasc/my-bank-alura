public class ContaPoupanca extends Conta{
    public ContaPoupanca (int agencia, int numero, Cliente cliente) {
        super(agencia, numero, cliente);
    }

    @Override
    public void depositar(double valor) {
        super.saldo += valor;
    }
}