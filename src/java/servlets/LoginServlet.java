package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import models.User;
import services.AccountService;

/**
 *
 * @author Keith
 */
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession session = request.getSession();
        
        String logout = request.getParameter("logout");
        
        if (logout != null) {
            session.invalidate();
            request.setAttribute("message", "You have successfully logged out.");
        } else {
            if (session.getAttribute("username") != null) {
                response.sendRedirect("home");
                return;
            }
        }
        
        getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                
        HttpSession session = request.getSession();
        
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        
        User user;
        
        if (username != null && password != null) {
            AccountService account = new AccountService();
            user = account.login(username, password);
            
            if (user != null) {
                session.setAttribute("username", username);
                response.sendRedirect("home");
                return;
            }
        }
        
        request.setAttribute("username", username);
        request.setAttribute("message", "Invalid username and/or password.");
        
        getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
        return;
    }
}
