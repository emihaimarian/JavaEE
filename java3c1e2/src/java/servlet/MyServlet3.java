package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "MyServlet3", urlPatterns = {"/MyServlet3"})
public class MyServlet3 extends HttpServlet {

     @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String nr1 = request.getParameter("x");
        String nr2 = request.getParameter("y");
        
        try (PrintWriter out = response.getWriter()) {
            int x = Integer.parseInt(nr1);
            int y = Integer.parseInt(nr2);
            out.println("<h1>Suma: " + (x + y) + "</h1>");
        } catch(Exception e){
            out.println("Va rugam sa dati param corecti");
        }
    }
}
