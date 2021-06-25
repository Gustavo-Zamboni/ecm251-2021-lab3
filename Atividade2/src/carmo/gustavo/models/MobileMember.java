package carmo.gustavo.models;

import carmo.gustavo.enums.HorarioSistema;
import carmo.gustavo.enums.TiposMembros;

public class MobileMember extends Membro{
    public MobileMember(String nome, String email, String funcao, int id) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.funcao = TiposMembros.MOBILEMEMBER;
    }

    @Override
    public String apresentacao() {
        return null;
    }

    @Override
    public String postarMensagem(HorarioSistema horarioSistema, TiposMembros tipoMembros) {
        return null;
    }
}
