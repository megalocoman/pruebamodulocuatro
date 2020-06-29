<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>actualizar datos </h1>
<h2>actualizar cliente</h2>
<form action="ServletActualizarCliente" method="get">
RUT : <input type="text" name="rut_cli" id="rut_cli"> <br>
Nombre: <input type="text" name="nombre_cli" id="nombre_cli"> <br>
Direccion: <input type="text" name="direccion_cli" id="direccion_cli"><br>
Telefono: <input type="text" name="telefono_cli" id="telefono_cli"><br> 
Correo: <input type="text" name="correo_cli" id="correo_cli"><br> 
Contacto: <input type="text" name="contacto_cli" id="contacto_cli"><br> 
<input type="submit" name="actualizar" value="Actualizar">
</form>

</body>
</html>