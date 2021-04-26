package carmo.gustavo;

import java.util.Random;
import java.util.Scanner;

public class Sistema {
    private Jogador player1;
    private Jogador player2;
    private Scanner scanner;

    public Sistema() {
        this.scanner = new Scanner(System.in);
        inicializaPalyers();
    }

    private void inicializaPalyers() {
        System.out.println("Informe seu nome:");
        String nome = scanner.next();
        this.player1 = new Jogador(nome,true);
        this.player2 = new Jogador(nome);

    }

    public void run(){
        while (true){
            System.out.println(player1 + " vs " + player2);
            player1.setJogada(selecionarJogada());
            player2.setJogada(sortearJogada());
            System.out.println("Jogadas:");
            System.out.println(player1+ ":" + player1.getJogada());
            System.out.println(player2+ ":" + player2.getJogada());
            System.out.println("Resultado:" + player1.getJogada().verificarResultado(player2.getJogada()));
        }

        private Jogada sortearJogada() {
            Jogada [] jogadas = new Jogada[]{new Pedra(), new Papel(), new Tesoura()};
            return jogadas[new Random().nextInt(jogadas.length)];
        }
    }
}
