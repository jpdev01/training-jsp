package servlet.security;

import config.files.AppUtils;
import model.User;
import model.Users;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Collection;

@WebServlet(name="excludeUser", value="/sec/user/exclude")
public class Exclude extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Users usersInstance = Users.getInstance();
        //Collection<User> users = usersInstance.getUsers();
        if (req.getParameter("id") != null){
            int id = Integer.valueOf(req.getParameter("id"));
            usersInstance.remove(id);
        }
        resp.sendRedirect(AppUtils.getInstance().getAppUrl() + "user/list");
    }
}
