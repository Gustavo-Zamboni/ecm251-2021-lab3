package carmo.gustavo.interfaces;

/**
 * Interface Auxiliar para uso no sistema, no momento
 * de criacao do arquivo, com os dados do usuario que
 * acessar o sistema
 */
public interface Auxiliar {
    /**
     * Metodo para criar o arquivo .csv com os dados do usuario
     * @param categoria funcao do usuario na Mask Society, dentre Mobile Member,
     *                  Heavy Lifter, Script Guy e Big Brother
     * @param nome nome do usuario
     * @param id id do usuario
     * @throws Exception Excecao lancada para verificar se ocorreu um erro
     * na criacao do arquivo
     */
    void criarArquivo(String categoria, String nome, int id) throws Exception;
}
