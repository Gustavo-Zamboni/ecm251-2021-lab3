package carmo.gustavo.models;

import carmo.gustavo.enums.HorarioSistema;
import carmo.gustavo.enums.TiposMembros;

public class ScriptGuys extends Membro{
    public ScriptGuys(String nome, String email, int id) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.funcao = TiposMembros.SCRIPTGUY;
    }

    @Override
    public String apresentacao() {
        String apresentar;
        apresentar = "Oi sou o " + nome + ", Script Guy da Mask_Society.";
        return apresentar;
    }

    @Override
    public String postarMensagem(HorarioSistema horarioSistema) {
        if(horarioSistema.equals(HorarioSistema.REGULAR))
            return "Prazer em ajudar novos amigos de código!";
        else
            return "Qu3Ro_s3us_r3curs0s.py";
    }
}
