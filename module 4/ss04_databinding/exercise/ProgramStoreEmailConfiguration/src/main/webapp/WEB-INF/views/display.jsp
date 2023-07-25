<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 12/04/2023
  Time: 7:27 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <tr>
        <td>Languages:${email.language}</td>
    </tr>
    <tr>
        <td>Page Size:${email.size} email per page</td>
    </tr>
    <tr>
        <td>Spams filter: ${email.filter} Enable spams filter</td>
    </tr>
    <tr>
        <td>Signature: ${email.signature}</td>
    </tr>
</table>

</body>
</html>
