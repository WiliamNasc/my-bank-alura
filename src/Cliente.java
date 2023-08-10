public class Cliente {
    private String nome;
    private String cpf;
    private String profissao;

    private static int totalClientesInstanciados;

    public Cliente(String nome, String cpf) {
        totalClientesInstanciados++;
        this.nome = nome;
        this.cpf = cpf;
    }

    public Cliente(String nome, String cpf, String profissao) {
        totalClientesInstanciados++;
        this.nome = nome;
        this.cpf = cpf;
        this.profissao = profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }


    public static int getTotalClientesInstanciados() {
        return totalClientesInstanciados;
    }

    public String toString() {
        return "Titular: " + this.nome +
               "\n" + "CPF: " + this.cpf +
               "\n" + "Profissão: " + this.profissao;
    }
}