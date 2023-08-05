public class TesteReferenciaConta {

    public static void main(String[] args) {
        ClasseUtil.pularLinha();
        ClasseUtil.imprimirTexto("Contas criadas:");
        ClasseUtil.pularLinha();
        Conta primeiraConta = ClasseUtil.criarConta();
        ClasseUtil.adicionarNumeroConta(primeiraConta, 1);
        primeiraConta.depositar(300);
        ClasseUtil.imprimirSaldoConta(primeiraConta);
        Conta segundaConta = primeiraConta;
        ClasseUtil.adicionarNumeroConta(segundaConta, 2);
        ClasseUtil.imprimirSaldoConta(segundaConta);
        Conta terceiraConta = ClasseUtil.criarConta();
        ClasseUtil.adicionarNumeroConta(terceiraConta, 3);
        terceiraConta.depositar(500);
        ClasseUtil.imprimirSaldoConta(terceiraConta);

        ClasseUtil.pularLinhaEImprimirSeparadorDeConteudo();

        ClasseUtil.imprimirTexto("Cenário 1: comparando primeira conta com segunda");
        ClasseUtil.pularLinha();
        ClasseUtil.imprimirSeAsContasSaoOuNaoIguais(primeiraConta, segundaConta);

        ClasseUtil.pularLinhaEImprimirSeparadorDeConteudo();

        ClasseUtil.imprimirTexto("Cenário 2: comparando primeira conta com a terceira");
        ClasseUtil.pularLinha();
        ClasseUtil.imprimirSeAsContasSaoOuNaoIguais(primeiraConta, terceiraConta);

        ClasseUtil.pularLinhaEImprimirSeparadorDeConteudo();

        ClasseUtil.imprimirTexto("Cenário 3: comparando a segunda conta com a terceira");
        ClasseUtil.pularLinha();
        ClasseUtil.imprimirSeAsContasSaoOuNaoIguais(segundaConta, terceiraConta);
    }
}