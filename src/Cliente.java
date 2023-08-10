public class Cliente {
    private String nome;
    private String cpf;
    private String profissao;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public Cliente(String nome, String cpf, String profissao) {
        this.nome = nome;
        this.cpf = cpf;
        this.profissao = profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }


    public String toString() {
        return "Titular: " + this.nome +
               "\n" + "CPF: " + this.cpf +
               "\n" + "Profissão: " + this.profissao;
    }
}