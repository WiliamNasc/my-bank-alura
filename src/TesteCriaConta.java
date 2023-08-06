public class TesteCriaConta {
    public static void main(String[] args) {
        ClasseUtil.pularLinha();
        ClasseUtil.imprimirTexto("Criando contas com valores depositados de 200 e 300 reais");
        Conta primeiraConta = ClasseUtil.criarConta();
        primeiraConta.setNumero(1);
        primeiraConta.depositar(200);
        Conta segundaConta = ClasseUtil.criarConta();
        segundaConta.setNumero(2);
        segundaConta.depositar(300);

        ClasseUtil.pularLinhaEImprimirSeparadorDeConteudo();

        ClasseUtil.imprimirTexto("Cenário 1: Visualizando saldo das contas");
        ClasseUtil.pularLinha();
        ClasseUtil.imprimirInformacoesConta(primeiraConta);
        ClasseUtil.pularLinha();
        ClasseUtil.imprimirInformacoesConta(segundaConta);

        ClasseUtil.pularLinhaEImprimirSeparadorDeConteudo();

        ClasseUtil.imprimirTexto("Cenário 2: Visualizando saldo das contas após deposito de 20 reais");
        ClasseUtil.pularLinha();
        primeiraConta.depositar(20);
        segundaConta.depositar(20);
        ClasseUtil.imprimirInformacoesConta(primeiraConta);
        ClasseUtil.pularLinha();
        ClasseUtil.imprimirInformacoesConta(segundaConta);

        ClasseUtil.pularLinhaEImprimirSeparadorDeConteudo();

        ClasseUtil.imprimirTexto("Cenário 3: Visualizando agência e  número da conta criados");
        ClasseUtil.pularLinha();
        ClasseUtil.imprimirTexto("Agência primeira conta: " + primeiraConta.agencia);
        ClasseUtil.imprimirTexto("Conta primeira conta: " + primeiraConta.numero);
        ClasseUtil.imprimirTexto("Agência segunda conta: " + primeiraConta.agencia);
        ClasseUtil.imprimirTexto("Conta segunda conta: " + primeiraConta.numero);
    }
}