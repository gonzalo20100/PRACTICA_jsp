

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Registro de Productos</h1>
        <form action="Productos_procesa" method="POST">
            <b>Producto:</b> <input type="text" name="producto" value="" />
            <br><br>
            <b>Categoria:</b> <select name="categoria">
                    <option value="Frutas">Frutas</option>
                    <option value="Verduras">Verduras</option>
                    <option value="Cereales">Cereales</option>
                    <option value="Enlatados">Enlatados</option>
                    <option value="Lacteos">Lacteos</option>
                  </select>
            <br><br>
            <b>Existencia:</b> <input type="number" name="existencia" min="0" value="" />
            <br><br>
            <b>Precio: </b> <input type="number" name="precio" value="" step="any" min="0"/>
            <br><br>
            <input type="submit" value="Enviar" /> 
        </form>
    </body>
</html>
