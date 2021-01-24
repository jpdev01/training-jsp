package config.files;

import javax.servlet.http.HttpServletRequest;
import java.io.FileWriter;
import java.io.IOException;

public class Write {
    public void Write(){

    }

    public void writeToFile(String urlDoc, HttpServletRequest request, String message, boolean add) throws IOException {
        try {
            FileWriter fw = new FileWriter(urlDoc, add);
            // o segundo parametro define o append, ou seja, se for true, quando tiver conteúdo no documento, ele não será apagado.
            // Mas terá conteudo adicionado.
            // se false, sobrescreve
            fw.write(message);
            fw.write(System.getProperty("line.separator"));
            fw.close();
        } catch (Exception e) {

        }

    }
}
