package kz.bitlab.servlets.Task1;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
@WebServlet(value="/new")
public class NewServlet extends HttpServlet{

    public void doGet (HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String fullName= request.getParameter("userName");
        int age=Integer.parseInt(request.getParameter("userAge"));
        String pol= request.getParameter("userMale");
        if (age>=18){
            if(pol.equals("men")){
                out.println("Hello Dear Mister "+fullName+"!");
            } else {
                out.println("Hello Dear Miss "+fullName+"!");
            }
        } else {
            if(pol.equals("men")){
                out.println("Hello Dude Mister "+fullName+"!");
            } else {
                out.println("Hello Dude Miss "+fullName+"!");
            }
        }
    }
    public void doPost (HttpServletRequest request, HttpServletResponse response) throws IOException {
        User user= new User();
        user.setName(request.getParameter("userName"));
        user.setSurName(request.getParameter("userSurname"));
        user.setDepartament(request.getParameter("userDepartament"));
        user.setSalary(Integer.parseInt(request.getParameter("userSalary")));
        DBManager.addUser(user);
        response.sendRedirect("/");
    }
}
