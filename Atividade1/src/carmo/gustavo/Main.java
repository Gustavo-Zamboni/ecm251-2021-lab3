// Nome: Gustavo Zamboni do Carmo
// RA: 19.01266-7

package carmo.gustavo;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Criação e instanciação do objeto scanner para leitura do input do usuário
        Scanner ler = new Scanner(System.in);

        int op = 10;
        do{
            // Exibe na tela as opções do programa
            System.out.println("Digite a funcionalidade desejada:");
            System.out.println("0 - Sair do programa");
            System.out.println("1 - Criar um novo usuário");
            System.out.println("2 - Alterar os dados de um usuário");
            System.out.println("3 - Gerar uma solicitação de pagamento");
            System.out.println("4 - Realizar um pagamento");

            // Lê a escolha do usuário
            op = ler.nextInt();

            switch (op){
                case 0:

                    // Encerra o programa
                    System.out.println("Programa encerrado!");
                    break;
                case 1:

                    // Cria um novo usuário
                    System.out.println("Digite o nome do Usuário:");
                    String nome = ler.nextLine();
                    System.out.println("Digite a senha:");
                    int senha = ler.nextInt();
                    System.out.println("Digite o e-mail:");
                    String email = ler.nextLine();
                    System.out.println("Digite o saldo da nova conta:");
                    float saldo = ler.nextFloat();

                    break;
                default:

                    // Exibe a mensagem de erro
                    System.out.println("Funcionalidade ainda não implementada!");
                    break;
            }

        }while (op != 0);

        Usuarios u1 = new Usuarios("Terra",123,"abc",1000,1);
        Usuarios u2 = new Usuarios("Lua",456,"def",500,2);
        Usuarios u3 = new Usuarios("Sol",789,"ghi",3000,3);


        String pagamento = Transacoes.gerarString(u1,500);
        System.out.println(pagamento);


        if(Transacoes.realizarPagamento(u3,u1,pagamento)){
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
