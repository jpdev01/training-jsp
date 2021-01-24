package servlet.filter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "processamento", value = "/filter-process")
public class Processamento extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String msg = null;
        try {
            Thread.sleep(2000);
            msg = "Processamento concluído";
        } catch (Exception e) {
            throw new ServletException("Exceção na aplicação de thread sleep");
        }
        req.setAttribute("message", msg);
        req.getRequestDispatcher("/index.jsp").forward(req, resp);
    }
}
