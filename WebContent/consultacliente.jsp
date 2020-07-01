<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<c:out value="${mensaje}"></c:out>
<c:out value="${mensajeact}"></c:out>
	<h1>consulta Clientes</h1>
	<table>
		<thead>
			<tr>
				<th>Rut Profesional</th>
				<th>Nombre</th>
				<th>Direccion</th>
				<th>Telefono</th>
				<th>Correo</th>
				<th>Contacto</th>

			</tr>
		</thead>

		<tbody>
			<c:forEach items="${list_cli}" var="Cliente">
				<tr>
					<td>${Cliente.rutcliente}</td>
					<td>${Cliente.nombrecliente}</td>
					<td>${Cliente.direccion}</td>
					<td>${Cliente.telefono}</td>
					<td>${Cliente.correo}</td>
					<td>${Cliente.contacto}</td>
					<td><a
						href="${pageContext.request.contextPath}/ServletEliminarCliente?rutcliente=${Cliente.rutcliente}">eliminar</a></td>
					<td><a href="actualizarcliente.jsp"> actualizar</a></td>

				</tr>
			</c:forEach>

		</tbody>
	</table>

	<form action="ServletConsultaCliente" method="get">
		<input type="submit" name="consultarcli" value="consultar">
	</form>
	
	<a href="ingresocliente.jsp">ir a ingreso cliente</a>
</body>
</html>