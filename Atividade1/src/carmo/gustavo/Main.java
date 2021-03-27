// Nome: Gustavo Zamboni do Carmo
// RA: 19.01266-7

package carmo.gustavo;

public class Main {

    public static void main(String[] args) {
        Usuarios u1 = new Usuarios("alu",123,"abc",1000,1);
        Usuarios u2 = new Usuarios("lua",456,"def",500,2);
        Usuarios u3 = new Usuarios("sol",789,"ghi",3000,3);


        Transacoes transacao = new Transacoes();
        String pagamento = transacao.gerarString(u1,500);
        System.out.println(pagamento);

        System.out.println(u1.conta.getSaldo());
        System.out.println(u2.conta.getSaldo());
        System.out.println(u3.conta.getSaldo());

        if(transacao.realizarPagamento(u3,u1,pagamento)){
            System.out.println(u1.conta.getSaldo());
            System.out.println(u2.conta.getSaldo());
            System.out.println(u3.conta.getSaldo());
        }else{
            System.out.println("Não foi possível efetuar o pagamento!");
        }

        System.out.println(u1.toString());
        System.out.println(u2.toString());
        System.out.println(u3.toString());

    }
}
