package carmo.gustavo.models;

import carmo.gustavo.enums.HorarioSistema;
import carmo.gustavo.enums.TiposMembros;

/**
 * Subclasse de Membro, contem as implementacoes dos membros que
 * sao do tipo Mobile Member
 */
public class MobileMember extends Membro{
    /**
     * Construtor da Classe Mobile Member que define a funcao automaticamente
     * do membro como Mobile Member
     * @param nome nome atribuido a instancia membro
     * @param email email atribuido a instancia membro
     * @param id id atribuido a instancia membro
     */
    public MobileMember(String nome, String email, int id) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.funcao = TiposMembros.MOBILEMEMBER;
    }

    /**
     * Metodo obtido da interface Apresentacao que retorna uma
     * String com a apresentacao do membro do tipo Mobile Member
     * @return uma String com o nome e funcao do membro do tipo
     * Mobile Member
     */
    @Override
    public String apresentacao() {
        String apresentar;
        apresentar = "Oi sou o " + nome + ", Mobile Member da Mask_Society.";
        return apresentar;
    }

    /**
     * Metodo obtido da interface PostarMensagem que retorna uma String com a mensagem
     * especifica do membro Mobile Member
     * @param horarioSistema hora atual do sistema, que pode ser Regular ou Extra
     * @return uma String especifica do membro Mobile Member de acordo com o horario
     * do sistema
     */
    @Override
    public String postarMensagem(HorarioSistema horarioSistema) {
        if(horarioSistema.equals(HorarioSistema.REGULAR))
            return "Happy Coding!";
        else
            return "Happy_C0d1ng.Maskers";
    }
}
