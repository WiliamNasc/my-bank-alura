public class TesteCriaGerente {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Criando gerente");
        Gerente gerente = new Gerente();
        gerente.setNome("Wiliam");
        gerente.setCpf("445.896.687-54");
        gerente.setSalario(10000);
        gerente.setSenha(123456);

        System.out.println();
        System.out.println("================================");
        System.out.println();

        System.out.println("Visualizando se a senha é válida");
        System.out.println();
        System.out.println("A senha informada é válida: " + gerente.autentica(123456));
    }
}