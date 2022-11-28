<%@ page import="Task1_servlets.Item" %><%--
  Created by IntelliJ IDEA.
  User: danov
  Date: 17.11.2022
  Time: 17:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">

<body>
<%@include file="navBar.jsp"%>
<%
    Item phone =(Item) request.getAttribute("phone");
%>
<h2><%="ID---"+phone.getId()+"NAME ---"+
phone.getName()+"PRICE---"+
phone.getPrice()+"AMOUNT---"+
phone.getAmount()%></h2>
</body>
</html>
