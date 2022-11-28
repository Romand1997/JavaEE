<%@ page import="Task1_servlets.PhonesManager" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="Task1_servlets.Item" %><%--
  Created by IntelliJ IDEA.
  User: danov
  Date: 17.11.2022
  Time: 12:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
<body>
   <%@include file="navBar.jsp"%>
    <table class="table table-dark table-striped">
    <thead>
    <tr class="table-active">

        <th>ID</th>
        <th>NAME</th>
        <th>PRICE</th>
        <th>AMOUNT</th>
        <th>DETAILS</th>
    </tr>
    </thead>
    <tbody>
    <% ArrayList<Item> phones=(ArrayList<Item>) request.getAttribute("phones");
        for (Item phone :phones) {
    %>
    <tr >
        <td><%=phone.getId()%></td>
        <td><%=phone.getName()%></td>
        <td><%=phone.getPrice()%></td>
        <td><%=phone.getAmount()%></td>
        <td><a href="detail?id=<%=phone.getId()%>">DETAILS</a></td>
    </tr >
    <%
        }
    %>
    </tbody>
    </table>
</body>
</html>

