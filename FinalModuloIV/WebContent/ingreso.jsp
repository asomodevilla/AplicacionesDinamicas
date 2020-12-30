<!DOCTYPE html>
<html lang="es">

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>Ingreso de usuarios</title>
<link rel="stylesheet" href="hojacssdeestilos.css" />
    <script language=JavaScript>
        function go() {
            if (document.form.password.value == '1234' && document.form.login.value == 'admin') {
                document.form.submit();
            }
            else {
                alert("Por favor ingrese, nombre de usuario y contraseña correctos.");
            }
        } 
    </script>
       
</head>

<body>
    <div class="header">
        <h1>Plataforma de Registro</h1>
    </div>    
    <hr/>
    <!---Menu---->
    <div class="row col-3 col-s-3 menu">
        <h4>Menu de inicio:</h4>
        <ul>
            <li><a href="index.jsp" style="color:white;" title="Inicio">Inicio</a></li>
            <li><a href="forContacto" style="color:white;" title="Inicio">Contacto</a></li>
            <li style="background-color: green;">Ingreso</li>
            <li><a href="forCrearCapacitaciones" style="color:white;">Crear Capacitación</a></li>
            <li><a href="forCrearUsuario" style="color:white;">Crear Usuario</a></li>
            <li><a href="forListarCapacitaciones" style="color:white;">Listado de Capacitaciones</a></li>
            <li><a href="ListadoUsuario" style="color:white;">Listado usuario</a></li>
            <li><a href="forEditarCliente" style="color:white;">Editar Cliente</a></li>
            <li><a href="forEditarAdministrativo" style="color:white;">Editar Administrativo</a></li>
            <li><a href="forEditarProfesional" style="color:white;">Editar Profesional</a></li>
        </ul>
    </div>

    <div class="col-6 col-s-6 row">
<br><br><br>


        <form name=form method="post" action="validaingreso">
<h2>Ingreso</h2>
            <P>Usuario: <br> <INPUT type=text name=login id=login>
            <P>Contraseña: <br> <INPUT type=password name=password id=password>
                <br><br>
                <INPUT class="btn" type="submit" value=Ingresar name=boton id=boton>
  
   		 </form>
	</div>
	

</body>

</html>