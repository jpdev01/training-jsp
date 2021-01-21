
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Contatos</title>
</head>
<body>
<form action="Salvar" method="post">
    <c:if test="${contato.id != null}">
        <input type="hidden" name="id" value="${contato.id}">
    </c:if>
    <table>
        <tr>
            <td>Nome:</td>
            <td><input type="text" name="name" value="${contato.name}"></td>
        </tr>
    </table>
</form>
</body>
</html>
