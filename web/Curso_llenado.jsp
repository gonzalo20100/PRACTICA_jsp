
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Inscripcion en curso</h1>
        <form action="Curso_procesa" method="POST">
            <b>Nombre:</b> <input type="text" name="nombre" value="" />
            <br><br>
            <b>Apellidos:</b> <input type="text" name="apellidos" value="" />
            <br><br>
            <b>Curso:</b> <select name="curso">
                    <option value="Primero">Primero</option>
                    <option value="Segundo">Segundo</option>
                    <option value="Tercero">Tercero</option>
                    <option value="Cuarto">Cuarto</option>
                    <option value="Quinto">Quinto</option>
                  </select>
            <br><br>
            <input type="submit" value="Enviar" />  
        </form>
    </body>
</html>
