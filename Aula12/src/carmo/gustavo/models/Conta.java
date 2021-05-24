package carmo.gustavo.models;

public class Conta {
    public double saldo;

    /**
     *
     * @param saldo saldo inicial da conta
     */
    public Conta(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Construtor que inicializa conta com 0
     */
    public Conta() {

    }

    @Override
    public String toString() {
        return "Conta{" +
                "saldo=" + saldo +
                '}';
    }
}
