package carmo.gustavo.interfaces;

import carmo.gustavo.enums.HorarioSistema;

/**
 * Interface PostarMensagem que posta uma mensagem do membro quando solicitado
 */
public interface PostarMensagem {
    /**
     * Metodo que, a partir do horario do sistema, retorna a mensagem especifica
     * do membro
     * @param horarioSistema hora atual do sistema, que pode ser Regular ou Extra
     * @return uma String com a mensagem do membro de acordo com o horario do sistema
     */
    String postarMensagem(HorarioSistema horarioSistema);
}
