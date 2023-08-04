public class TesteDeReferencia {

    public static void main(String[] args) {
        pularLinha();
        imprimirTexto("Contas criadas:");
        pularLinha();
        Conta primeiraConta = criarConta();
        adicionarNumeroConta(primeiraConta, 1);
        adicionarSaldoConta(primeiraConta, 300);
        imprimirSaldoConta(primeiraConta);


        Conta segundaConta = primeiraConta;
        adicionarNumeroConta(segundaConta, 2);
        imprimirSaldoConta(segundaConta);

        Conta terceiraConta = criarConta();
        adicionarNumeroConta(terceiraConta, 3);
        adicionarSaldoConta( terceiraConta,500);
        imprimirSaldoConta(terceiraConta);

        pularLinha();
        imprimirSeparadorDeConteudo();
        pularLinha();

        imprimirTexto("Cenário 1: comparando primeira conta com segunda");
        pularLinha();
        imprimirSeAsContasSaoOuNaoIguais(primeiraConta, segundaConta);

        pularLinha();
        imprimirSeparadorDeConteudo();
        pularLinha();

        imprimirTexto("Cenário 2: comparando primeira conta com a terceira");
        pularLinha();
        imprimirSeAsContasSaoOuNaoIguais(primeiraConta, terceiraConta);

        pularLinha();
        imprimirSeparadorDeConteudo();
        pularLinha();

        imprimirTexto("Cenário 3: comparando a segunda conta com a terceira");
        pularLinha();
        imprimirSeAsContasSaoOuNaoIguais(segundaConta, terceiraConta);
    }

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

    public static void adicionarSaldoConta(Conta conta, double saldo) {
        conta.saldo = saldo;
    }

    public static void adicionarNumeroConta(Conta conta, int numero) {
        conta.numero = numero;
    }

    public static void imprimirSaldoConta(Conta conta) {
        imprimirTexto("Saldo da conta " + conta.numero + ": " + conta.saldo);
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

}