<%@ page import="java.util.ArrayList" %>
<%@ page import="kz.bitlab.servlets.Task1.User" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="/new" method="post">
        Name:<input type="text" name="userName">
        Surame:<input type="text" name="userSurname">
        Departament:<input type="text" name="userDepartament">
        Salary:<input type="number" name="userSalary">
        <button>ADD USER</button>
    </form>
    <table cellpadding="20" border="1">
        <thead>
            <tr>
                <th>
                    Name
                </th>
                <th>
                    Surname
                </th>
                <th>
                    Departament
                </th>
                <th>
                    Salary
                </th>
            </tr>
        </thead>
        <tbody>
        <% ArrayList<User> users=(ArrayList<User>)request.getAttribute("people");
            if (users!=null){
                for (User us : users) {
        %>
        <tr>
            <td>
                <%=us.getName()%>
            </td>
            <td>
                <%=us.getSurName()%>
            </td>
            <td>
                <%=us.getDepartament()%>
            </td>
            <td>
                <%=us.getSalary()%>
            </td>
        </tr>
        <%
            }
        }
        %>

        </tbody>
    </table>
</body>
</html>
