<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" >
<title>Cliente</title>
</head>
<body>
  <form action="" method="post" action="servlet.java">
        <input name="idForm" type="hidden" value="interfacePagar">
        <input type="submit" value="Pagar" />
    </form>
    <form action="" method="post" action="servlet.java">
        <input name="idForm" type="hidden" value="solicitarAsesoria">
        <input type="submit" value="Solicitar Asesoria" />
    </form>
    <form action="" method="post" action="servlet.java">
        <input name="idForm" type="hidden" value="interfaceCambiarDatos">
        <input type="submit" value="Cambiar Datos" />
    </form>
    <form action="" method="post" action="servlet.java">
        <input name="idForm" type="hidden" value="interfaceReportarAccidentes">
        <input type="submit" value="Reportar Accidente" />
    </form>

</body>
</html>