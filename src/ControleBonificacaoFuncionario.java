public class ControleBonificacaoFuncionario {
    private double totalDeBonificacoes;

    public double getTotalDeBonificacoes() {
        return totalDeBonificacoes;
    }

    public void registrarBonificacaoFuncionario(Funcionario funcionario) {
        this.totalDeBonificacoes += funcionario.getBonificacao();
    }
}