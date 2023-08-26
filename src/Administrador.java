public class Administrador extends LoginFuncionario {
    @Override
    public double getBonificacao() {
        return 1000;
    }

    public String toString() {
        return "Administrador\n" + super.toString();
    }
}