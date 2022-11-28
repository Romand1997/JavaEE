<%@ page import="java.util.ArrayList" %>
<%@ page import="Task3_servlets.News" %><%--
  Created by IntelliJ IDEA.
  User: danov
  Date: 18.11.2022
  Time: 11:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

    <title>Home</title>
</head>
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
<body>
<%@include file="NavBarTask3.jsp"%>
<% ArrayList<News> newNews =(ArrayList<News>) request.getAttribute("news");
for (News n: newNews){
%>
<div class="container">
    <div class="card text-bg-light mb-3" style="max-width: 100rem;">
        <div class="card-header"><%=n.getTitle()%>></div>
        <div class="card-body">
            <p class="card-text"><%=n.getContent()%></p>
        </div>
    </div>
</div>
<%
}
%>
<%@include file="footer_task3.jsp"%>

</body>
</html>
