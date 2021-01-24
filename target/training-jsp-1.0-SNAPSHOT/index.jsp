<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Training jsp</title>
</head>
<body>
<h1><%= "Bora!!!"%>
</h1>
<br/>
<a href="hello-servlet">Hello Servlet</a>
<br>
<a href="agenda-edit">Novo contato</a>
<br>
<a href="agenda-list">Lista de contatos</a>
<br>
<a href="exception-test">Testar página de erro</a>
<br>
<a href="filter-process">Iniciar processamento</a>
<c:if test="${message != null}">
    <h4>Mensagem: ${message}</h4>
</c:if>
</body>
</html>