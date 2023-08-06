public class TesteComposicaoContaCliente {
    public static void main(String[] args) {
        ClasseUtil.pularLinha();
        ClasseUtil.imprimirTexto("Criando cliente");
        Cliente cliente = ClasseUtil.criarCliente();
        cliente.setNome("Wiliam");
        cliente.setCpf("123.456.789-10");
        cliente.setProfissao("Desenvolvedor");

        ClasseUtil.pularLinhaEImprimirSeparadorDeConteudo();

        ClasseUtil.imprimirTexto("Criando conta");
        Conta conta = new Conta();
        conta.setNumero(1);
        conta.depositar(100);

        ClasseUtil.pularLinhaEImprimirSeparadorDeConteudo();

        ClasseUtil.imprimirTexto("Cenário 1: Associando conta ao cliente");
        conta.setTitular(cliente);
        ClasseUtil.imprimirTitularConta(conta);
    }
}