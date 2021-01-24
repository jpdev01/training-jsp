package filter;

import config.files.Write;

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
        HttpServletRequest request = (HttpServletRequest) req; // p armazenar a requisição (primeira)

        chain.doFilter(req, resp); // chama a request
        // voltando da request
        long fim = System.currentTimeMillis();
        long time = (fim - inicio);
        System.out.println("Tempo de processamento:" + time + " milissegundos");

        // vamos escrever isso em um doc!!!
        Write wToFile = new Write();
        String message = "URI:" + request.getRequestURI() + "\nTempo de processamento: " + time + " ms";
        wToFile.writeToFile("C:/jpt/jptpgm/Java/Web/training-jsp/src/main/TimeFilter.txt", request, message, true);
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
