package carmo.gustavo.models;

import carmo.gustavo.enums.TiposMembros;

import javax.imageio.IIOException;
import java.io.FileWriter;
import java.io.IOException;

public abstract class Auxiliar {
    public static void criarArquivo(TiposMembros categoria, String nome, int id) throws IOException {
        FileWriter escreveArquivo = new FileWriter("arquivo_super_Secreto_nao_abrir.csv");
        String dadosUsuario = categoria + ";" + nome + ";" + Integer.toString(id);
        escreveArquivo.write(dadosUsuario);

        escreveArquivo.close();
    }
}
