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

@WebServlet(name="login", value="/user/login")
public class Login extends HttpServlet {
    Users usersInstance = Users.getInstance();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login = req.getParameter("login");
        String password = req.getParameter("password");

        boolean validate = validateLogin(login, password);

        if (validate == true){
            User user = getUser(login);
            req.setAttribute("userInfo", user);
            req.getRequestDispatcher(AppUtils.getInstance().getAppUrl()+"index.jsp").forward(req, resp);
        } else {
            req.setAttribute("validateAcess", false);
            req.getRequestDispatcher("/security/login.jsp").forward(req, resp);
        }

    }

    public boolean validateLogin(String login, String pass){

        for (User u : usersInstance.getUsers()){
            if (u.getLogin() == login && u.getPassword() == pass){
                return true;
            }
        }

        return false;
    }

    public User getUser(String login){

        for (User u : usersInstance.getUsers()){
            if (u.getLogin() == login){
                return u;
            }
        }
        return null;
    }
}
