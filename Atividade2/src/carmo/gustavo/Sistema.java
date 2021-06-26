package carmo.gustavo;

import carmo.gustavo.enums.HorarioSistema;
import carmo.gustavo.enums.TiposMembros;
import carmo.gustavo.interfaces.Auxiliar;
import carmo.gustavo.models.*;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Classe Sistema que implementa a interface auxiliar para executar os requisitos do programa
 */
public class Sistema implements Auxiliar{
    /**
     * Metodo da classe Sistema que executa o programa
     */
    public void Executar(){
        Scanner ler = new Scanner(System.in);
        String nomeUsuario;
        int idUsuario;
        String categoriaUsuario;

        /**
         * Listas auxiliares para controle dos Membros cadastrados
         */
        ArrayList<Membro> listaMobileMembers= new ArrayList<>();
        ArrayList<Membro> listaHeavyLifters = new ArrayList<>();
        ArrayList<Membro> listaScriptGuys = new ArrayList<>();
        ArrayList<Membro> listaBigBrothers = new ArrayList<>();

        /**
         * Menu inicial do programa solicitando dados do usuario
         */
        System.out.println("------Bem vindo ao gerenciador da MAsK_S0c13ty------");
        System.out.println("Insira seus dados:");
        System.out.println("Nome(sem espaços):");
        nomeUsuario = ler.next();
        System.out.println("categoria(sem espaços):");
        categoriaUsuario = ler.next();
        System.out.println("id:");
        idUsuario = ler.nextInt();

        /**
         * Cria o arquivo com os dados do usuario separados por ";"
         */
        try {
            criarArquivo(categoriaUsuario,nomeUsuario,idUsuario);
        } catch (Exception e) {
            System.out.println("Falha ao criar o arquivo!");
        }
        System.out.println("----------------------------------------------------");

        /**
         * Variaveis auxiliares para conrole dos membros que serao cadastrados pelo usuario e determinar o horario do sistema
         */
        int opMenu = 0;
        HorarioSistema horaSistema= HorarioSistema.REGULAR;
        int tipoMembro;
        String nomeMembro;
        String emailMembro;
        TiposMembros funcaoMembro;
        int idMembro;
        int posicaoLista;

        /**
         * Inicio do loop para o menu de selecao do usuario
         */
        while (opMenu != 6) {
            System.out.println("-----------------------Menu-------------------------");
            System.out.println("Horário de trabalho: " + horaSistema);
            System.out.println("1. Trocar horário do sistema");
            System.out.println("2. Adicionar membros");
            System.out.println("3. Remover membros");
            System.out.println("4. Postar mensagem dos integrantes");
            System.out.println("5. Relatório dos membros (apresentação)");
            System.out.println("6. Sair do Programa");
            System.out.println("Selecione a opção desejada:");
            opMenu = ler.nextInt();

            /**
             * Verifica a escolha do usuario para executar a funcionalidade desejada
             */
            switch (opMenu) {
                /**
                 * Faz a troca de horarios do sistema
                 */
                case (1):
                    if (horaSistema.equals(HorarioSistema.REGULAR))
                        horaSistema = HorarioSistema.EXTRA;
                    else
                        horaSistema = HorarioSistema.REGULAR;
                    break;
                /**
                 * Adiciona novos membros
                 */
                case (2):
                    System.out.println("Selecione o tipo de membro");
                    System.out.println("1. Mobile Member");
                    System.out.println("2. Heavy Lifter");
                    System.out.println("3. Script Guy");
                    System.out.println("4. Big Brother");
                    System.out.println("Tipo:");
                    tipoMembro = ler.nextInt();
                    /**
                     * Faz a leitura do numero escolhido pelo usuario, que representa um tipo de membro, para adiciona-lo
                     */
                    switch (tipoMembro){
                        /**
                         * Adiciona o membro do tipo Mobile Member a lista de Mobile Members a partir do seu nome, email e id
                         */
                        case (1):
                            funcaoMembro = TiposMembros.MOBILEMEMBER;
                            System.out.println("Nome(sem espaços):");
                            nomeMembro = ler.next();
                            System.out.println("Email:");
                            emailMembro = ler.next();
                            System.out.println("Id:");
                            idMembro = ler.nextInt();
                            Membro mobileMember = new MobileMember(nomeMembro,emailMembro,idMembro);
                            listaMobileMembers.add(mobileMember);
                            System.out.println("Membro adicionado!");
                            break;
                        /**
                         * Adiciona o membro do tipo Heavy Lifter a lista de Heavy Lifters a partir do seu nome, email e id
                         */
                        case (2):
                            funcaoMembro = TiposMembros.HEAVYLIFTER;
                            System.out.println("Nome(sem espaços):");
                            nomeMembro = ler.next();
                            System.out.println("Email:");
                            emailMembro = ler.next();
                            System.out.println("Id:");
                            idMembro = ler.nextInt();
                            Membro heavyLifter = new HeavyLifter(nomeMembro,emailMembro,idMembro);
                            listaHeavyLifters.add(heavyLifter);
                            System.out.println("Membro adicionado!");
                            break;
                        /**
                         * Adiciona o membro do tipo Script Guy a lista de Script Guys a partir do seu nome, email e id
                         */
                        case(3):
                            funcaoMembro = TiposMembros.SCRIPTGUY;
                            System.out.println("Nome(sem espaços):");
                            nomeMembro = ler.next();
                            System.out.println("Email:");
                            emailMembro = ler.next();
                            System.out.println("Id:");
                            idMembro = ler.nextInt();
                            Membro scriptGuy = new ScriptGuys(nomeMembro,emailMembro,idMembro);
                            listaScriptGuys.add(scriptGuy);
                            System.out.println("Membro adicionado!");
                            break;
                        /**
                         * Adiciona o membro do tipo Big Brother a lista de Big Brothers a partir do seu nome, email e id
                         */
                        case(4):
                            funcaoMembro = TiposMembros.BIGBROTHER;
                            System.out.println("Nome(sem espaços):");
                            nomeMembro = ler.next();
                            System.out.println("Email:");
                            emailMembro = ler.next();
                            System.out.println("Id:");
                            idMembro = ler.nextInt();
                            Membro bigBrother = new BigBrother(nomeMembro,emailMembro,idMembro);
                            listaBigBrothers.add(bigBrother);
                            System.out.println("Membro adicionado!");
                            break;
                        /**
                         * Retorna uma mensagem de erro para qualquer numero que nao esteja no menu
                         */
                        default:
                            System.out.println("Número inválido!");
                            break;
                    }
                    break;
                /**
                 * Retira um membro cadastrado no sistema
                 */
                case(3):
                    System.out.println("Selecione o tipo de membro");
                    System.out.println("1. Mobile Member");
                    System.out.println("2. Heavy Lifter");
                    System.out.println("3. Script Guy");
                    System.out.println("4. Big Brother");
                    System.out.println("Tipo:");
                    tipoMembro = ler.nextInt();

                    /**
                     * Faz a leitura do numero escolhido pelo usuario, que representa um tipo de membro, para retira-lo
                     */
                    switch (tipoMembro){
                        /**
                         * Retira um membro Mobile Member a partir da sua posicao na lista de Mobile Members, considerando que a lista tem inicio na posicao de numero 1
                         */
                        case (1):
                            System.out.println("Posição na lista de membros(começa em 1):");
                            posicaoLista = ler.nextInt();
                            posicaoLista -= 1;
                            listaMobileMembers.remove(posicaoLista);
                            System.out.println("Membro Removido!");
                            break;
                        /**
                         * Retira um membro Heavy Lifter a partir da sua posicao na lista de Heavy Lifters, considerando que a lista tem inicio na posicao de numero 1
                         */
                        case (2):
                            System.out.println("Posição na lista de membros(começa em 1):");
                            posicaoLista = ler.nextInt();
                            posicaoLista -= 1;
                            listaHeavyLifters.remove(posicaoLista);
                            System.out.println("Membro Removido!");
                            break;
                        /**
                         * Retira um membro Script Guy a partir da sua posicao na lista de Script Guys, considerando que a lista tem inicio na posicao de numero 1
                         */
                        case (3):
                            System.out.println("Posição na lista de membros(começa em 1):");
                            posicaoLista = ler.nextInt();
                            posicaoLista -= 1;
                            listaScriptGuys.remove(posicaoLista);
                            System.out.println("Membro Removido!");
                            break;
                        /**
                         * Retira um membro Big Brother a partir da sua posicao na lista de Big Brothers, considerando que a lista tem inicio na posicao de numero 1
                         */
                        case (4):
                            System.out.println("Posição na lista de membros(começa em 1):");
                            posicaoLista = ler.nextInt();
                            posicaoLista -= 1;
                            listaBigBrothers.remove(posicaoLista);
                            System.out.println("Membro Removido!");
                            break;
                        /**
                         * Retorna uma mensagem de erro para qualquer numero que nao esteja no menu
                         */
                        default:
                            System.out.println("Número inválido!");
                            break;
                    }
                    break;
                /**
                 * Posta uma mensagem para todos os membros cadastrados no sistema de acordo com o horario de trabalho atual
                 */
                case (4):
                    System.out.println("-------------------Mobile Members-------------------");
                    for(Membro membro : listaMobileMembers) {
                        System.out.println(membro.postarMensagem(horaSistema));
                    }
                    System.out.println("-------------------Heavy Lifters--------------------");
                    for(Membro membro : listaHeavyLifters) {
                        System.out.println(membro.postarMensagem(horaSistema));
                    }
                    System.out.println("-------------------Script Guys----------------------");
                    for(Membro membro : listaScriptGuys) {
                        System.out.println(membro.postarMensagem(horaSistema));
                    }
                    System.out.println("-------------------Big Brothers---------------------");
                    for(Membro membro : listaBigBrothers) {
                        System.out.println(membro.postarMensagem(horaSistema));
                    }
                    break;
                /**
                 * Posta uma pequena apresentacao para cada um dos membros cadastrados no sistema, informando nome e funcao
                 */
                case(5):
                    System.out.println("-------------------Mobile Members-------------------");
                    for(Membro membro : listaMobileMembers) {
                        System.out.println(membro.apresentacao());
                    }
                    System.out.println("-------------------Heavy Lifters--------------------");
                    for(Membro membro : listaHeavyLifters) {
                        System.out.println(membro.apresentacao());
                    }
                    System.out.println("-------------------Script Guys----------------------");
                    for(Membro membro : listaScriptGuys) {
                        System.out.println(membro.apresentacao());
                    }
                    System.out.println("-------------------Big Brothers---------------------");
                    for(Membro membro : listaBigBrothers) {
                        System.out.println(membro.apresentacao());
                    }
                    break;
                /**
                 * Finaliza a execucao do sistema
                 */
                case(6):
                    System.out.println("Sistema Finalizado!");
                    break;
                /**
                 * Retorna uma mensagem de erro para qualquer numero que nao esteja no menu
                 */
                default:
                    System.out.println("Funcionalidade ainda não implementada!");
                    break;
            }
        }
    }

    /**
     * Implementacao do metodo criarArquivo, obtido pela interface Auxiliar, que cria o arquivo com os dados do usuario do sistema (categoria, nome e id) separados por ";"
     * @param categoria Categoria a qual pertence o usuario do sistema, dentre Mobile Member, Heavy Lifter, Script Guy e Big Brother
     * @param nome Nome do usuario do sistema
     * @param id id do usuario do sistema
     * @throws Exception Excecao lancada pelo metodo cado haja algum erro na criacao do arquivo
     */
    @Override
    public void criarArquivo(String categoria, String nome, int id) throws Exception {
        FileWriter escreveArquivo = new FileWriter("arquivo_super_Secreto_nao_abrir.csv");
        String dadosUsuario = categoria + ";" + nome + ";" + Integer.toString(id);
        escreveArquivo.write(dadosUsuario);
        escreveArquivo.close();
    }
}
