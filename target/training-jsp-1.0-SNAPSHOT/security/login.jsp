<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="config.files.AppUtils" %>
<%@ page import="model.Users" %>
<%@ page import="model.User" %><%--
  Created by IntelliJ IDEA.
  User: jptru
  Date: 30/01/2021
  Time: 18:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<%
    request.setAttribute("userInfo", null);
    session.setAttribute("userInfo", null);
%>
<form action="<%= AppUtils.getInstance().getAppUrl()%>user/login" method="post">
    <tr>
        <td>Usuário:</td>
        <td><input type="text" name="login"></td>
    </tr>
    <tr>
        <td>Password:</td>
        <td><input type="password" name="password"></td>
    </tr>
    <tr>
        <td><button type="submit">OK</button></td>
    </tr>
</form>
<c:if test="${validateAcess != null && validateAcess == false}">
    <p>Acesso negado!</p>
</c:if>
</body>
</html>
