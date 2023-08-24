public abstract class Conta {
    protected double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int totalContasInstanciadas;

    public Conta(int agencia, int numero, Cliente cliente) {
        totalContasInstanciadas++;
        this.agencia = agencia;
        this.numero = numero;
        this.titular = cliente;
    }

    public abstract void depositar (double valor);

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

    public int getAgencia() {
        return this.agencia;
    }

    public int getNumero() {
        return this.numero;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente cliente) {
        this.titular = cliente;
    }

    public static int getTotalContasInstanciadas() {
        return totalContasInstanciadas;
    }

    public String toString() {
        return "\n" + "Conta: " + this.numero +
                "\n" + "Agência: " + this.agencia +
                "\n" + "Saldo: " + this.saldo +
                "\n" + this.titular.toString();
    }
}