public class TesteGetSetConta {
    public static void main(String[] args) {
        ClasseUtil.pularLinha();
        ClasseUtil.imprimirTexto("Criando conta");
        Conta conta = new Conta();
        ClasseUtil.pularLinha();

        ClasseUtil.pularLinhaEImprimirSeparadorDeConteudo();

        ClasseUtil.imprimirTexto("Cenário 1: adicionando (set) dados da conta");
        conta.setNumero(1234);
        conta.setAgencia(1);
        ClasseUtil.imprimirInformacoesConta(conta);

        ClasseUtil.pularLinhaEImprimirSeparadorDeConteudo();

        ClasseUtil.imprimirTexto("Cenário 2: adicionando (set) dados do titular via conta");
        conta.getTitular().setNome("Wiliam");
        conta.getTitular().setProfissao("Desenvolvedor");
        conta.getTitular().setCpf("123.456.789-96");
        ClasseUtil.imprimirInformacoesConta(conta);

        ClasseUtil.pularLinhaEImprimirSeparadorDeConteudo();


        ClasseUtil.imprimirTexto("Cenário 3: adicionando (set) dados do titular via nova referência de cliente");
        Cliente cliente = ClasseUtil.criarCliente();
        cliente.setNome("João");
        cliente.setProfissao("Arquiteto");
        cliente.setCpf("228.465.879-69");
        conta.setTitular(cliente);
        ClasseUtil.imprimirInformacoesConta(conta);

        ClasseUtil.pularLinhaEImprimirSeparadorDeConteudo();

        ClasseUtil.imprimirTexto("Cenário 4: validando se os clientes possuem a mesma referência");
        ClasseUtil.imprimirTexto("Os clientes possuem a mesma referência: " + osClientePossuemMesmaReferencia(conta.getTitular(), cliente));
    }

    public static boolean osClientePossuemMesmaReferencia(Cliente cliente1, Cliente cliente2) {
        return cliente1 == cliente2;
    }
}