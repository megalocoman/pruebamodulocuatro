<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Ingreso datos profesionales</h1>
<form action="ServletIngresoProf" method="post">
		Rut profesional: <input type="text" name="rut_prof" id="rut_prof"> <br>
		Nombre profesional: <input type="text" name="nom_prof" id="nom_prof"><br> 
		Telefono: <input type="text" name="telefono" id="telefono"><br> 
		correo: <input type="text" name="correo" id="correo"><br> 
		<input type="submit" name="ing_prof" value="ingresar">
</form>

</body>
</html>