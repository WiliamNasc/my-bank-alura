public class TesteCriaConta {
    public static void main(String[] args) {
        ClasseUtil.pularLinha();
        ClasseUtil.imprimirTexto("Criando contas com valores depositados de 200 e 300 reais");
        Conta primeiraConta = ClasseUtil.criarConta();
        ClasseUtil.adicionarNumeroConta(primeiraConta, 1);
        primeiraConta.depositar(200);
        Conta segundaConta = ClasseUtil.criarConta();
        ClasseUtil.adicionarNumeroConta(segundaConta, 2);
        segundaConta.depositar(300);

        ClasseUtil.pularLinhaEImprimirSeparadorDeConteudo();

        ClasseUtil.imprimirTexto("Cenário 1: Visualizando saldo das contas");
        ClasseUtil.imprimirSaldoConta(primeiraConta);
        ClasseUtil.imprimirSaldoConta(segundaConta);

        ClasseUtil.pularLinhaEImprimirSeparadorDeConteudo();

        ClasseUtil.imprimirTexto("Cenário 2: Visualizando saldo das contas após deposito de 20 reais");
        primeiraConta.depositar(20);
        segundaConta.depositar(20);
        ClasseUtil.imprimirSaldoConta(primeiraConta);
        ClasseUtil.imprimirSaldoConta(segundaConta);

        ClasseUtil.pularLinhaEImprimirSeparadorDeConteudo();

        ClasseUtil.imprimirTexto("Cenário 3: Visualizando agência e  número da conta criados");
        ClasseUtil.imprimirTexto("Agência primeira conta: " + primeiraConta.agencia);
        ClasseUtil.imprimirTexto("Conta primeira conta: " + primeiraConta.numero);
        ClasseUtil.imprimirTexto("Agência segunda conta: " + primeiraConta.agencia);
        ClasseUtil.imprimirTexto("Conta segunda conta: " + primeiraConta.numero);
    }
}