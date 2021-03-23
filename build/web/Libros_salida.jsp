<%@page import="com.emergentes.Libros"%>
<%
    Libros l = new Libros();
    l = (Libros)request.getAttribute("lib");
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Datos del registro de Libro</h1>
        
            <p><b>Titulo:</b> <%= l.getTitulo() %></p>
            
            <p><b>Autor:</b> <%= l.getAutor() %></p>
            
            <p><b>Resumen:</b> <%= l.getResumen() %></p>
            
            <p><b>Medio:</b> <%= l.getMedio() %></p>
            
            <a href="Libros_llenado.jsp">Volver a llenar el formulario</a>
            <br><br>
            <a href="index.jsp">Elegir otro formulario para llenar</a>
    </body>
</html>
