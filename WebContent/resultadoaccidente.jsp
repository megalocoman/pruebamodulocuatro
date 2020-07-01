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

<c:out value="mensajeeli"></c:out>
<c:out value="${mensajeact}"></c:out>

<table>
<thead>
<tr>
<th>Nombre Cliente</th>
<th>Descripsion</th>
<th>Fecha accidente</th>
</tr>
</thead>

<tbody>
<c:forEach items="${list_acc}" var="Accidente">
<tr>
<td>${Accidente.nombrecliente}</td>
<td>${Accidente.descripsion}</td>
<td>${Accidente.fechaacc}</td>
<td>
	<a href="${pageContext.request.contextPath}/ServletEliminarAccidente?id=${Accidente.id}">eliminar</a>
</td>
<td>
	<a href="actualizar.html"> actualizar datos</a>
</td>
</tr>

</c:forEach>
</tbody>
</table>

<form action="ServletConsultaAccidente" method="get">
<input type="submit" name="consultaracc" value="consultar">
</form>

<a href="ingreso.jsp">Ir a ingreso accidentes</a>

</body>
</html>