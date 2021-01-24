<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<br/>
<a href="hello-servlet">Hello Servlet</a>
<a href="agenda-edit">Novo contato</a>
<a href="agenda-list">Lista de contatos</a>
<a href="exception-test">Testar página de erro</a>
<c:if test="${message != null}">
    <h4>Mensagem: ${message}</h4>
</c:if>
</body>
</html>