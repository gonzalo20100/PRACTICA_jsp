<%@page import="com.emergentes.Usuarios"%>
<%
    Usuarios u = new Usuarios();
    u = (Usuarios)request.getAttribute("usus");
    
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Dato del registro del ususario</h1>
        
        <p><b>Nombre:</b> <%= u.getNombre() %></p>
        
        <p><b>Apellidos:</b> <%= u.getApellidos() %></p>
        
        <p><b>Correo Electronico:</b> <%= u.getCorreo()%></p>
        
        <p><b>Contraseña:</b> <%= u.getContra() %></p>
        
        <a href="Usuarios_llenado.jsp">Volver a llenar el formulario</a>
        <br><br>
        <a href="index.jsp">Elegir otro formulario para llenar</a>
    </body>
</html>
