public class TesteCriaFuncionario {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Criando funcionário");
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Wiliam");
        funcionario.setCpf("445.896.687-54");
        funcionario.setSalario(1000);

        System.out.println();
        System.out.println("================================");
        System.out.println();

        System.out.println("Visualizando bonificação");
        System.out.println();
        System.out.println("Salário: " + funcionario.getSalario());
        System.out.println("Percentual bonificação: " + funcionario.getPercentualBonificacao() * 100 + "%");
        System.out.println("Bonificação do funcionário " + funcionario.getNome() + " :" + funcionario.getBonificacao());
    }
}