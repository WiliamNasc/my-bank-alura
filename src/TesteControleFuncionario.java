public class TesteControleFuncionario {

    public static void main(String[] args) {
        System.out.println("Criando funcionário do tipo gerente");
        Gerente gerente = new Gerente();
        gerente.setNome("Maria");
        gerente.setSalario(2000);
        System.out.println();
        System.out.println(gerente.toString());

        System.out.println();
        System.out.println("=============================================");
        System.out.println();

        System.out.println("Criando funcionário do tipo recepcionista");
        Recepcionista recepcionista = new Recepcionista();
        recepcionista.setNome("Cleiton");
        recepcionista.setSalario(600);
        System.out.println();
        System.out.println(recepcionista.toString());

        System.out.println();
        System.out.println("=============================================");
        System.out.println();

        System.out.println("Criando funcionário do tipo vigilante");
        Vigilante vigilante = new Vigilante();
        vigilante.setNome("Josefa");
        vigilante.setSalario(3000);
        System.out.println();
        System.out.println(vigilante.toString());

        System.out.println();
        System.out.println("=============================================");
        System.out.println();

        ControleBonificacaoFuncionario controleBonificacaoFuncionario = new ControleBonificacaoFuncionario();
        controleBonificacaoFuncionario.registrarBonificacaoFuncionario(gerente);
        controleBonificacaoFuncionario.registrarBonificacaoFuncionario(recepcionista);
        controleBonificacaoFuncionario.registrarBonificacaoFuncionario(vigilante);

        System.out.println("Soma das bonificações dos funcionários: " + controleBonificacaoFuncionario.getTotalDeBonificacoes());
    }

}