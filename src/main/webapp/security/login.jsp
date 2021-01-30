<%@ page import="config.files.AppUtils" %><%--
  Created by IntelliJ IDEA.
  User: jptru
  Date: 30/01/2021
  Time: 18:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ligin</title>
</head>
<body>
<form action="<%= AppUtils.getInstance().getAppUrl()%>user/login" method="post">
    <tr>
        <td>Usuário:</td>
        <td><input type="text" name="login"></td>
    </tr>
    <tr>
        <td>Password:</td>
        <td><input type="password" name="password"></td>
    </tr>
</form>
</body>
</html>
