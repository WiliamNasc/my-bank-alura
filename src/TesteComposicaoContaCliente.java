public class TesteComposicaoContaCliente {
    public static void main(String[] args) {
        MostrarInformacaoUtil.pularLinha();
        MostrarInformacaoUtil.imprimirTexto("Criando cliente");
        Cliente cliente = new Cliente("Wiliam", "448.456.789-10", "Desenvolvedor");

        MostrarInformacaoUtil.pularLinhaEImprimirSeparadorDeConteudo();

        MostrarInformacaoUtil.imprimirTexto("Criando conta");
        Conta conta = new Conta(1126, 130402022, null);
        conta.depositar(100);

        MostrarInformacaoUtil.pularLinhaEImprimirSeparadorDeConteudo();

        MostrarInformacaoUtil.imprimirTexto("Cenário 1: Associando conta ao cliente");
        MostrarInformacaoUtil.pularLinha();
        conta.setTitular(cliente);
        ContaUtil.imprimirInformacoesConta(conta);
        MostrarInformacaoUtil.pularLinhaEImprimirSeparadorDeConteudo();
    }
}