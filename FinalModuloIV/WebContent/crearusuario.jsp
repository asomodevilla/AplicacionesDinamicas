<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Crear Usuario</title>
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
            <li><a href="inicio" style="color:white;" title="Inicio">Inicio</a></li>
            <li><a href="foringreso" style="color:white;" title="Inicio">Ingreso</a></li>
            <li><a href="forContacto" style="color:white;">Contacto</a></li>
            <li><a href="forCrearCapacitaciones" style="color:white;">Crear Capacitación</a></li>
            <li style="background-color: green;">Crear Usuario</li>
            <li><a href="forListarCapacitaciones.html" style="color:white;">Listado de Capacitaciones</a></li>
            <li><a href="ListadoUsuario" style="color:white;">Listado usuario</a></li>
            <li><a href="forEditarCliente" style="color:white;">Editar Cliente</a></li>
            <li><a href="forEditarAdministrativo" style="color:white;">Editar Administrativo</a></li>
            <li><a href="forEditarProfesional" style="color:white;">Editar Profesional</a></li>
            
        </ul>
    </div>

 <!--formulario crear capacitacion-->
    
 <div class="col-3 col-s-3" id="tableRegistro">
<br><br>
   <form method="post" action="forElegirUsuario">
    <h2>Crear Usuario</h2>
       <label for="tipo">Tipo de usuario</label> <br/>
        <p>
        <select name="tipo" id="tipo">
        	<option id="tipo" value="0">-</option>
            <option id="tipo" value="2">Cliente</option>
            <option id="tipo" value="3">Profesional</option>
            <option id="tipo" value="1">Administrativo</option>
        </select>
        </p>
         <input type="hidden" name="accion" id="accion" value="C" />
       <input type="submit" value="Seleccionar Usuario"/>
   </form>
</div>



</body>
</html>