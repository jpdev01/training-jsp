<%--
  Created by IntelliJ IDEA.
  User: jptru
  Date: 24/01/2021
  Time: 09:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Usuários</title>
</head>
<body>
<c:url var="newUser" value="<%= application.getInitParameter("ApplicationUrl")%>user/edit"></c:url>

<a href="newUser">Adicionar novo usuário</a>

<table width="100%" border="1">
    <tr>
        <td>Login</td>
        <td>Password</td>
        <td>Permissão</td>
        <td>Editar</td>
        <td>Excluir</td>
    </tr>
    <c:when test="${empty(users)}">
        <tr>
            <td colspan="5">Nenhum usuário cadastrado</td>
        </tr>
    </c:when>
    <c:otherwise>
        <c:forEach var="user" items="${users}">
            <c:url var="editarUser" value="<%=application.getInitParameter("ApplicationUrl")%>user/edit">
                <c:param name="id" value="${user.id}"></c:param>
            </c:url>
            <c:url var="excludeUser" value="<%=application.getInitParameter("ApplicationUrl")%>user/exlude"></c:url>
            <tr>
                <td>${user.login}</td>
                <td>${user.login}</td>
                <td>${user.password}</td>
                <td>${editarUser}</td>
                <td>${excludeUser}</td>
            </tr>
        </c:forEach>
    </c:otherwise>
</table>
</body>
</html>
