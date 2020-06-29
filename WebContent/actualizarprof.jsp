<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>actualizar datos</h1>
<h2>actualizar accidentes</h2>
<form action="ServletActualizarProf" method="get">
Elija RUT del profesional que desee modificar: <input type="text" name="rut_prof" id="rut_prof"> <br>
Nombre: <input type="text" name="nombre" id="nombre"> <br>
Telefono: <input type="text" name="telefono" id="telefono"><br> 
Correo: <input type="text" name="correo" id="correo"><br> 
<input type="submit" name="actualizar" value="Actualizar">
</form>
</body>
</html>