package carmo.gustavo;

import carmo.gustavo.interfaces.Auxiliar;
import java.io.FileWriter;
import java.util.Scanner;

public class Sistema implements Auxiliar {

    public void Executar(){
        Scanner ler = new Scanner(System.in);
        String nomeUsuario;
        int idUsuario;
        String categoriaUsuario;

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
        System.out.println("-----------------------Menu-------------------------");
        System.out.println("Horário de trabalho: REGULAR");
        System.out.println("1. Trocar horário do sistema");
        System.out.println("2. Adicionar membros");
        System.out.println("3. Postar mensagem dos integrantes");
        System.out.println("4. Relatório dos membros (apresentação)");
        System.out.println("5. Sair do Programa");

        

    }

    @Override
    public void criarArquivo(String categoria, String nome, int id) throws Exception {
        FileWriter escreveArquivo = new FileWriter("arquivo_super_Secreto_nao_abrir.csv");
        String dadosUsuario = categoria + ";" + nome + ";" + Integer.toString(id);
        escreveArquivo.write(dadosUsuario);
        escreveArquivo.close();
    }
}
