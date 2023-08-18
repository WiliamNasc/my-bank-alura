public class TesteControleReferencia {

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("João");
        funcionario.setSalario(1000);

        Gerente gerente = new Gerente();
        gerente.setNome("Maria");
        gerente.setSalario(2000);

        Recepcionista recepcionista = new Recepcionista();
        recepcionista.setNome("Cleiton");
        recepcionista.setSalario(600);

        ControleBonificacaoFuncionario controleBonificacaoFuncionario = new ControleBonificacaoFuncionario();
        controleBonificacaoFuncionario.registrarBonificacaoFuncionario(funcionario);
        controleBonificacaoFuncionario.registrarBonificacaoFuncionario(gerente);
        controleBonificacaoFuncionario.registrarBonificacaoFuncionario(recepcionista);

        System.out.println("Soma das bonificações da empresa: " + controleBonificacaoFuncionario.getTotalDeBonificacoes());
    }

}