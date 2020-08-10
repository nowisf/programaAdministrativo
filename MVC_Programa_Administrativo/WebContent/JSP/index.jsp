<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

    <%@ page import='java.util.Date' %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Facturas</title>
</head>
<body>
	<p>La hora del servidor es <%= new Date() %></p>
	
	<% for (int i=0; i<10; i++ ){%>
	
		<p>hola</p>
		<div>${username}</div>
		
		<%} %>

	
</body>
</html>