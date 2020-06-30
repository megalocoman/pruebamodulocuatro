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

	

	<form action="ServletInformeProfesional" method="get">
		<input type="submit" name="inf_profesional" value="crear informe">
	</form>
	
	
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
	

</body>
</html>