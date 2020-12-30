<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Crear Profesional</title>
    <link rel="icon" type="image/png" href="ti.ico" />
    <link rel="stylesheet" href="hojacssdeestilos.css" />
    
     <link rel="stylesheet" href="http://code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
    <!--estilo del error de jquery validator-->
    <style>
    
        #nombre.error,
        #apellido.error,
        #fechanacimiento.error,
        #telefono.error,
        #titulo.error,
        #proyecto.error,
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
                 	telefono: { required: true, digits: true},
                    titulo: { required: true, minlength: 1, maxlength: 50},
                    proyecto: { required: true, minlength: 1, maxlength: 50}


                   
                },

                messages:
                {
					run: { required:'*El run es requerido', digits:'Solo ingrese números'},
                    nombre: { required: '*El nombre es requerido', maxlength: 'Solo admite 50 caracteres' },
                    apellido: { required: '*El apellido es requerido', maxlength: 'Solo admite 50 caracteres' },
                    fechanacimiento: { required: 'La fecha es requerida' },
                    telefono: { required: '*El teléfono es requerido', digits:'*Solo ingrese números'}, 
                    titulo: { required: '*El titulo es requerido', maxlength: 'Solo admite 30 caracteres' },
                    proyecto: { required: '*El proyecto es requerido', digits:'Solo ingrese números'}


                    
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
        <h1>Plataforma de registro de Usuarios.</h1>
    </div>
    <hr />
    <!---Menu---->
    <div class="row col-3 col-s-3 menu">
        <h4>Menu de inicio:</h4>
        <ul>
            <li><a href="inicio" style="color:white;" title="Inicio">Inicio</a></li>
            <li><a href="foringreso" style="color:white;" title="Inicio">Ingreso</a></li>
            <li><a href="forContacto" style="color:white;">Contacto</a></li>
            <li><a href="forCrearCapacitaciones" style="color:white;">Crear Capacitación</a></li>
            <li><a href="forelegirusuario" style="color:white;">Crear Usuario</a></li>
            <li><a href="forListarCapacitaciones" style="color:white;">Listado de Capacitaciones</a></li>
            <li><a href="ListadoUsuario" style="color:white;">Listado usuario</a></li>
            <li><a href="forEditarCliente" style="color:white;">Editar Cliente</a></li>
            <li><a href="forEditarAdministrativo" style="color:white;">Editar Administrativo</a></li>
            <li style="background-color: green;">Editar Profesional</li>

        </ul>
    </div>
    <!--formulario crear capacitacion-->

    <div class="col-9 col-s-9" id="tableRegistro">



        <form method="post" name="formulario" id="formulario" action="forValidarCrearUsuario">
            <h2>Crear Usuario</h2>
           <p>
                <label for="run">Run: </label>
                <input type="text" name="run" id="run" placeholder="12345678-k" />
            </p>
            <p>
                <label for="nombre">Nombres: </label>
                <input type="text" name="nombre" id="nombre" placeholder="Escriba su nombre" />
            </p>
            <p>
                <label for="apellido">Apellidos: </label>
                <input type="text" name="apellido" id="apellido" placeholder="Escriba sus apellidos" />
            </p>
            <p>
                <label for="fechanacimiento">Fecha de nacimiento: </label>
                <input type="date" name="fechanacimiento" id="fechanacimiento" placeholder="dd-mm-aaaa" />
            </p>
             <p>
                <label for="telefono">Número telefónico: </label>
                <input type="text" name="telefono" id="telefono" placeholder="56912345678" />
            </p> 
            <p>
                <label for="titulo">Título: </label>
                <input type="text" name="titulo" id="titulo" placeholder="Ingrese su título" />
            </p>
            <p>
                <label for="proyecto">Proyecto: </label>
                <input type="text" name="proyecto" id="proyecto" placeholder="Ingrese su proyecto" />
            </p>

 			<input type="hidden" name="hdnidcliente" id="hdnidcliente" value="3" />
			<input type="hidden" name="accion" id="accion" value="E" />
            <input type="button" id="btn" class="btn" value="Editar" />
			<input type="reset" value="Limpiar Formulario" />

        </form>
    </div>

</body>
</html>