package carmo.gustavo;

import carmo.gustavo.enums.HorarioSistema;
import carmo.gustavo.enums.TiposMembros;
import carmo.gustavo.interfaces.Auxiliar;
import carmo.gustavo.models.*;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Sistema implements Auxiliar{

    public void Executar(){
        Scanner ler = new Scanner(System.in);
        String nomeUsuario;
        int idUsuario;
        String categoriaUsuario;
        ArrayList<Membro> listaMobileMembers= new ArrayList<>();
        ArrayList<Membro> listaHeavyLifters = new ArrayList<>();
        ArrayList<Membro> listaScriptGuys = new ArrayList<>();
        ArrayList<Membro> listaBigBrothers = new ArrayList<>();


        System.out.println("------Bem vindo ao gerenciador da MAsK_S0c13ty------");
        System.out.println("Insira seus dados:");
        System.out.println("Nome(sem espaços):");
        nomeUsuario = ler.next();
        System.out.println("categoria(sem espaços):");
        categoriaUsuario = ler.next();
        System.out.println("id:");
        idUsuario = ler.nextInt();
        try {
            criarArquivo(categoriaUsuario,nomeUsuario,idUsuario);
        } catch (Exception e) {
            System.out.println("Falha ao criar o arquivo!");
        }
        System.out.println("----------------------------------------------------");

        int opMenu = 0;
        HorarioSistema horaSistema= HorarioSistema.REGULAR;
        int tipoMembro;
        String nomeMembro;
        String emailMembro;
        TiposMembros funcaoMembro;
        int idMembro;
        int posicaoLista;

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
            switch (opMenu) {
                case (1):
                    if (horaSistema.equals(HorarioSistema.REGULAR))
                        horaSistema = HorarioSistema.EXTRA;
                    else
                        horaSistema = HorarioSistema.REGULAR;
                    break;
                case (2):
                    System.out.println("Selecione o tipo de membro");
                    System.out.println("1. Mobile Member");
                    System.out.println("2. Heavy Lifter");
                    System.out.println("3. Script Guy");
                    System.out.println("4. Big Brother");
                    System.out.println("Tipo:");
                    tipoMembro = ler.nextInt();
                    switch (tipoMembro){
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
                            break;
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
                            break;
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
                            break;
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
                            break;
                        default:
                            System.out.println("Número inválido!");
                            break;
                    }
                    break;
                case(3):
                    System.out.println("Selecione o tipo de membro");
                    System.out.println("1. Mobile Member");
                    System.out.println("2. Heavy Lifter");
                    System.out.println("3. Script Guy");
                    System.out.println("4. Big Brother");
                    System.out.println("Tipo:");
                    tipoMembro = ler.nextInt();
                    switch (tipoMembro){
                        case (1):
                            System.out.println("Posição na lista de membros(começa em 1):");
                            posicaoLista = ler.nextInt();
                            posicaoLista -= 1;
                            listaMobileMembers.remove(posicaoLista);
                            break;
                        case (2):
                            System.out.println("Posição na lista de membros(começa em 1):");
                            posicaoLista = ler.nextInt();
                            posicaoLista -= 1;
                            listaHeavyLifters.remove(posicaoLista);
                            break;
                        case (3):
                            System.out.println("Posição na lista de membros(começa em 1):");
                            posicaoLista = ler.nextInt();
                            posicaoLista -= 1;
                            listaScriptGuys.remove(posicaoLista);
                            break;
                        case (4):
                            System.out.println("Posição na lista de membros(começa em 1):");
                            posicaoLista = ler.nextInt();
                            posicaoLista -= 1;
                            listaBigBrothers.remove(posicaoLista);
                            break;
                        default:
                            System.out.println("Número inválido!");
                            break;
                    }
                    break;
                case (4):
                    System.out.println("Mobile Members");
                    for(Membro membro : listaMobileMembers) {
                        System.out.println(membro.postarMensagem(horaSistema));
                    }
                    System.out.println("Heavy Lifters");
                    for(Membro membro : listaHeavyLifters) {
                        System.out.println(membro.postarMensagem(horaSistema));
                    }
                    System.out.println("Script Guys");
                    for(Membro membro : listaScriptGuys) {
                        System.out.println(membro.postarMensagem(horaSistema));
                    }
                    System.out.println("Big Brothers");
                    for(Membro membro : listaBigBrothers) {
                        System.out.println(membro.postarMensagem(horaSistema));
                    }
                    break;
                case(6):
                    System.out.println("Sistema Finalizado!");
                    break;
                default:
                    System.out.println("Funcionalidade ainda não implementada!");
                    break;
            }
        }
    }

    @Override
    public void criarArquivo(String categoria, String nome, int id) throws Exception {
        FileWriter escreveArquivo = new FileWriter("arquivo_super_Secreto_nao_abrir.csv");
        String dadosUsuario = categoria + ";" + nome + ";" + Integer.toString(id);
        escreveArquivo.write(dadosUsuario);
        escreveArquivo.close();
    }
}
