package Task_begin;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
//import static Task_begin.TaskManager.tasks;

@WebServlet(name = "Servlet_task4", value = "/home4")
public class Servlet_task4 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setAttribute("tasks", TaskManager.getAllTasks());
        request.getRequestDispatcher("/JSP/taskZero/task4_mainPage.jsp").forward(request, response);
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
//            tasks.set(tasks.indexOf(TaskManager.getTaskById(Long.parseLong(request.getParameter("idid")))), task);
            request.setAttribute("tasks", TaskManager.getAllTasks());
            request.getRequestDispatcher("/JSP/taskZero/task4_mainPage.jsp").forward(request, response);
        } else{
//            request.setAttribute("tasks", TaskManager.deleteTask(Long.parseLong(request.getParameter("idid"))));
            request.getRequestDispatcher("/JSP/taskZero/task4_mainPage.jsp").forward(request, response);
        }
    }
}
