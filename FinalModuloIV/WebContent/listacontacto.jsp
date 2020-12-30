<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Listado de Contacto</title>
    <link rel="icon" type="image/png" href="ti.ico" />
    <link rel="stylesheet" href="hojacssdeestilos.css"/>
</head>
<body>
    <div class="header">
        <h1>Plataforma de registro de Usuarios.</h1>
    </div>    
    <hr/>
    <!---Menu---->
    <div class="row col-3 col-s-3 menu">
        <h4>Menu de inicio:</h4>
        <ul>
            <li><a href="index.html" style="color:white;" title="Inicio">Inicio</a></li>
            <li><a href="contacto.jsp" style="color:white;">Contacto</a></li>
            <li><a href="administrarasistentes.jsp" style="color:white;" >Administrar Asistentes</a></li>
            <li><a href="crearcapacitacion.jsp" style="color:white;">Crear Capacitación</a></li>
            <li><a href="crearpago.jsp" style="color:white;">Crear Pago</a></li>
            <li><a href="crearusuario.jsp" style="color:white;">Crear Usuario</a></li>
            <li><a href="listarcapacitaciones.jsp" style="color:white;">Listado de Capacitaciones</a></li>
            <li><a href="listadoasesorias.jsp" style="color:white;">Listado Asesoria</a></li>
            <li><a href="listadopago.jsp" style="color:white;">Listado Pagos</a></li>
            <li style="background-color: green;">Listado Usuario</li>
            <li><a href="listadovisitas.jsp" style="color:white;">Listado Visitas</a></li>
            <li><a href="editarcliente.jsp" style="color:white;">Editar Cliente</a></li>
            <li><a href="editaradministrativo.jsp" style="color:white;">Editar Administrativo</a></li>
            <li><a href="editarprofesional.jsp" style="color:white;">Editar Profesional</a></li>
            <li><a href="responderchecklist.jsp" style="color:white;">Editar Lista de Capacitaciones</a></li>
            <li><a href="reportes.jsp" style="color:white;">Reportes</a></li>
        </ul>
    </div>

    <div class="row col-9 col-s-9">
<form>
<table border="1" >
    <tr>
        <th colspan="6">Lista de Contacto</th>
    </tr>
    <tr>
    
        <th> Nombre </th>
        <th> Apellido Paterno </th>
        <th> Apellido Materno </th>
        <th> Correo </th>
        <th> Mensaje </th>
        <th> Usuario </th>
    </tr>
     
 	<c:forEach items="${lcontacto}" var="con">		
	<tr>		<td><c:out value="${con.getNombre()}" /></td>
	
				<td><c:out value="${con.getApaterno()}" /></td>
				
				<td><c:out value="${con.getAmaterno()}" /></td>
				
				<td><c:out value="${con.getMail()}" /></td>
				
				<td><c:out value="${con.getMensaje()}" /></td>
				
				
				<c:choose>
			    <c:when test="${con.getTipousu()== 1}">
			    
    			<td>ADMINISTRATIVO</td>
    			
    			</c:when>
    			
    			<c:when test="${con.getTipousu()== 2}">
    			
    			<td>CLIENTE</td>
    			
    			</c:when>
    			
    			<c:when test="${con.getTipousu()== 3}">
    			
    			<td>PROFESIONAL</td>
    			
    			</c:when>
    			
				</c:choose>
				

    </tr>
	</c:forEach>
		
    
     

</table>
</form>

 
</div>

</body>
</html>