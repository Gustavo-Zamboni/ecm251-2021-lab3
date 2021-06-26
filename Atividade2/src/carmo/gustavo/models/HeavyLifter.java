package carmo.gustavo.models;

import carmo.gustavo.enums.HorarioSistema;
import carmo.gustavo.enums.TiposMembros;

/**
 * Subclasse de Membro, contem as implementacoes dos membros que
 * sao do tipo Heavy Lifter
 */
public class HeavyLifter extends Membro{
    /**
     * Construtor da Classe Heavy Lifter que define a funcao automaticamente
     * do membro como Heavy Lifter
     * @param nome nome atribuido a instancia membro
     * @param email email atribuido a instancia membro
     * @param id id atribuido a instancia membro
     */
    public HeavyLifter(String nome, String email, int id) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.funcao = TiposMembros.HEAVYLIFTER;
    }

    /**
     * Metodo obtido da interface Apresentacao que retorna uma
     * String com a apresentacao do membro do tipo Heavy Lifter
     * @return uma String com o nome e funcao do membro do tipo
     * Heavy Lifter
     */
    @Override
    public String apresentacao() {
        String apresentar;
        apresentar = "Oi sou o " + nome + ", Heavy Lifter da Mask_Society.";
        return apresentar;
    }

    /**
     * Metodo obtido da interface PostarMensagem que retorna uma String com a mensagem
     * especifica do membro Heavy Lifter
     * @param horarioSistema hora atual do sistema, que pode ser Regular ou Extra
     * @return uma String especifica do membro Heavy Lifter de acordo com o horario
     * do sistema
     */
    @Override
    public String postarMensagem(HorarioSistema horarioSistema) {
        if(horarioSistema.equals(HorarioSistema.REGULAR))
            return "Podem contar conosco!";
        else
            return "N00b_qu3_n_Se_r3pita.bat";
    }
}
