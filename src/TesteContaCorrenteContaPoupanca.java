public class TesteContaCorrenteContaPoupanca {
    public static void main(String[] args) {
        System.out.println("Criando contas corrente e poupança");
        ContaCorrente contaCorrente = new ContaCorrente(1, 123456,
                new Cliente("José", "445.879.548-78"));

        ContaPoupanca contaPoupanca = new ContaPoupanca(2, 789101,
                new Cliente("Maria", "855.900.568-00"));

        System.out.println();
        System.out.println("=================================");
        System.out.println();

        System.out.println("Depositando 100 reais na conta corrente, e 50 na poupança");
        contaCorrente.depositar(100);
        contaPoupanca.depositar(50);

        System.out.println();
        System.out.println("=================================");
        System.out.println();

        System.out.println("Informações das contas");
        System.out.println(contaCorrente.toString());
        System.out.println(contaPoupanca.toString());

        System.out.println();
        System.out.println("=================================");
        System.out.println();

        System.out.println("Transferir 10 reais da conta corrente, e adicionar na conta poupança");
        contaCorrente.transferir(10, contaPoupanca);

        System.out.println();
        System.out.println("=================================");
        System.out.println();

        System.out.println("Informações das contas após transferência");
        System.out.println(contaCorrente.toString());
        System.out.println(contaPoupanca.toString());
    }
}