<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Editar Administrativo</title>
<link rel="icon" type="image/png" href="ti.ico" />
<link rel="stylesheet" href="hojacssdeestilos.css" />

   <link rel="stylesheet" href="http://code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
    <!--estilo del error de jquery validator-->
    <style>
    
    	#run.error,
        #nombre.error,
        #apellido.error,
        #fechanacimiento.error,
        #mail.error,
        #area.error,
         textarea.error {
            border: 3px solid red;
          
        }
    </style>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://jqueryvalidation.org/files/dist/jquery.validate.js"></script>
    <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>

<!--Funcion: que agrega el nuevo asistente dentro de la tabla y valida los datos-->
 <script>
        $.validator.addMethod("valueNotEquals", function (value, element, arg) {
            return arg !== value;
        }, "Value must not equal arg.");
        $(document).ready(function () {
            $("#formulario").validate({

            	
          	
            	
                rules:
                {
                    run: { required:true, digits: true},
                    nombre: { required: true,  minlength: 1, maxlength: 50 },
                    apellido: { required: true, minlength: 1, maxlength: 50},
                    fechanacimiento: { required: true },
                    mail: { required: true, minlength: 1, maxlength: 50 },
                    area: { required: true, minlength: 1, maxlength: 30 }

                   
                },

                messages:
                {
					run: { required:'*El run es requerido', digits:'Solo ingrese números'},
                    nombre: { required: '*El nombre es requerido', maxlength: 'Solo admite 50 caracteres' },
                    apellido: { required: '*El apellido es requerido', maxlength: 'Solo admite 50 caracteres' },
                    fechanacimiento: { required: 'La fecha es requerida' },
                    mail: { required: '*El email es requerido', maxlength: 'Solo admite 50 caracteres' },
                    area: { required: '*El área es requerida', maxlength: 'Solo admite 30 caracteres' }

                    
                },

            });

             });
        $(function () {
            $("#btn").on("click", function () {
                if ($('#formulario').valid()) {
                    alert("Registro Valido");


                }

            });
        });
    </script>
</head>
<body>
	<div class="header">
		<h1>Plataforma de Edicion de Usuarios.</h1>
	</div>
	<hr />
	<!---Menu---->
	<div class="row col-3 col-s-3 menu">
		<h4>Menu de inicio:</h4>
		<ul>
			<li><a href="inicio" style="color: white;" title="Inicio">Inicio</a></li>
			<li><a href="foringreso" style="color: white;" title="Inicio">Ingreso</a></li>
			<li><a href="forContacto" style="color: white;">Contacto</a></li>
			<li><a href="forCrearCapacitaciones" style="color: white;">Crear Capacitación</a></li>
			<li><a href="forElegirUsuario" style="color: white;">Crear Usuario</a></li>
			<li><a href="forListarCapacitaciones" style="color: white;">Listado de Capacitaciones</a></li>
			<li><a href="ListadoUsuario" style="color: white;">Listado usuario</a></li>
			<li><a href="forEditarCliente" style="color: white;">Editar Cliente</a></li>
			<li style="background-color: green;">Editar Administrativo</li>
			<li><a href="forEditarProfesional" style="color: white;">Editar Profesional</a></li>

		</ul>
	</div>
	<!--formulario crear capacitacion-->

	<div class="col-9 col-s-9" id="tableRegistro">

		<form name="formulario" id="formulario" action="forValidarCrearUsuario" >
	

			<table>
 				<tr>
					<th><label for="run">Run</label></th>
					<td><input type="text" placeholder="Run" name="run" id="run">
					</td>
				</tr>  
				
				<tr>
					<th><label for="nombre">Nombre</label></th>
					<td><input type="text" name="nombre" id="nombre" placeholder="Escriba su nombre" /></td>
				</tr>
				<tr>
					<th><label for="apellido">Apellido</label></th>
					<td><input type="text" name="apellido" id="apellido" placeholder="Escriba su apellido"></td>
				</tr>
					<tr>
					<th><label for="fechanacimiento">Fecha de nacimiento</label></th>
					<td><input type="text" name="fechanacimiento" id="fechanacimiento" placeholder="Escriba su fecha de nacimiento"></td>
				</tr>
				<tr>
					<th><label for="mail">Correo Electronico</label></th>
					<td><input type="email" name="mail" id="mail" placeholder="Escriba su email"></td>
						
				</tr>
				<tr>
					<th><label for="area">Área</label></th>
					<td><input type="text" name="area" id="area" placeholder="Ingrese área"></td>
				</tr>

			</table>
			<br> 
 			<input type="hidden" name="hdnidcliente" id="hdnidcliente"	value="1" />  
 			<input type="hidden" name="accion" id="accion" value="E" />
            <input type="button" id="btn" class="btn" value="Editar" />
			<input type="reset" value="Limpiar Formulario" />

		</form>
	</div>


</body>
</html>