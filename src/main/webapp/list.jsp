<%--
  Created by IntelliJ IDEA.
  User: jptru
  Date: 20/01/2021
  Time: 22:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Agenda</title>
</head>
<body>
<c:url var="novoContato" value="agenda-edit"></c:url>

<a href="${novoContato}">Adicionar novo contato</a>
<c:if test="${contato.id != null}">
    <input type="hidden" name="id" value="${contato.id}">
</c:if>
</body>
</html>
