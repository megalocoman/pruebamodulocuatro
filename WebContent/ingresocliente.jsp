<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Ingreso datos cliente</h1>

<form action="ServletIngresoCliente" method="post">
		Rut cliente: <input type="text" name="rut_cliente" id="rut_cliente"> <br>
		Nombre cliente: <input type="text" name="nom_cliente" id="nom_cliente"><br> 
		Direccion: <input type="text" name="direccion_cliente" id="direccion_cliente"><br> 
		Telefono: <input type="text" name="fono_cliente" id="fono_cliente"><br> 
		Correo: <input type="text" name="correo_cliente" id="correo_cliente"><br>
		contacto: <input type="text" name="contacto_cliente" id="contacto_cliente"><br>
		
		<input type="submit" name="ing_incidente" value="ingresar">
	</form>

</body>
</html>