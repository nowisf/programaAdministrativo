<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sesion equivocada</title>
</head>
<body>
	<h1>DATOS INCORRECTOS</h1>
	<form action="" method="post" action="servlet.java">
		<input type="text" name="usuario"> 
		<input type="password" name="contraseña"> 	
		<input name="idForm" type="hidden" value="loging">
		<input type="submit" value="crearUsuario" />
	</form>
</body>
</html>