package carmo.gustavo;

public class Contas {
    private int IdConta;
    private float Saldo;
    Usuarios titular;

    // Atribuir os valores iniciais para cada conta
    public Contas(int idConta, float saldo, Usuarios titular) {
        IdConta = idConta;
        Saldo = saldo;
        this.titular = titular;
    }

    //getters das contas
    public int getIdConta() {
        return IdConta;
    }

    public float getSaldo() {
        return Saldo;
    }
}
