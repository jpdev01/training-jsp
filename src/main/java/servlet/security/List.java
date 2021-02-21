package servlet.security;

import model.User;
import model.Users;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

@WebServlet(name="listUsers", value="/portal/sec/user/list")
public class List extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Users usersInstance = Users.getInstance();
        Collection<User> users = usersInstance.getUsers();

        req.setAttribute("users", users);

        req.getRequestDispatcher("/security/list.jsp").forward(req, resp);

    }
}
