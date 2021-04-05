package carmo.gustavo;

public class DadoTestDrive {
    public static void main(String[] args) {
        Dado d1 = new Dado(6);
        System.out.println("Primeira leitura:" + d1.pegarFaceAtual());
        for (int i = 0; i < 10; i++) {
            System.out.println("Número sorteado:" + d1.sortearNumero());
            System.out.println("Face atual:" +d1.pegarFaceAtual());
        }
    }
}
