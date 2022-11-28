<%--
  Created by IntelliJ IDEA.
  User: danov
  Date: 23.11.2022
  Time: 13:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Bootstrap</title>
    <!-- CSS only -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css"
        rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi"
        crossorigin="anonymous">
    <!-- JavaScript Bundle with Popper -->
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3"
        crossorigin="anonymous"></script>
</head>
<body>
<div class="container">
    <label for="basic-url">Your vanity URL</label>
    <div class="input-group mb-3">
        <div class="input-group-prepend">
            <span class="input-group-text" id="basic-addon3">https://example.com/users/</span>
        </div>
        <input type="text" class="form-control" id="basic-url" aria-describedby="basic-addon3">
    </div>

    <div class="input-group mb-3">
        <input type="text" class="form-control" placeholder="Имя получателя" aria-label="Имя получателя" aria-describedby="basic-addon2">

            <span class="input-group-text" id="basic-addon2">@example.com</span>

    </div>


    <div class="input-group input-group-sm mb-3">

            <span class="input-group-text" id="inputGroup-sizing-sm">Small</span>

        <input type="text" class="form-control" aria-label="Small" aria-describedby="inputGroup-sizing-sm">
    </div>

    <div class="input-group mb-3">

            <span class="input-group-text" id="inputGroup-sizing-default">Default</span>

        <input type="text" class="form-control" aria-label="Default" aria-describedby="inputGroup-sizing-default">
    </div>

    <div class="input-group input-group-lg">

            <span class="input-group-text" id="inputGroup-sizing-lg">Large</span>

        <input type="text" class="form-control" aria-label="Large" aria-describedby="inputGroup-sizing-sm">
    </div>
</div>
</body>
</html>
