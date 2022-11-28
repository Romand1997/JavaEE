package kz.bitlab.servlets.Task6;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import kz.bitlab.servlets.Task1.DBManager;
import kz.bitlab.servlets.Task1.User;

import java.io.IOException;
import java.io.PrintWriter;
@WebServlet(value="/task6")
public class Task6 extends HttpServlet{

    public void doGet (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/JSP/task6.jsp").forward(request,response);
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

    }
    public void doPost (HttpServletRequest request, HttpServletResponse response) throws IOException {
    }
}
