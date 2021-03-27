package carmo.gustavo;

public class Contas {
    private int IdConta;
    private float Saldo;

    // Atribuir os valores iniciais para cada conta
    public Contas(int idConta, float saldo) {
        IdConta = idConta;
        Saldo = saldo;
    }

    //getters  e setters das contas
    public int getIdConta() {
        return IdConta;
    }

    public float getSaldo() {
        return Saldo;
    }

    public void setSaldo(float saldo) {
        Saldo = saldo;
    }

    // Exibe as informações das contas
    @Override
    public String toString() {
        return "Contas{" +
                "IdConta=" + IdConta +
                ", Saldo=" + Saldo +
                '}';
    }
}


