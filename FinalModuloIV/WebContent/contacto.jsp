<!DOCTYPE html>
<html lang="es">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Contacto</title>
    <link rel="stylesheet" href="hojacssdeestilos.css" />
    <link rel="icon" type="image/png" href="ti.ico" />

    <link rel="stylesheet" href="http://code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
    <!--estilo del error de jquery validator-->
    <style>
        #nombre.error,
        #Paterno.error,
        #Materno.error,
        #mail.error,
        #mensaje.error,
        #tipo.error,
        textarea.error {
            border: 3px solid red;
        }
    </style>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://jqueryvalidation.org/files/dist/jquery.validate.js"></script>
    <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>

    <!--validador de campos a traves de jquery y date picker-->
    <script>
        $.validator.addMethod("valueNotEquals", function (value, element, arg) {
            return arg !== value;
        }, "Value must not equal arg.");
        $(document).ready(function () {
            $("#formulario").validate({

                rules:
                {
                    nombre: { required: true,  minlength: 1, maxlength: 149 },
                    Paterno: { required: true, },
                    Materno: { required: true },
                    mail: { required: true, minlength: 1, maxlength: 149 },
                    mensaje: { required: true, maxlength: 100 },
                    tipo: { required: true }
                   
                },

                messages:
                {
                    nombre: { required: '*El nombre es requerido', maxlength: 'Solo admite 149 caracteres' },
                    Paterno: { required: '*El apellido paterno es requerido' },
                    Materno: { required: '*El apellido materno es requerido' },
                    mail: { required: '*El email es requerido', maxlength: 'Solo admite 149 caracteres' },
                    mensaje: { required: '*El mensaje es requerido', maxlength: 'Solo admite 100 caracteres' },
                    tipo: { valueNotEquals: "Elija un cliente" }
                    
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

	<h1>Bienvenido <%= request.getParameter("login") %></h1>


    <div class="header">
        <h1>Plataforma de Registro</h1>
    </div>    
    <hr/>
    <!---Menu---->
    <div class="row col-3 col-s-3 menu">
        <h4>Menu de inicio:</h4>
        <ul>
            <li><a href="index.jsp" style="color:white;" title="Inicio">Inicio</a></li>
            <li><a href="foringreso" style="color:white;" title="Inicio">Ingreso</a></li>
            <li style="background-color: green;">Contacto</li>
            <li><a href="forCrearCapacitaciones" style="color:white;">Crear Capacitación</a></li>
            <li><a href="forCrearUsuario" style="color:white;">Crear Usuario</a></li>
            <li><a href="forListarCapacitaciones" style="color:white;">Listado de Capacitaciones</a></li>
            <li><a href="forListadoUsuario" style="color:white;">Listado usuario</a></li>
            <li><a href="forEditarCliente" style="color:white;">Editar Cliente</a></li>
            <li><a href="forEditarAdministrativo" style="color:white;">Editar Administrativo</a></li>
            <li><a href="forEditarProfesional" style="color:white;">Editar Profesional</a></li>
        </ul>
    </div>

    <!----Registro de usuarios formulario--->

    <div class="row col-6 col-s-6" id="tableRegistro">
        

        <form method="POST" name="formulario" id="formulario" action="guardarcontacto" >
            <h2>Contacto</h2>
            <table>

                <tr>

                    <td><label for="nombre">Nombre:</label></td>
                    <td><input type="text" name="nombre" id="nombre" placeholder="Escriba su nombre" /></td>
                </tr>

                <tr>
                    <td><label for="apaterno">Apellido Paterno:</label></td>
                    <td><input type="text" name="apaterno" id="apaterno" placeholder="Escriba su apellido Paterno" /></td>

                <tr>
                    <td><label for="amaterno">Apellido Materno:</label></td>
                    <td><input type="text" name="amaterno" id="amaterno" placeholder="Escriba su apellido Materno" /></td>
                </tr>

                <tr>
                    <td><label for="mail">Correo Electronico:</label></td>
                    <td><input type="email" name="mail" id="mail" placeholder="Escriba su correo electronico"
                            required /></td>
                </tr>

                <tr>
                    <td><label for="mensaje">Mensaje</label></td>
                    <td><textarea name="mensaje" id="mensaje" placeholder="Escriba su sugerencia acá"
                            maxlength="100"></textarea></td>
                </tr>

                <tr>
                    <td><label for="tipousu">Tipo de Usuario</label><br></td>
                    <td> <select name="tipousu" id="tipousu" >
                     		<option value="">-</option> 
                            <option value="1">Administrativo</option>
                            <option value="2">Cliente</option>
                            <option value="3">Profesional</option>
                        </select></td>
                </tr>

                <tr>
                    <td><input type="submit" id="btn" class="btn" value="Registrar usuario" /></td>
                </tr>
            </table>
        

   
</form>

		<div action="${pageContext.request.contextPath}/CerrarSesion" id="btnCerrarSesion" method="post">
		  <input type="submit" id="btnCerrarSesion" class="btn" value="Cerrar Sesion" />
	</div>

 </div>
</body>

</html>