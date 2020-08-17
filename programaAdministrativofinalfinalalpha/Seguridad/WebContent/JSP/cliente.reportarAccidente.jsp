<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" >
<title>Accidente</title>
</head>
<body>
<div>
<h1>reportar accidentes</h1>
</div>
<div>
<form action="" method="post" action="servlet.java">


  <label for="lname">Involucrados:</label><br>
  <input type="text"  name="involucrados"><br>
  <label for="fname">Ubicación:</label><br>
  <input type="text"  name="ubicacion"><br>
  <label for="lname">Actividad durante la que ocurrio el accidente:</label><br>
  <input type="text"  name="actividad"><br>
  <label for="lname">Descripcion del accidente::</label><br>
  
  <textarea placeholder="Ingrese su mensaje" name="descripcion"></textarea><br>
  <input name="idForm" type="hidden" value="enviarReporteAccidente">
  <input type="submit" value="Enviar"><br>

</form>
</div>
</body>
</html>