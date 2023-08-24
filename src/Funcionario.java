public abstract class Funcionario {
    private String nome;
    private String cpf;
    private double salario;

    public double getBonificacao() {
        return this.salario * this.getPercentualBonificacao();
    }

    public double getPercentualBonificacao() {
        return 0.1;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String toString() {
        return "Nome: " + this.nome + "\n" +
                "CPF: " + this.cpf + "\n" +
                "Salário: " + this.salario + "\n" +
                "Percentual de bonificação: " + this.getPercentualBonificacao() + "\n" +
                "Bonificação: " + this.getBonificacao();
    }
}