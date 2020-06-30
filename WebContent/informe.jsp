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

	<h1>Informes de gestion</h1>
	<h2>informe de gestion profesional</h2>

	<table>
		<thead>
			<tr>
				<th>Profesional</th>
				<th>Numero de cliente</th>
				<th>Numero de actividades</th>
				<th>Valor total</th>
				<th>Monto total pagado</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="table" items="${informe_prof}">
				<tr>

					<td>${table.profesional}</td>
					<td>${table.ncliente}</td>
					<td>${table.nactividades}</td>
					<td>${table.valortotal}</td>
					<td>${table.totalpagado}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

	<form action="ServletInformeProfesional" method="get">
		<input type="submit" name="inf_profesional" value="crear informe">
	</form>


	<h2>Informe clientes</h2>

	<table>
		<thead>
			<tr>
				<th>Cliente</th>
				<th>Numero actividades</th>
				<th>Valor actividades</th>
				<th>Total pagado</th>
				<th>total accidentes</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="lista" items="${informe_cli}">
				<tr>
					<td>${lista.nombrecliente}</td>
					<td>${lista.numeroactividades}</td>
					<td>${lista.valortotal}</td>
					<td>${lista.valorpagado}</td>
					<td>${lista.naccidentes}</td>
				</tr>

			</c:forEach>
		</tbody>
	</table>
	<form action="ServletInformeCliente" method="get">
		<input type="submit" name="inf_profesional" value="crear informe">
	</form>
</body>
</html>