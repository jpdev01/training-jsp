package filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.io.FileWriter;
import java.io.IOException;

@WebFilter(filterName = "Timer", value = "/*")
public class TimeFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        long inicio = System.currentTimeMillis(); // inicio do cronometro

        chain.doFilter(req, resp); // chama a request
        // voltando da request
        long fim = System.currentTimeMillis();
        long time = (fim - inicio);
        System.out.println("Tempo de processamento:" + time + " milissegundos");

        // vamos escrever isso em um doc!!!
        HttpServletRequest request = (HttpServletRequest) req;
        FileWriter fw = new FileWriter("C:/jpt/jptpgm/Java/Web/training-jsp/src/main/TimeFilter.txt", true);
        // o segundo parametro define o append, ou seja, se for true, quando tiver conteúdo no documento, ele não será apagado.
        // Mas terá conteudo adicionado.
        fw.write("URI:" + request.getRequestURI() + "\nTempo de processamento: " + time + " ms");
        fw.write(System.getProperty("line.separator"));
        fw.close();
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
