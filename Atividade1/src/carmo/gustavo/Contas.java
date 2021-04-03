// Nome: Gustavo Zamboni do Carmo
// RA: 19.01266-7

package carmo.gustavo;

public class Contas {
    private int IdConta;
    private float Saldo;

    // Atribuir os valores iniciais para cada conta
    public Contas(float saldo, int id) {
        this.IdConta += id;
        this.Saldo = saldo;
    }

    //getters  e setters das contas
    public int getIdConta() {
        return this.IdConta;
    }

    public float getSaldo() {
        return this.Saldo;
    }

    public void setSaldo(float saldo) {
        this.Saldo = saldo;
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


