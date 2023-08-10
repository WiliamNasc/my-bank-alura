public class TesteMetodoConta {
    public static void main(String[] args) {
        MostrarInformacaoUtil.pularLinha();
        MostrarInformacaoUtil.imprimirTexto("Criando contas:");
        MostrarInformacaoUtil.pularLinha();
        Conta primeiraConta = new Conta(1, 123456, new Cliente("Wiliam", "123.456.789-10"));
        MostrarInformacaoUtil.imprimirTexto("Conta " + primeiraConta.getNumero() + " criada");
        ContaUtil.imprimirInformacoesConta(primeiraConta);
        MostrarInformacaoUtil.pularLinha();
        Conta segundaConta = new Conta(2, 654321, new Cliente("João", "128.456.789-85"));
        MostrarInformacaoUtil.imprimirTexto("Conta " + segundaConta.getNumero() + " criada");
        ContaUtil.imprimirInformacoesConta(segundaConta);

        MostrarInformacaoUtil.pularLinhaEImprimirSeparadorDeConteudo();

        MostrarInformacaoUtil.imprimirTexto("Cenário 1: depositando valor de 100 reais nas contas");
        primeiraConta.depositar(100);
        segundaConta.depositar(100);
        ContaUtil.imprimirInformacoesConta(primeiraConta);
        MostrarInformacaoUtil.pularLinha();
        ContaUtil.imprimirInformacoesConta(segundaConta);


        MostrarInformacaoUtil.pularLinhaEImprimirSeparadorDeConteudo();

        MostrarInformacaoUtil.imprimirTexto("Cenário 2: sacando o valor de 50 reais da primeira conta e 20 da segunda");
        MostrarInformacaoUtil.imprimirTexto("Saque realizado na conta " + primeiraConta.getNumero() +  ": " + primeiraConta.sacar(50));
        MostrarInformacaoUtil.imprimirTexto("Saque realizado na conta " + segundaConta.getNumero() +  ": " + segundaConta.sacar(20));
        ContaUtil.imprimirInformacoesConta(primeiraConta);
        MostrarInformacaoUtil.pularLinha();
        ContaUtil.imprimirInformacoesConta(segundaConta);

        MostrarInformacaoUtil.pularLinhaEImprimirSeparadorDeConteudo();

        MostrarInformacaoUtil.imprimirTexto("Cenário 3: depositando valor de 50 reais na primeira e 10 na segunda");
        primeiraConta.depositar(50);
        segundaConta.depositar(10);
        ContaUtil.imprimirInformacoesConta(primeiraConta);
        MostrarInformacaoUtil.pularLinha();
        ContaUtil.imprimirInformacoesConta(segundaConta);

        MostrarInformacaoUtil.pularLinhaEImprimirSeparadorDeConteudo();

        MostrarInformacaoUtil.imprimirTexto("Cenário 4: transferindo valor de 50 reais da primeira para segunda conta");
        primeiraConta.transferir(50, segundaConta);
        ContaUtil.imprimirInformacoesConta(primeiraConta);
        MostrarInformacaoUtil.pularLinha();
        ContaUtil.imprimirInformacoesConta(segundaConta);
    }
}