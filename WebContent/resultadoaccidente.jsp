<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<table>
<thead>
<tr>
<th>Rut Cliente</th>
<th>Descripsion</th>
<th>Fecha accidente</th>
<th>Rut Cliente</th>
</tr>
</thead>

<tbody>
<c:forEach items="${list_acc}" var="Accidente">
<tr>
<td>${Accidente.clienterutcliente}</td>
<td>${Accidente.idaccidente}</td>
<td>${Accidente.descripcion}</td>
<td>${Accidente.fechaaccidente}</td>
<td>
	<a href="${pageContext.request.contextPath}/ServletEliminarAccidente?id=${Accidente.idaccidente}">eliminar</a>
</td>
<td>
	<a href="actualizar.html"> actualizar datos</a>
</td>
</tr>

</c:forEach>
</tbody>
</table>

</body>
</html>