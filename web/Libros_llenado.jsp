
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Registro de libros</h1>
        <form action="Libros_proceso" method="POST">
            <b>Titulo:</b> <input type="text" name="titulo" value="" />
            <br><br>
            <b>Autor:</b> <input type="text" name="autor" value="" />
            <br><br>
            <b>Resumen:</b><br><textarea name="resumen" rows="5" cols="20"></textarea>
            <br><br>
            <b>Medio</b>
		<br>
		<input type="radio" name="medio" value="Fisico">
		<label form="mu">Fisico</label>
		<br>
		<input type="radio" name="medio" value="magnetico">
		<label form="ho">Magnetico</label>
		
                <br><br>
            <input type="submit" value="Enviar" />  
        </form>
    </body>
</html>
