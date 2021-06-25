package carmo.gustavo;

import carmo.gustavo.enums.HorarioSistema;
import carmo.gustavo.models.*;

public class Sistema {
    public void Executar(){
        Membro mb = new MobileMember("José","@gmail",1);
        Membro hl = new HeavyLifter("Lucas","@gmail",1);
        Membro sg = new ScriptGuys("Jonas","@gmail",1);
        Membro bb = new BigBrother("Thiago","@gmail",1);

        System.out.println(mb.apresentacao());
        System.out.println(mb.postarMensagem(HorarioSistema.REGULAR));
        System.out.println(hl.apresentacao());
        System.out.println(hl.postarMensagem(HorarioSistema.REGULAR));
        System.out.println(sg.apresentacao());
        System.out.println(sg.postarMensagem(HorarioSistema.REGULAR));
        System.out.println(bb.apresentacao());
        System.out.println(bb.postarMensagem(HorarioSistema.REGULAR));
    }
}
