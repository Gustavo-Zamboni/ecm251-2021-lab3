package carmo.gustavo;

import carmo.gustavo.interfaces.Auxiliar;
import java.util.Scanner;

public class Sistema implements Auxiliar {
    public void Executar(){
        Scanner ler = new Scanner(System.in);
        String nomeUsuario = "";
        int idUsuario = 0;
        String categoriaUsuario = "";

        System.out.println("------Bem vindo ao gerenciador da MAsK_S0c13ty------");
        System.out.println("Insira seus dados:");
        System.out.println("Nome:");
        nomeUsuario = ler.next();
        System.out.println("categoria:");
        categoriaUsuario = ler.next();
        System.out.println("id:");
        idUsuario = ler.nextInt();

        }

}
