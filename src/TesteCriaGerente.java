public class TesteCriaGerente {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Criando gerente");
        Gerente gerente = new Gerente();
        gerente.setNome("Wiliam");
        gerente.setCpf("445.896.687-54");
        gerente.setSalario(1000);
        gerente.setSenha(123456);

        System.out.println();
        System.out.println("================================");
        System.out.println();

        System.out.println("Visualizando se a senha é válida");
        System.out.println();
        System.out.println("A senha informada é válida: " + gerente.autentica(123456));

        System.out.println();
        System.out.println("================================");
        System.out.println();
        System.out.println("Salário: " + gerente.getSalario());
        System.out.println("Percentual bonificação: " + gerente.getPercentualBonificacao() * 100 + "%");
        System.out.println("Visualizando bonificação: " + gerente.getBonificacao());
    }
}