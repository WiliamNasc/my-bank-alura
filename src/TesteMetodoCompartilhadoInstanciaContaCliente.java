public class TesteMetodoCompartilhadoInstanciaContaCliente {
    public static void main(String[] args) {
        MostrarInformacaoUtil.pularLinha();
        MostrarInformacaoUtil.imprimirTexto("Criando 2 contas sem cliente e 1 com cliente");
        Conta primeiraConta = new Conta(1, 1234, null);
        Conta segundaConta = new Conta(2, 4567, null);
        Conta terceiraConta = new Conta(2, 4567, new Cliente("Wiliam", "123.456.489-96"));

        MostrarInformacaoUtil.pularLinhaEImprimirSeparadorDeConteudo();

        MostrarInformacaoUtil.pularLinha();
        MostrarInformacaoUtil.imprimirTexto("Criando 1 cliente");
        Cliente cliente = new Cliente("João", "223.887.489-85");

        MostrarInformacaoUtil.pularLinha();
        MostrarInformacaoUtil.pularLinhaEImprimirSeparadorDeConteudo();

        MostrarInformacaoUtil.imprimirTexto("Cenário 1: deve mostrar 3 contas criadas");
        MostrarInformacaoUtil.imprimirTexto("Total de contas criadas: " + Conta.getTotalContasInstanciadas());

        MostrarInformacaoUtil.pularLinha();
        MostrarInformacaoUtil.pularLinhaEImprimirSeparadorDeConteudo();

        MostrarInformacaoUtil.imprimirTexto("Cenário 2: deve mostrar 2 clientes criados");
        MostrarInformacaoUtil.imprimirTexto("Total de clientes criadas: " + Cliente.getTotalClientesInstanciados());
    }
}