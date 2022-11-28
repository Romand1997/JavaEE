package Task1_servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
@WebServlet(value = "/detail")
public class DetailPhone extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setAttribute("phone", PhonesManager.getPhoneById(Long.parseLong(request.getParameter("id"))));
        request.getRequestDispatcher("/JSP/task1/detailPhone.jsp").forward(request, response);
    }
}