public  class ClasseUtil {
    public static void imprimirSeAsContasSaoOuNaoIguais(Conta primeiraConta, Conta segundaConta) {
        if (primeiraConta == segundaConta) {
            System.out.println("As contas são iguais, logo dividem a mesma referência do objeto conta");
        } else {
            System.out.println("As contas são diferentes, logo elas possuem referências distintas do objeto conta");
        }
    }

    public static Conta criarConta() {
        return new Conta();
    }

    public static Cliente criarCliente() {
        return new Cliente();
    }

    public static void adicionarNumeroConta(Conta conta, int numero) {
        conta.numero = numero;
    }

    public static void imprimirSaldoConta(Conta conta) {
        imprimirTexto("Saldo da conta " + conta.numero + ": " + conta.saldo);
    }

    public static void imprimirTitularConta(Conta conta) {
        imprimirTexto("Titular conta: " + conta.titular.getNome());
        imprimirTexto("CPF: " + conta.titular.getCpf());
        imprimirTexto("Profissão: " + conta.titular.getProfissao());
    }

    public static void pularLinha() {
        imprimirTexto("");
    }

    public static void imprimirSeparadorDeConteudo() {
        imprimirTexto("-----------------------------");
    }

    public static void imprimirTexto(String conteudo) {
        System.out.println(conteudo);
    }

    public static void pularLinhaEImprimirSeparadorDeConteudo() {
        pularLinha();
        imprimirSeparadorDeConteudo();
    }
}