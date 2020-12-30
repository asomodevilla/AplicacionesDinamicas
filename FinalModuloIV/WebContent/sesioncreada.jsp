<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Día 4 - Ejemplo sesion</title>
</head>
<body>
	<h4>La sesión ha sido creada exitosamente</h4>
	<br/>
	<p>El valor es: <c:out value="${datonombre}"></c:out></p>
	<a href="<%= request.getContextPath() %>/RevisarSesion">Revisar sesión</a>
</body>
</html>