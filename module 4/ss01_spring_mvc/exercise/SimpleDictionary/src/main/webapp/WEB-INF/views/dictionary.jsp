<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 09/04/2023
  Time: 1:39 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post">
    <div>
        <h1>Nhập vào từ cần dịch:</h1>
        <input type="text" name="word" value="${param.word}">
    </div>
    <input type="submit" value="translation">
    <h1>Kết quả là : ${result}</h1>
</form>
</body>
</html>
