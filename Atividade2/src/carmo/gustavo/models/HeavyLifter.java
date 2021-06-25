package carmo.gustavo.models;

import carmo.gustavo.enums.HorarioSistema;
import carmo.gustavo.enums.TiposMembros;

public class HeavyLifter extends Membro{
    public HeavyLifter(String nome, String email, int id) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.funcao = TiposMembros.HEAVYLIFTER;
    }

    @Override
    public String apresentacao() {
        String apresentar;
        apresentar = "Oi sou o " + nome + ", Heavy Lifter da Mask_Society.";
        return apresentar;
    }

    @Override
    public String postarMensagem(HorarioSistema horarioSistema) {
        if(horarioSistema.equals(HorarioSistema.REGULAR))
            return "Podem contar conosco!";
        else
            return "N00b_qu3_n_Se_r3pita.bat";
    }
}
