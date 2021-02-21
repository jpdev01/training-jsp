package listeners;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

// Avisa ao contâiner que é uma classe listener
@WebListener
public class Requests implements ServletRequestListener {
    @Override
    public void requestDestroyed(ServletRequestEvent e) {
        System.out.println("Requisição: destruída!");
    }

    @Override
    public void requestInitialized(ServletRequestEvent e) {
        System.out.println("Requisição: inicializada! " +  e.getServletRequest().getServerName() + ":" + e.getServletRequest().getLocalPort());
    }
}
