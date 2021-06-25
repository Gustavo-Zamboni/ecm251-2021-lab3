package carmo.gustavo;

import carmo.gustavo.enums.HorarioSistema;
import carmo.gustavo.models.Membro;
import carmo.gustavo.models.MobileMember;

public class Sistema {
    public void Executar(){
        Membro mb = new MobileMember("José","@gmail",1);
        System.out.println(mb.apresentacao());
        System.out.println(mb.postarMensagem(HorarioSistema.REGULAR));
    }
}
