package carmo.gustavo.models;

import carmo.gustavo.enums.HorarioSistema;
import carmo.gustavo.enums.TiposMembros;

public class BigBrother extends Membro{
    public BigBrother(String nome, String email, int id) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.funcao = TiposMembros.BIGBROTHER;
    }

    @Override
    public String apresentacao() {
        String apresentar;
        apresentar = "Oi sou o " + nome + ", Big Brother da Mask_Society.";
        return apresentar;
    }

    @Override
    public String postarMensagem(HorarioSistema horarioSistema) {
        if(horarioSistema.equals(HorarioSistema.REGULAR))
            return "Sempre ajudando as pessoas, membros ou não!";
        else
            return "...";
    }
}
