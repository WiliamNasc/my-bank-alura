public class TesteCriaConta {
    public static void main(String[] args) {
        MostrarInformacaoUtil.pularLinha();
        MostrarInformacaoUtil.imprimirTexto("Criando contas com valores depositados de 200 e 300 reais");
        Conta primeiraConta = new Conta(1, 123456, new Cliente("João", "123.456.789-10"));
        primeiraConta.depositar(200);
        Conta segundaConta = new Conta(2, 153957, new Cliente("Maria", "258.895.102-89"));
        segundaConta.depositar(300);

        MostrarInformacaoUtil.pularLinhaEImprimirSeparadorDeConteudo();

        MostrarInformacaoUtil.imprimirTexto("Cenário 1: Visualizando saldo das contas");
        MostrarInformacaoUtil.pularLinha();
        ContaUtil.imprimirInformacoesConta(primeiraConta);
        MostrarInformacaoUtil.pularLinha();
        ContaUtil.imprimirInformacoesConta(segundaConta);

        MostrarInformacaoUtil.pularLinhaEImprimirSeparadorDeConteudo();

        MostrarInformacaoUtil.imprimirTexto("Cenário 2: Visualizando saldo das contas após deposito de 20 reais");
        MostrarInformacaoUtil.pularLinha();
        primeiraConta.depositar(20);
        segundaConta.depositar(20);
        ContaUtil.imprimirInformacoesConta(primeiraConta);
        MostrarInformacaoUtil.pularLinha();
        ContaUtil.imprimirInformacoesConta(segundaConta);

        MostrarInformacaoUtil.pularLinhaEImprimirSeparadorDeConteudo();

        MostrarInformacaoUtil.imprimirTexto("Cenário 3: Visualizando agência e  número da conta criados");
        MostrarInformacaoUtil.pularLinha();
        MostrarInformacaoUtil.imprimirTexto("Agência primeira conta: " + primeiraConta.getAgencia());
        MostrarInformacaoUtil.imprimirTexto("Conta primeira conta: " + primeiraConta.getNumero());
        MostrarInformacaoUtil.imprimirTexto("Agência segunda conta: " + segundaConta.getAgencia());
        MostrarInformacaoUtil.imprimirTexto("Conta segunda conta: " + segundaConta.getNumero());
    }
}