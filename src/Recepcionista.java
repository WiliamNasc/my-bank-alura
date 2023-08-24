public class Recepcionista extends  Funcionario{
    public double getPercentualBonificacao() {
        return 0.01;
    }
    public double getBonificacao() {
        return super.getSalario() * this.getPercentualBonificacao();
    }

    public String toString() {
        return "Recepcionista\n" + super.toString();
    }
}