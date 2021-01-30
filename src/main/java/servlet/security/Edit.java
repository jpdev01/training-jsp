package servlet.security;

import model.User;
import model.Users;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name="editarUsuario", value="/user/edit")
public class Edit extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Integer id = (req.getParameter("id") != null) ? Integer.valueOf(req.getParameter("id")) : null;

        Users users = Users.getInstance();
        if (id != null){
            User user = users.load(id);
            req.setAttribute("user", user);
        }

        req.getRequestDispatcher("/security/edit.jsp").forward(req, resp);
    }
}
