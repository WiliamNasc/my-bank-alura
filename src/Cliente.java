public class Cliente {
    private String nome = "-";
    private String cpf = "-";
    private String profissao = "-";

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getProfissao() {
        return this.profissao;
    }

    public String toString() {
        return "Titular: " + this.nome +
               "\n" + "CPF: " + this.cpf +
               "\n" + "Profissão: " + this.profissao;
    }
}