package carmo.gustavo.models;

import carmo.gustavo.enums.TiposMembros;
import carmo.gustavo.interfaces.Apresentação;
import carmo.gustavo.interfaces.PostarMensagem;

/**
 * Superclasse membro que contem as iformacoes base de todos os
 * membros da Mask Society
 */
public abstract class Membro  implements PostarMensagem, Apresentação {
    protected String nome;
    protected int id;
    protected String email;
    protected String postagem;
    protected TiposMembros funcao;

}
