package Task1_servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
@WebServlet(value = "/addPhones")
public class Task1_servlet_addPhones extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/JSP/task1/addPhone.jsp").forward(request, response);

    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Item phone=new Item();
        String name=request.getParameter("name");
        String price=request.getParameter("price");
        String amount=request.getParameter("amount");
        System.out.println(name);
        System.out.println(price);
        System.out.println(amount);
        if (!name.equals("")&&!price.equals("")&&!amount.equals("")) {
            System.out.println("1");
            phone.setName(name);
            phone.setPrice(Double.parseDouble(price));
            phone.setAmount(Integer.parseInt(amount));
            PhonesManager.addPhone(phone);
            request.setAttribute("phones", PhonesManager.getPhones());
            response.sendRedirect("/home");
        }
        else {
            response.sendRedirect("/addPhones");
        }
    }
}