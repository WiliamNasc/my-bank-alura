public class ControleLogin {
    private int senha = 123456;

    public void autentica(LoginFuncionario loginFuncionario) {
        if (loginFuncionario.autentica(this.senha)) {
            System.out.println("=> Login efetuado com sucesso !!!");
            return;
        }
        System.out.println("=> Erro no login, a senha está incorreta !");
    }
}