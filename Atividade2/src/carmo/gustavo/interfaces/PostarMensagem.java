package carmo.gustavo.interfaces;

import carmo.gustavo.enums.HorarioSistema;
import carmo.gustavo.enums.TiposMembros;

public interface PostarMensagem {
    String postarMensagem(HorarioSistema horarioSistema, TiposMembros tipoMembros);
}
