
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Registro de Usuarios</h1>
        <form action="Usuarios_procesa" method="POST">
            <b>Nombre:</b> <input type="text" name="nombre" value="" />
            <br><br>
            <b>Apellidos:</b> <input type="text" name="apellidos" value="" />
            <br><br>
            <b>Correo electronico: </b> <input type="email" name="correo" value="" />
            <br><br>
            <b>Contraseña: </b> <input type="password" name="contra" value="" />
            <br><br>
            <input type="submit" value="Enviar" />  
        </form>
    </body>
</html>
