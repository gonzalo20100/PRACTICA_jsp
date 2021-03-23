<%@page import="com.emergentes.Productos"%>
<%
    Productos p = new Productos();
    p = (Productos)request.getAttribute("prod");
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Datos registrados del producto</h1>
        
        <p><b>Producto:</b> <%= p.getProducto() %></p>
        <p><b>Categoria:</b> <%= p.getCategoria() %></p>
        <p><b>Existencia:</b> <%= p.getExistencia() %></p>
        <p><b>Precio:</b> <%= p.getPrecio() %></p>
        
        <a href="Productos_llenado.jsp">Volver a llenar el formulario</a>
        <br><br>
        <a href="index.jsp">Elegir otro formulario para llenar</a>
    </body>
</html>
