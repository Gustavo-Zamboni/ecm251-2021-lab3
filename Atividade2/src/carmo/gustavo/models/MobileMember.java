package carmo.gustavo.models;

import carmo.gustavo.enums.HorarioSistema;
import carmo.gustavo.enums.TiposMembros;

public class MobileMember extends Membro{
    public MobileMember(String nome, String email, int id) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.funcao = TiposMembros.MOBILEMEMBER;
    }

    @Override
    public String apresentacao() {
        String apresentar;
        apresentar = "Oi sou o " + nome + ", Mobile Member da Mask_Society.";
        return apresentar;
    }

    @Override
    public String postarMensagem(HorarioSistema horarioSistema) {
        if(horarioSistema.equals(HorarioSistema.REGULAR))
            return "Happy Coding!";
        else
            return "Happy_C0d1ng.Maskers";
    }
}
