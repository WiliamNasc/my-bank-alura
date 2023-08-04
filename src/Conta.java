public class Conta {
    double saldo;
    int agencia = 1;
    int numero;
    String titular;

    public void depositar (double valor) {
        this.saldo += valor;
    }
    public boolean sacar (double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        }
        return false;
    }
}