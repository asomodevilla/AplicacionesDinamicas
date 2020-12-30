<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Sistema de Información</title>
    <link rel="icon" type="image/png" href="ti.ico" />
    <link rel="stylesheet" href="hojacssdeestilos.css"/>
</head>


<body>
    <div class="header">
        <h1>Plataforma de registro de Usuarios.</h1>
    </div>    
    <hr/>

<div class="row">

        <!---Menu---->    
        <div class="col-3 col-s-3 menu">
            
            
            <ul>                
                <li><a href="index.jsp" style="color:white;" title="Inicio">Inicio</a></li>
                <li><a href="contacto.jsp" style="color:white;" >Contacto</a></li>
                <li><a href="crearcapacitacion.jsp" style="color:white;">Crear Capacitación</a></li>
                <li><a href="listarcapacitaciones.html" style="color:white;" >Listado de Capacitaciones</a></li>
                <li><a href="listadousuario.html" style="color:white;">Listado usuario</a></li>
                <li><a href="crearusuario.html" style="color:white;">Crear usuario</a></li>
                <li><a href="editarcliente.html" style="color:white;">Editar Cliente</a></li>
                <li><a href="editaradministrativo.html" style="color:white;">Editar Administrativo</a></li>
                <li><a href="editarprofesional.html" style="color:white;">Editar Profesional</a></li>
                <li><a href="responderchecklist.html" style="color:white;">Editar Lista de Capacitaciones</a></li>
            </ul>
        </div>   

    




<!---Primera Seccion-->
    <div class="col-6 col-s-9 sec1">
        <h2>¿Cual es el objetivo del sistema de informacion?</h2>
        <p>
            El Sistema de Información tiene por objetivo administrar procesos involucrados en la operación 
            de la empresa, junto con las capacitaciones y los pagos de clientes, de tal manera de que se 
            pueda obtener datos de cada uno de los flujos de la empresa y transformarlos en información clara, 
            concisa y cuantitativa. Lo que nos permitirá conocer con certeza el Key Performance Indicator 
            (KPI) clave para la toma de decisiones en cualquier punto de la operación y así poder aumentar 
            la eficiencia de la organización.
        </p>
    </div>

<!---Segunda Seccion-->
    <div clas="col-3 col-s-12 sec2">
        <div class="tableSec2">
        <table id="tableSec2">
            <tr>
                <td>
        
                    <h2>¿Para quiénes destinado su uso?</h2>
                        <p>
                            Este sistema está desarrollado para los clientes, pero además considera los usuarios internos de 
                            cada empresa, tanto administrativos como profesionales. Porque entendemos la importancia del manejo 
                            de la información a nivel interno como externo. De una forma simple pero con la capacidad de administrar 
                            todos los recursos relacionados con la empresa.
                        </p>
                 </td>
            </tr>
        </div>

        </table>

        
    </div>
<!---Tercera Seccion-->
    <div class="col-12 col-s-12 menu2">
        <h2>¿Qué procesos considera la plataforma actualmente?</h2>

                <p>
                    Los procesos que considera la plataforma actualmente son:</p>
                        <ul>
                            <li>Registro de usuarios en todas sus combinaciones:</li>
                                <ol>
                                    <li>Registro de Clientes con sus respectivos campos.</li>
                                    
                                    <li>Registro de Profesionales con sus respectivos campos.</li>
                                
                                    <li>Registro de Adminsitrativos con sus respectivos campos.</li>
                                </ol>
                            <li>Registro de las capacitaciones realizadas por los distintos Profesioanles</li>
                            <li>Eliminar perfiles de Usuario de los distintos tipo</li>
                            <li>Ver la información de usuarios de los distontos perfiles y las capacitaciones</li>

                        </ul>
                
    </div>
    

</div>

<!----pie de pagina--->
<footer>
    <p class="pie">Information System &copy; 2020</p>
</footer>

</body>
</html>