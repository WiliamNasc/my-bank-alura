public class CriaConta {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 200;

        Conta segundaConta = new Conta();
        segundaConta.saldo = 300;

        System.out.println("Saldo Primeira conta: " + primeiraConta.saldo);
        System.out.println("Saldo Segunda conta: " + segundaConta.saldo);

        primeiraConta.saldo += 150;

        System.out.println("Saldo Primeira conta após adição de 150 reais: " + primeiraConta.saldo);

        System.out.println("Agência primeira conta: " + primeiraConta.agencia);
        System.out.println("Conta primeira conta: " + primeiraConta.numero);
    }
}