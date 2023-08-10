public class TesteReferenciaConta {

    public static void main(String[] args) {
        MostrarInformacaoUtil.pularLinha();
        MostrarInformacaoUtil.imprimirTexto("Contas criadas:");
        MostrarInformacaoUtil.pularLinha();
        Conta primeiraConta = new Conta(12, 130401849, new Cliente("Wiliam", "202.658.690-59"));
        primeiraConta.depositar(300);
        ContaUtil.imprimirInformacoesConta(primeiraConta);
        MostrarInformacaoUtil.pularLinha();
        Conta segundaConta = primeiraConta;
        ContaUtil.imprimirInformacoesConta(segundaConta);
        MostrarInformacaoUtil.pularLinha();
        Conta terceiraConta = new Conta(1, 130404598,  new Cliente("José", "896.658.690-74"));
        terceiraConta.depositar(500);
        ContaUtil.imprimirInformacoesConta(terceiraConta);

        MostrarInformacaoUtil.pularLinhaEImprimirSeparadorDeConteudo();

        MostrarInformacaoUtil.imprimirTexto("Cenário 1: comparando primeira conta com segunda");
        MostrarInformacaoUtil.pularLinha();
        ContaUtil.imprimirSeAsContasSaoOuNaoIguais(primeiraConta, segundaConta);

        MostrarInformacaoUtil.pularLinhaEImprimirSeparadorDeConteudo();

        MostrarInformacaoUtil.imprimirTexto("Cenário 2: comparando primeira conta com a terceira");
        MostrarInformacaoUtil.pularLinha();
        ContaUtil.imprimirSeAsContasSaoOuNaoIguais(primeiraConta, terceiraConta);

        MostrarInformacaoUtil.pularLinhaEImprimirSeparadorDeConteudo();

        MostrarInformacaoUtil.imprimirTexto("Cenário 3: comparando a segunda conta com a terceira");
        MostrarInformacaoUtil.pularLinha();
        ContaUtil.imprimirSeAsContasSaoOuNaoIguais(segundaConta, terceiraConta);
    }
}