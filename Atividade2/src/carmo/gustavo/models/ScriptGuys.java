package carmo.gustavo.models;

import carmo.gustavo.enums.HorarioSistema;
import carmo.gustavo.enums.TiposMembros;

/**
 * Subclasse de Membro, contem as implementacoes dos membros que
 * sao do tipo Script Guy
 */
public class ScriptGuys extends Membro{
    /**
     * Construtor da Classe Scipt Guys que define a funcao automaticamente
     * do membro como Script Guy
     * @param nome nome atribuido a instancia membro
     * @param email email atribuido a instancia membro
     * @param id id atribuido a instancia membro
     */
    public ScriptGuys(String nome, String email, int id) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.funcao = TiposMembros.SCRIPTGUY;
    }

    /**
     * Metodo obtido da interface Apresentacao que retorna uma
     * String com a apresentacao do membro do tipo Script Guy
     * @return uma String com o nome e funcao do membro do tipo
     * Script Guy
     */
    @Override
    public String apresentacao() {
        String apresentar;
        apresentar = "Oi sou o " + nome + ", Script Guy da Mask_Society.";
        return apresentar;
    }

    /**
     * Metodo obtido da interface PostarMensagem que retorna uma String com a mensagem
     * especifica do membro Script Guy
     * @param horarioSistema hora atual do sistema, que pode ser Regular ou Extra
     * @return uma String especifica do membro Script Guy de acordo com o horario
     * do sistema
     */
    @Override
    public String postarMensagem(HorarioSistema horarioSistema) {
        if(horarioSistema.equals(HorarioSistema.REGULAR))
            return "Prazer em ajudar novos amigos de código!";
        else
            return "Qu3Ro_s3us_r3curs0s.py";
    }
}
