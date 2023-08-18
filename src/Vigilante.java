public class Vigilante extends Funcionario{

    public double getPercentualBonificacao() {
        return 0;
    }
    public double getBonificacao() {
        return 100;
    }


    public String toString() {
        return "Vigilante\n" + super.toString();
    }
}