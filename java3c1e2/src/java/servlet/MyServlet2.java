package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "MyServlet2", urlPatterns = {"/MyServlet2"})
public class MyServlet2 extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try (PrintWriter out = response.getWriter()) {
            String nume = request.getParameter("nume");
            
            if (nume != null){
                out.println("Hello, " + nume);
            }else {
                out.println("Va rugam sa dati un nume (nume = Goe)");
            }
        }
    }
}