public class Gerente extends LoginFuncionario {
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