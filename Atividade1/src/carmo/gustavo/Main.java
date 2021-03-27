// Nome: Gustavo Zamboni do Carmo
// RA: 19.01266-7

package carmo.gustavo;

public class Main {

    public static void main(String[] args) {
        Usuarios u1 = new Usuarios("alu",123,"abc");
        Contas c1 = new Contas(1,1000,u1);
        Transacoes transacao = new Transacoes();
        System.out.println(transacao.gerarString(c1,u1,500));
        
    }
}
