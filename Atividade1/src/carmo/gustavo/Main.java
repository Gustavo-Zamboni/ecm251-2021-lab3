// Nome: Gustavo Zamboni do Carmo
// RA: 19.01266-7

package carmo.gustavo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Criação e instanciação do objeto scanner para leitura do input do usuário
        Scanner ler = new Scanner(System.in);

        // Cria a lista de usuários do programa
        Usuarios[] listaUsuarios = new Usuarios[3];

        int op = 10;
        do{
            // Exibe na tela as opções do programa
            System.out.println("Digite a funcionalidade desejada:");
            System.out.println("0 - Sair do programa");
            System.out.println("1 - Criar usuários");
            System.out.println("2 - Alterar os dados de um usuário");
            System.out.println("3 - Vizualizar os dados dos usuários (opção disponível apenas durante o desenvolvimento do sistema)");
            System.out.println("4 - Gerar uma solicitação de pagamento");
            System.out.println("5 - Realizar um pagamento");

            // Lê a escolha do usuário
            op = ler.nextInt();

            // Cria a string do pagamento para gerar o Qrcode
            String pagamento = "";

            switch (op){
                case 0:
                    // Encerra o programa
                    System.out.println("Programa encerrado!");
                    break;
                case 1:
                    // Cria os novos usuários
                    for(int i=0; i<3; i++){
                        System.out.println("Digite o nome do Usuário" + Integer.toString(i) + ":");
                        String nome = ler.next();
                        System.out.println("Digite a senha:");
                        int senha = ler.nextInt();
                        System.out.println("Digite o e-mail:");
                        String email = ler.next();
                        System.out.println("Digite o saldo da nova conta:");
                        float saldo = ler.nextFloat();
                        listaUsuarios[i] = new Usuarios(nome,senha,email,saldo,i);

                    }
                    System.out.println(listaUsuarios[0].toString());
                    System.out.println(listaUsuarios[1].toString());
                    System.out.println(listaUsuarios[2].toString());
                    break;
                case 2:
                    // Modifica os dados de um usuário já existente

                    // Inicializa a variável do switch case
                    int opModificacao = 11;

                    // Verifica se o id digitado existe na lista de usuários do programa
                    System.out.println("Digite o id da conta a ser modificada:");
                    System.out.println("OBS: A contegem de id começa em 0");
                    int idModificacao = ler.nextInt();
                    if(idModificacao >= listaUsuarios.length){
                        System.out.println("Id não registrado no sistema!");
                        break;
                    }else {
                        do {
                            System.out.println("Modificação desejada:");
                            System.out.println("0 - Modificações concluídas");
                            System.out.println("1 - Alterar nome");
                            System.out.println("2 - Alterar senha");
                            System.out.println("3 - Alterar email");
                            switch (opModificacao) {
                                case 0:
                                    break;
                                case 1:
                                    // Altera o nome do usuário
                                    System.out.println("Digite o nome novo do usuário:");
                                    String novoNome = ler.next();
                                    listaUsuarios[idModificacao].setNome(novoNome);
                                    break;
                                case 2:
                                    // Altera sua senha
                                    System.out.println("Digite a nova senha:");
                                    int novaSenha = ler.nextInt();
                                    listaUsuarios[idModificacao].setSenha(novaSenha);
                                    break;
                                case 3:
                                    // Altera o email cadastrado
                                    System.out.println("Digite o novo email");
                                    String novoEmail = ler.next();
                                    listaUsuarios[idModificacao].setEmail(novoEmail);
                                    break;
                                default:
                                    // Exibe a mensagem de erro
                                    System.out.println("Opção ainda indisponível!");
                                    break;
                            }
                        } while (opModificacao != 0);
                        break;
                    }
                case 3:
                    // Exibe todos as informações dos usuários do sistema
                    for (int i = 0; i < listaUsuarios.length; i++) {
                        System.out.println(listaUsuarios.toString());
                    }
                    break;
                case 4:
                    // Gera uma solicitação de pagamento
                    System.out.println("Digite o id do usuário que fará a solicitação:");
                    int idSolicitacao = ler.nextInt();
                    System.out.println("Digite o valor que será requisitado:");
                    float valoRequisitado = ler.nextFloat();
                    pagamento = Transacoes.gerarString(listaUsuarios[idSolicitacao],valoRequisitado);
                    break;
                case 5:
                    // Realiza, se possível, a transação desejada
                    System.out.println("Digite o id do usuário que fará o pagamento:");
                    int idPagador = ler.nextInt();
                    System.out.println("Digite o id do usuário que receberá o pagamento:");
                    int idRecebedor = ler.nextInt();
                    if(Transacoes.realizarPagamento(listaUsuarios[idPagador],listaUsuarios[idRecebedor],pagamento)){
                        System.out.println("Transação realizada com sucesso!");
                        break;
                    }else{
                        System.out.println("Não foi possível efetuar o pagamento");
                        break;
                    }
                default:
                    // Exibe a mensagem de erro
                    System.out.println("Funcionalidade ainda não implementada!");
                    break;
            }

        }while (op != 0);
        
    }
}
