<%@ page import="javax.swing.*" %>
<%@ page import="kz.bitlab.servlets.Task1.User" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: danov
  Date: 15.11.2022
  Time: 15:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/task6" method="get">
FULL NAME:
<input type="text" name="userName"><br>
EXAM POINTS:
<input type="number" name="userPoints"><br>
<button>Submit Exam</button>
    <%
        String name = request.getParameter("userName");
        String markText = request.getParameter("userPoints");

        if (name!=null && markText!=null){
            int mar=Integer.parseInt(markText);
            out.print(name+" ");
            out.print(mar+" ");
            if (mar>=90){
                    out.print("'A' for EXAM");
            } else if (mar>=75){
                out.print("'B' for EXAM");
            } else if (mar>=60){
                out.print("'C' for EXAM");
            } else if (mar>=50){
                out.print("'D' for EXAM");
            } else {
                out.print("'F' for EXAM");
            }
        }
    %>
</form>
</body>
</html>
