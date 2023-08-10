public class TesteGetSetConta {
    public static void main(String[] args) {
        MostrarInformacaoUtil.pularLinha();
        MostrarInformacaoUtil.imprimirTexto("Criando conta");
        Conta conta = new Conta(1, 123456, new Cliente("Wiliam", "123.456.789-10"));
        MostrarInformacaoUtil.pularLinha();

        MostrarInformacaoUtil.pularLinhaEImprimirSeparadorDeConteudo();

        MostrarInformacaoUtil.imprimirTexto("Cenário 1: adicionando (set) dados do titular via conta");
        conta.getTitular().setProfissao("Desenvolvedor");
        ContaUtil.imprimirInformacoesConta(conta);

        MostrarInformacaoUtil.pularLinhaEImprimirSeparadorDeConteudo();


        MostrarInformacaoUtil.imprimirTexto("Cenário 2: adicionando (set) dados do titular via nova referência de cliente");
        Cliente cliente = new Cliente("João", "228.465.879-69", "Arquiteto");
        conta.setTitular(cliente);
        ContaUtil.imprimirInformacoesConta(conta);

        MostrarInformacaoUtil.pularLinhaEImprimirSeparadorDeConteudo();

        MostrarInformacaoUtil.imprimirTexto("Cenário 3: validando se os clientes possuem a mesma referência");
        MostrarInformacaoUtil.imprimirTexto("Os clientes possuem a mesma referência: " + ContaUtil.osClientePossuemMesmaReferencia(conta.getTitular(), cliente));
    }
}