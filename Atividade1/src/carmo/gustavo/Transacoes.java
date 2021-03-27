package carmo.gustavo;

import java.util.Random;

public class Transacoes {

    private static int getRandomNumberInRange ( int min , int max ) {
        // Gera um número aleatório entre dois valores determinados
        Random r = new Random ();
        return r . nextInt (( max - min ) + 1 ) + min ;
    }

    public String gerarString(Contas conta, Usuarios usuario, float valorRequisitado){
        // Criação das variáveis do método
        String id;
        String nome;
        String QR;
        String valor;
        String numeroRandomico;

        // Obter as variáveis para gerar o QRcode
        id = Integer.toString(conta.getIdConta());
        nome = usuario.getNome();
        valor = Float.toString(valorRequisitado);
        numeroRandomico = Integer.toString(getRandomNumberInRange(1000,9999));

        // Geração da String do QRcode
        QR = id + ";" + nome + ";" + valor + ";" + numeroRandomico;

        return QR;
    }

    public boolean realizarPagamento(){
        // Efetua, se possível, o pagamento entre duas contas
        return true;
    }

}
