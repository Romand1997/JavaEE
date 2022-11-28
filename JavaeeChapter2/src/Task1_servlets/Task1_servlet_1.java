package Task1_servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
@WebServlet(value = "/home")
public class Task1_servlet_1 extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("phones", PhonesManager.getPhones());
        request.getRequestDispatcher("/JSP/task1/task1.jsp").forward(request, response);
    }
}
