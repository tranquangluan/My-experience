<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 12/04/2023
  Time: 7:01 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form:form action="/program" method="post" modelAttribute="email">
    <h1>Settings</h1>
    <span>Languages</span>
    <form:select path="language">
        <form:options items="${language}"></form:options>
    </form:select>
    <br>
    <span>Page size:  Show</span>
    <form:select path="size">
        <form:options items="${size}"></form:options>
    </form:select>
    <span>emails per page</span>
    <br>
    Spams filter:   <form:checkbox path="filter"></form:checkbox>  Enable spams filter
    <br>
    Signature:  <form:textarea path="signature"></form:textarea>
    <br>
    <input type="submit" value="Update">
    <input type="submit" value="Cancel">
</form:form>
</body>
</html>
