package carmo.gustavo.models;

import carmo.gustavo.enums.HorarioSistema;
import carmo.gustavo.enums.TiposMembros;

/**
 * Subclasse de Membro, contem as implementacoes dos membros que
 * sao do tipo Big Brother
 */
public class BigBrother extends Membro{
    /**
     * Construtor da Classe Big Brother que define a funcao automaticamente
     * do membro como Big Brother
     * @param nome nome atribuido a instancia membro
     * @param email email atribuido a instancia membro
     * @param id id atribuido a instancia membro
     */
    public BigBrother(String nome, String email, int id) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.funcao = TiposMembros.BIGBROTHER;
    }

    /**
     * Metodo obtido da interface Apresentacao que retorna uma
     * String com a apresentacao do membro do tipo Big Brother
     * @return uma String com o nome e funcao do membro do tipo
     * Big Brother
     */
    @Override
    public String apresentacao() {
        String apresentar;
        apresentar = "Oi sou o " + nome + ", Big Brother da Mask_Society.";
        return apresentar;
    }

    /**
     * Metodo obtido da interface PostarMensagem que retorna uma String com a mensagem
     * especifica do membro Big Brother
     * @param horarioSistema hora atual do sistema, que pode ser Regular ou Extra
     * @return uma String especifica do membro Big Brother de acordo com o horario
     * do sistema
     */
    @Override
    public String postarMensagem(HorarioSistema horarioSistema) {
        if(horarioSistema.equals(HorarioSistema.REGULAR))
            return "Sempre ajudando as pessoas, membros ou não!";
        else
            return "...";
    }
}
