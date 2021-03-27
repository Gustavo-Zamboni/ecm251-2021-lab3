package carmo.gustavo;

public class Usuarios {
    private String Nome;
    private int Senha;
    private String email;
    Contas conta;

    // Contrutor para atribuir os valores iniciais para cada usuário
    public Usuarios(String nome, int senha, String email, Contas conta) {
        Nome = nome;
        Senha = senha;
        this.email = email;
        this.conta = conta;
    }

    // getters do usuário
    public String getNome() {
        return Nome;
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
