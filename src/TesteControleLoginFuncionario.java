public class TesteControleLoginFuncionario {
    public static void main(String[] args) {
        System.out.println("Criando Gerente");
        System.out.println();
        Gerente gerente = new Gerente();
        gerente.setNome("João");
        gerente.setSenha(1235678);
        System.out.println(gerente.toString());

        System.out.println();
        System.out.println("===================");
        System.out.println();

        System.out.println("Criando Administrador");
        System.out.println();
        Administrador administrador = new Administrador();
        administrador.setNome("Maria");
        administrador.setSenha(123456);
        System.out.println(administrador.toString());

        System.out.println();
        System.out.println("===================");
        System.out.println();


        System.out.println("Criando controle de logins");
        ControleLogin controleLogin = new ControleLogin();

        System.out.println();
        System.out.println("===================");
        System.out.println();

        System.out.println("Validando senha de login: Gerente");
        System.out.println();
        controleLogin.autentica(gerente);

        System.out.println();
        System.out.println("===================");
        System.out.println();

        System.out.println("Validando senha de login: Administrador");
        System.out.println();
        controleLogin.autentica(administrador);


    }
}