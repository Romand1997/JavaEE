package Task3_servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(value="/home2")
public class Task3_servlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        PrintWriter out=response.getWriter();
            if (request.getParameter("category")==null||request.getParameter("category").equals("culturesportcinema")) {
                request.setAttribute("news", ManagerNews.getNews());
            } else {
                request.setAttribute("news", ManagerNews.getNewsByCategory(request.getParameter("category")));
            }
             request.getRequestDispatcher("/JSP/task3/task3.jsp").forward(request,response);
    }
}
