public  class ContaUtil {
    public static void imprimirSeAsContasSaoOuNaoIguais(Conta primeiraConta, Conta segundaConta) {
        if (primeiraConta == segundaConta) {
            System.out.println("As contas são iguais, logo dividem a mesma referência do objeto conta");
        } else {
            System.out.println("As contas são diferentes, logo elas possuem referências distintas do objeto conta");
        }
    }

    public static boolean osClientePossuemMesmaReferencia(Cliente cliente1, Cliente cliente2) {
        return cliente1 == cliente2;
    }

    public static void imprimirInformacoesConta(Conta conta) {
        MostrarInformacaoUtil.imprimirTexto("Informações da conta: " + conta.toString());
    }
}