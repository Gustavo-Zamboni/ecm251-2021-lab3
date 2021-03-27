// Nome: Gustavo Zamboni do Carmo
// RA: 19.01266-7

package carmo.gustavo;

public class Main {

    public static void main(String[] args) {
        Contas c1 = new Contas(1,1000);
        Usuarios u1 = new Usuarios("alu",123,"abc",c1);

        Contas c2 = new Contas(2,500);
        Usuarios u2 = new Usuarios("lua",123,"abc",c2);

        Contas c3 = new Contas(3,3000);
        Usuarios u3 = new Usuarios("sol",123,"abc",c3);

        Transacoes transacao = new Transacoes();
        System.out.println(transacao.gerarString(u1,500));



    }
}
