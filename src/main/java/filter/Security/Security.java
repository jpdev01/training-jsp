package filter.Security;
import javax.servlet.*;
import java.io.IOException;

public class Security implements Filter{
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        chain.doFilter(req, resp);
    }

    @Override
    public void destroy() {

    }
}
