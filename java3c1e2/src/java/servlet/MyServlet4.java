package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "MyServlet4", urlPatterns = {"/MyServlet4"})
public class MyServlet4 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try(PrintWriter out = response.getWriter()){
            out.println("<html>");
                out.println("<head>");
                out.println("</head>");
                
                out.println("<body>");
                    out.println("<form method=post>");
                        out.println("Nume: <input type=text name=nume />");
                        out.println("<input type=submit value=Salut />");
                    out.println("</form>");
                out.println("</body>");
            out.println("</html>");
        }
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    
        String nume = request.getParameter("nume");
        try(PrintWriter out = response.getWriter()){
            out.println("<h1>Hello, " + nume + " !</h1>");
        }
    }
}