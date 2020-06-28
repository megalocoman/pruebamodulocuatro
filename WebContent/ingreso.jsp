<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Ingreso accidente cliente</h1>

	<form action="ServletAccidentes" method="post">
		Cliente: <input type="text" name="cliente" id="cliente"> <br>
		Descripsion: <input type="text" name="des_incidente" id="des_incidente"><br> 
		fecha: <input type="date" name="fecha_inc" id="fecha_inc"><br> 
		<input type="submit" name="ing_incidente" value="ingresar">
	</form>
	
	<a href="${pageContext.request.contextPath}/ServletConsultaAccidente">Ir a lista de accidentes</a>

</body>
</html>