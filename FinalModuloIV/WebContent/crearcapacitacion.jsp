<!DOCTYPE html>
<html lang="es">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Sistema de Información</title>
    <link rel="icon" type="image/png"
        href="C:\Users\juani\Documents\JAVA desarrollo web\modulo 3 desarrollo web\Clase 1\Ejercicio grupal 1\ti.ico" />
    <link rel="stylesheet" href="hojacssdeestilos.css" />
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
            <li style="background-color: green;">Crear Capacitación</li>
            <li><a href="forCrearUsuario" style="color:white;">Crear Usuario</a></li>
            <li><a href="forListarCapacitaciones" style="color:white;">Listado de Capacitaciones</a></li>
            <li><a href="ListadoUsuario" style="color:white;">Listado usuario</a></li>
            <li><a href="forEditarCliente" style="color:white;">Editar Cliente</a></li>
            <li><a href="forEditarAdministrativo" style="color:white;">Editar Administrativo</a></li>
            <li><a href="forEditarProfesional" style="color:white;">Editar Profesional</a></li>
            </ul>

        </div>

    <!--formulario crear capacitacion-->
    
    <div class="col-6 col-s-6" id="tableRegistro">
        
       
            <h2>Crear Capacitación</h2>
         


	<form method="POST" action="GuardarCliente">
	
	<table>
	
	<tr>
		<td>ID: </td>
		<td><input type="text" name="txtidcapacitacion" id="txtidcapacitacion" /><br/></td></tr>
		<tr><td>Fecha: </td>
		<td><input type="text" name="txtfecha" id="txtfecha" /><br/></td></tr>
		<tr><td>Hora: </td>
		<td><input type="text" name="txthora" id="txthora" /><br/></td></tr>
		<tr><td>Duración: </td>
		<td><input type="text" name="txtduracion" id="txtduracion" /><br/></td></tr>
		<tr><td>Lugar: </td>
		<td><input type="text" name="txtlugar" id="txtlugar" /><br/></td></tr>
	</table>
	
		<input type="submit" name="btnguardar" id="btnguardar" class="btn" value="Guardar" />	

    </div> 

</form>

</body>

</html>