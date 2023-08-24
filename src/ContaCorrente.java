public class ContaCorrente extends Conta{
    public ContaCorrente(int agencia, int numero, Cliente cliente) {
        super(agencia, numero, cliente);
    }

    @Override
    public boolean sacar(double valor) {
        return super.sacar(valor + 0.2);
    }
}