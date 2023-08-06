public class Conta {
    double saldo;
    int agencia = 1;
    int numero;
    Cliente titular;

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

    public boolean transferir (double valor, Conta conta) {
        if (sacar(valor)) {
            conta.depositar(valor);
            return true;
        }
        return false;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setTitular(Cliente cliente) {
        this.titular = cliente;
    }

    public Cliente getTitular() {
        return titular;
    }
}