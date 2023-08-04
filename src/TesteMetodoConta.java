public class TesteMetodoConta {
    public static void main(String[] args) {
        ClasseUtil.pularLinha();
        ClasseUtil.imprimirTexto("Criando conta:");
        ClasseUtil.pularLinha();
        Conta conta = new Conta();
        ClasseUtil.adicionarNumeroConta(conta, 1);
        ClasseUtil.imprimirTexto("Conta " + conta.numero + " criada");
        ClasseUtil.imprimirSaldoConta(conta);

        ClasseUtil.pularLinhaEImprimirSeparadorDeConteudo();

        ClasseUtil.imprimirTexto("Cenário 1: depositando valor de 100 reais");
        conta.depositar(100);
        ClasseUtil.imprimirSaldoConta(conta);


        ClasseUtil.pularLinhaEImprimirSeparadorDeConteudo();

        ClasseUtil.imprimirTexto("Cenário 2: sacando o valor de 50 reais");
        ClasseUtil.imprimirTexto("Saque realizado: " + conta.sacar(20));
        ClasseUtil.imprimirSaldoConta(conta);

        ClasseUtil.pularLinhaEImprimirSeparadorDeConteudo();

        ClasseUtil.imprimirTexto("Cenário 3: depositando valor de 50 reais");
        conta.depositar(50);
        ClasseUtil.imprimirSaldoConta(conta);
    }
}