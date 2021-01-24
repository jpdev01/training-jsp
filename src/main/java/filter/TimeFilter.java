package filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
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
        long tempoDeProcessamento = (fim - inicio);
        System.out.println("Tempo de processamento:" + tempoDeProcessamento + " milissegundos");
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
