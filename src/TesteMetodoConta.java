public class TesteMetodoConta {
    public static void main(String[] args) {
        ClasseUtil.pularLinha();
        ClasseUtil.imprimirTexto("Criando contas:");
        ClasseUtil.pularLinha();
        Conta primeiraConta = ClasseUtil.criarConta();
        primeiraConta.setNumero(1);
        ClasseUtil.imprimirTexto("Conta " + primeiraConta.numero + " criada");
        ClasseUtil.imprimirInformacoesConta(primeiraConta);
        ClasseUtil.pularLinha();
        Conta segundaConta = ClasseUtil.criarConta();
        segundaConta.setNumero(2);
        ClasseUtil.imprimirTexto("Conta " + segundaConta.numero + " criada");
        ClasseUtil.imprimirInformacoesConta(segundaConta);

        ClasseUtil.pularLinhaEImprimirSeparadorDeConteudo();

        ClasseUtil.imprimirTexto("Cenário 1: depositando valor de 100 reais nas contas");
        primeiraConta.depositar(100);
        segundaConta.depositar(100);
        ClasseUtil.imprimirInformacoesConta(primeiraConta);
        ClasseUtil.pularLinha();
        ClasseUtil.imprimirInformacoesConta(segundaConta);


        ClasseUtil.pularLinhaEImprimirSeparadorDeConteudo();

        ClasseUtil.imprimirTexto("Cenário 2: sacando o valor de 50 reais da primeira conta e 20 da segunda");
        ClasseUtil.imprimirTexto("Saque realizado na conta " + primeiraConta.numero +  ": " + primeiraConta.sacar(50));
        ClasseUtil.imprimirTexto("Saque realizado na conta " + segundaConta.numero +  ": " + segundaConta.sacar(20));
        ClasseUtil.imprimirInformacoesConta(primeiraConta);
        ClasseUtil.pularLinha();
        ClasseUtil.imprimirInformacoesConta(segundaConta);

        ClasseUtil.pularLinhaEImprimirSeparadorDeConteudo();

        ClasseUtil.imprimirTexto("Cenário 3: depositando valor de 50 reais na primeira e 10 na segunda");
        primeiraConta.depositar(50);
        segundaConta.depositar(10);
        ClasseUtil.imprimirInformacoesConta(primeiraConta);
        ClasseUtil.pularLinha();
        ClasseUtil.imprimirInformacoesConta(segundaConta);

        ClasseUtil.pularLinhaEImprimirSeparadorDeConteudo();

        ClasseUtil.imprimirTexto("Cenário 4: transferindo valor de 50 reais da primeira para segunda conta");
        primeiraConta.transferir(50, segundaConta);
        ClasseUtil.imprimirInformacoesConta(primeiraConta);
        ClasseUtil.pularLinha();
        ClasseUtil.imprimirInformacoesConta(segundaConta);
    }
}