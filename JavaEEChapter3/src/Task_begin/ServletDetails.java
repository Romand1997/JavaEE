package Task_begin;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "ServletDetails", value = "/ServletDetails")
public class ServletDetails extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        request.setAttribute("task", TaskManager.getTaskById(Long.parseLong(request.getParameter("id"))));
        request.getRequestDispatcher("JSP/taskZero/Details.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Task task= new Task();
        task.setName(request.getParameter("name"));
        task.setDescription(request.getParameter("context"));
        task.setDeadlineDate(request.getParameter("date"));
        task.setPerformance(request.getParameter("perfomance"));
        TaskManager.addTask(task);
        response.sendRedirect("/home4");
    }
}
