package Task4_servlets;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

import static Task4_servlets.TaskManager.tasks;

@WebServlet(name = "Servlet_task4", value = "/home4")
public class Servlet_task4 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("YES");
        request.setAttribute("tasks", TaskManager.getAllTasks());
        request.getRequestDispatcher("/JSP/task4/task4_mainPage.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (request.getParameter("action").equals("save")){
            Task task= new Task();
            task.setId(Long.parseLong(request.getParameter("idid")));
            task.setName(request.getParameter("name"));
            task.setDescription(request.getParameter("context"));
            task.setDeadlineDate(request.getParameter("date"));
            task.setPerformance(request.getParameter("perfomance"));
            tasks.set(tasks.indexOf(TaskManager.getTaskById(Long.parseLong(request.getParameter("idid")))), task);
            request.setAttribute("tasks", TaskManager.getAllTasks());
            request.getRequestDispatcher("/JSP/task4/task4_mainPage.jsp").forward(request, response);
        } else{
            request.setAttribute("tasks", TaskManager.deleteTask(Long.parseLong(request.getParameter("idid"))));
            request.getRequestDispatcher("/JSP/task4/task4_mainPage.jsp").forward(request, response);
        }
    }
}
