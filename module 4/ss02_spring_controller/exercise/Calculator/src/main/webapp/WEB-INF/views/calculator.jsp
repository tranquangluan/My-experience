<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 10/04/2023
  Time: 8:52 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post">
    <h1>Calculator</h1>
    <input type="text" name="element1" value="${param.element1}">
    <input type="text" name="element2" value="${param.element2}">
    <button type="submit" name="calculate" value="add">Addition(+)</button>
    <button type="submit" name="calculate" value="sub">Subtraction(-)</button>
    <button type="submit" name="calculate" value="mul">Multiplication(X)</button>
    <button type="submit" name="calculate" value="div">Division(/)</button>

</form>

<h1>Kết quả là : ${result}</h1>
</body>
</html>
