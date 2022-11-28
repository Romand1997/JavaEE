package kz.bitlab.servlets.Task1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(value="/home")
public class HomeServlet extends HttpServlet  {
    public void doGet (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

         request.setAttribute("people", DBManager.getUsers());
        request.getRequestDispatcher("/JSP/task1.jsp").forward(request,response);

    }
}
