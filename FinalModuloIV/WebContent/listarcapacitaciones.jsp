<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="es">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Listado de Capacitaciones</title>
    <link rel="icon" type="image/png"
        href="C:\Users\juani\Documents\JAVA desarrollo web\modulo 3 desarrollo web\Clase 1\Ejercicio grupal 1\ti.ico" />
    <link rel="stylesheet" href="hojacssdeestilos.css" />
</head>

<body>
    <div class="header">
        <h1>Plataforma de registro de Usuarios.</h1>
    </div>
    <hr />
    <!---Menu---->
    <div class="row col-3 col-s-3 menu">
        <h4>Menu de inicio:</h4>
        <ul>
            <li><a href="index.jsp" style="color:white;" title="Inicio">Inicio</a></li>
            <li><a href="contacto.jsp" style="color:white;">Contacto</a></li>
            <li><a href="crearcapacitacion.jsp" style="color:white;">Crear Capacitación</a></li>
            <li><a href="crearpago.jsp" style="color:white;">Crear Pago</a></li>
            <li><a href="crearpago.jsp" style="color:white;">Crear Pago</a></li>
            <li style="color:white; background-color: green;">Listado de Capacitaciones</li>
            <li><a href="listadousuario.jsp" style="color:white;">Listado usuario</a></li>
            <li><a href="listadoasesorias.jsp" style="color:white;">Listado Asesoria</a></li>
            <li><a href="listadopago.jsp" style="color:white;">Listado Pagos</a></li>
            <li><a href="listadovisitas.jsp" style="color:white;">Listado Visitas</a></li>
            <li><a href="editarcliente.jsp" style="color:white;">Editar Cliente</a></li>
            <li><a href="editaradministrativo.jsp" style="color:white;">Editar Administrativo</a></li>
            <li><a href="editarprofesional.jsp" style="color:white;">Editar Profesional</a></li>
            <li><a href="responderchecklist.jsp" style="color:white;">Editar Lista de Capacitaciones</a></li>
            <li><a href="reportes.jsp" style="color:white;">Reportes</a></li>
            <li><a href="login.jsp" style="color:white;">Login de acceso</a></li>
            <li><a href="listadodeaccidentes.jsp" style="color:white;">Listado Accidentes</a></li>
            <li><a href="administrarasistentes.jsp" style="color:white;">Administrar Asistentes</a></li>
        </ul>
    </div>

    <div class="row col-9 col-s-9">

        <form>
            <h1>Listado de Capacitaciones</h1>

            <table border="1">
                <tr>
                    <th colspan="6">Capacitaciones</th>
                </tr>
                
               		<tr>
			<th>ID</th>
			<th>Fecha</th>
			<th>Hora</th>
			<th>Lugar</th>
			<th>Duración</th>
			<th>Rut Cliente</th>			
		</tr>
		<c:forEach items="${lcapacitaciones}" var="capa">
			<tr>
				<td><c:out value="${capa.getIdcapacitacion()}" /></td>
				<td><c:out value="${capa.getFecha()}" /></td>
				<td><c:out value="${capa.getHora()}" /></td>
				<td><c:out value="${capa.getLugar()}" /></td>
				<td><c:out value="${capa.getDuracion()}" /></td>
				<td><c:out value="${capa.getRutcliente()}" /></td>
			</tr>
		</c:forEach> 
                
                
</table>

        </form>
    </div>
</body>

</html>