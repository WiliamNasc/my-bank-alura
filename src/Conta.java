public class Conta {
    double saldo;
    int agencia;
    int numero;
    Cliente titular = new Cliente();

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

    public double getSaldo() {
        return this.saldo;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getAgencia() {
       return this.agencia;
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

    public String toString() {
        return "\n" + "Conta: " + this.numero +
               "\n" + "Agência: " + this.agencia +
               "\n" + "Saldo: " + this.saldo +
               "\n" + this.titular.toString();
    }
}