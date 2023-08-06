public class TesteReferenciaConta {

    public static void main(String[] args) {
        ClasseUtil.pularLinha();
        ClasseUtil.imprimirTexto("Contas criadas:");
        ClasseUtil.pularLinha();
        Conta primeiraConta = ClasseUtil.criarConta();
        primeiraConta.setNumero(1);
        primeiraConta.depositar(300);
        ClasseUtil.imprimirInformacoesConta(primeiraConta);
        ClasseUtil.pularLinha();
        Conta segundaConta = primeiraConta;
        segundaConta.setNumero(2);
        ClasseUtil.imprimirInformacoesConta(segundaConta);
        ClasseUtil.pularLinha();
        Conta terceiraConta = ClasseUtil.criarConta();
        terceiraConta.setNumero(3);
        terceiraConta.depositar(500);
        ClasseUtil.imprimirInformacoesConta(terceiraConta);

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