<%--
  Created by IntelliJ IDEA.
  User: danov
  Date: 17.11.2022
  Time: 14:20
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
<form action="/addPhones" method="post">
    <label> Name</label>
    <input type="text" name="name" ><br>
    <label> Price</label>
    <input type="text" name="price" ><br>
    <label> Amount</label>
    <input type="text" name="amount" ><br>
    <button>ADD</button>
</form>

</body>
</html>
