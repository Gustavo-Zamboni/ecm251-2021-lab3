package carmo.gustavo;

public class Usuarios {
    private String Nome;
    private int Senha;
    private String email;

    // Contrutor para atribuir os valores iniciais para cada usuário
    public Usuarios(String nome, int senha, String email) {
        Nome = nome;
        Senha = senha;
        this.email = email;
    }

    //getters do usuário
    public String getNome() {
        return Nome;
    }
}
