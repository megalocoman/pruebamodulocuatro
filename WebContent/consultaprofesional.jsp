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
	<h1>consulta profesionales</h1>

	<table>
		<thead>
			<tr>
				<th>Rut Profesional</th>
				<th>Nombre</th>
				<th>Telefono</th>
				<th>Correo</th>
			</tr>
		</thead>

		<tbody>
			<c:forEach items="${list_prof}" var="Profesional">
				<tr>
					<td>${Profesional.rutprofesional}</td>
					<td>${Profesional.nombre}</td>
					<td>${Profesional.telefono}</td>
					<td>${Profesional.correo}</td>
					<td><a
						href="${pageContext.request.contextPath}/ServletEliminarProf?rutprofesional=${Profesional.rutprofesional}">eliminar</a>
					</td>
					<td>
					<a href="actualizarprof.jsp">actualizar</a>
					</td>
				</tr>
			</c:forEach>

		</tbody>
	</table>


	<form action="ServletConsProf" method="get">
		<input type="submit" name="consultarprof" value="consultar">
	</form>
</body>
</html>