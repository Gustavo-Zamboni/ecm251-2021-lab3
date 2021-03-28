package carmo.gustavo;

public class Usuarios {
    private String Nome;
    private int Senha;
    private String email;
    Contas conta;

    // Contrutor para atribuir os valores iniciais para cada usuário


    public Usuarios(String nome, int senha, String email, float saldo, int id) {
        this.Nome = nome;
        this.Senha = senha;
        this.email = email;
        this.conta = new Contas(saldo,id);
    }

    // getters  e setters do usuário
    public String getNome() {
        return this.Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public void setSenha(int senha) {
        Senha = senha;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Exibe as informações dos usuarios
    @Override
    public String toString() {
        return "Usuarios{" +
                "Nome='" + Nome + '\'' +
                ", Senha=" + Senha +
                ", email='" + email + '\'' +
                ", conta=" + conta +
                '}';
    }
}
