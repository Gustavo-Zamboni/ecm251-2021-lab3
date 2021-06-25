package carmo.gustavo;

import carmo.gustavo.enums.HorarioSistema;
import carmo.gustavo.models.HeavyLifter;
import carmo.gustavo.models.Membro;
import carmo.gustavo.models.MobileMember;

public class Sistema {
    public void Executar(){
        Membro mb = new MobileMember("José","@gmail",1);
        Membro hl = new HeavyLifter("Lucas","@gmail",1);

        System.out.println(mb.apresentacao());
        System.out.println(mb.postarMensagem(HorarioSistema.REGULAR));
        System.out.println(hl.apresentacao());
        System.out.println(hl.postarMensagem(HorarioSistema.REGULAR));
    }
}
