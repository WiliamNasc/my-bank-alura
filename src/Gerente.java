public class Gerente extends Funcionario{
    private int senha;

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public boolean autentica(int senha) {
        return this.senha == senha;
    }

    public double getPercentualBonificacao() {
        return 0.2;
    }

    public double getBonificacao() {
        return super.getSalario() + (super.getSalario() * this.getPercentualBonificacao());
    }

    public String toString() {
        return "Gerente\n" + super.toString();
    }
}