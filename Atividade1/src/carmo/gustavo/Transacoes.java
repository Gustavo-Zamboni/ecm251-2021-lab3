// Nome: Gustavo Zamboni do Carmo
// RA: 19.01266-7

package carmo.gustavo;

import java.util.Random;

public class Transacoes {

    private static int getRandomNumberInRange ( int min , int max ) {
        // Gera um número aleatório entre dois valores determinados
        Random r = new Random ();
        return r . nextInt (( max - min ) + 1 ) + min ;
    }

    public static String gerarString(Usuarios usuario, float valorRequisitado){
        // Criação das variáveis do método
        String id;
        String nome;
        String QR;
        String valor;
        String numeroRandomico;

        // Obter as variáveis para gerar o QRcode
        id = Integer.toString(usuario.conta.getIdConta());
        nome = usuario.getNome();
        valor = Float.toString(valorRequisitado);
        numeroRandomico = Integer.toString(getRandomNumberInRange(1000,9999));

        // Geração da String do QRcode
        QR = id + ";" + nome + ";" + valor + ";" + numeroRandomico;

        return QR;
    }

    public static boolean realizarPagamento(Usuarios pagador, Usuarios recebedor, String solicitacao){
        // Efetua, se possível, o pagamento entre duas contas

        // Separa os componentes da string de solicitação
        String[] dados = solicitacao.split(";");

        // Validação do nome e ID do recebedor, e do saldo do pagador
        if((Integer.parseInt(dados[0]) == recebedor.conta.getIdConta()) &&
                (dados[1].equals(recebedor.getNome())) &&
                (pagador.conta.getSaldo() >= Float.parseFloat(dados[2]))){

        // Realizas as devidas transações, modificando o valor dos saldos das contas
        pagador.conta.setSaldo(pagador.conta.getSaldo() - Float.parseFloat(dados[2]));
        recebedor.conta.setSaldo(recebedor.conta.getSaldo() + Float.parseFloat(dados[2]));

        return true;
        }else{
            return false;
        }

    }


}
