package carmo.gustavo;

import carmo.gustavo.enums.HorarioSistema;
import carmo.gustavo.enums.TiposMembros;
import carmo.gustavo.interfaces.Auxiliar;
import carmo.gustavo.models.HeavyLifter;
import carmo.gustavo.models.Membro;
import carmo.gustavo.models.MobileMember;

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


        System.out.println("------Bem vindo ao gerenciador da MAsK_S0c13ty------");
        System.out.println("Insira seus dados:");
        System.out.println("Nome:");
        nomeUsuario = ler.next();
        System.out.println("categoria:");
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
                            //for(Membro membro : listaMobileMembers) {
                            //    System.out.println(membro.apresentacao());
                            //}
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

                            break;
                        case(4):
                            break;
                        default:
                            System.out.println("Número inválido!");
                            break;
                    }
                    break;
                case(3):
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
