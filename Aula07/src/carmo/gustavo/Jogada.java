package carmo.gustavo;

public class Jogada {
    public Resultado verificaResultado(Jogada jogada) {
        if(verificarSeGanhei(jogada)){
            return Resultado.GANHEI;
        }
        if(verificarSePerdi(jogada)){
            return Resultado.PERDI;
        }
        return Resultado.EMPATEI;
    }
    public boolean verificarSeGanhei(Jogada jogada){
        return true;
    }
    public boolean verificarSePerdi(Jogada jogada){
        return true;
    }
}
