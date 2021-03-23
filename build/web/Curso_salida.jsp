<%@page import="com.emergentes.Curso"%>
<%
    Curso c = new Curso();
    c = (Curso)request.getAttribute("curs");
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Datos de la inscripcion a curso</h1>
        <p><b>Nombre:</b> <%= c.getNombre() %></p>
        
        <p><b>Apellidos:</b> <%= c.getApellidos() %></p>
        
        <p><b>Curso:</b> <%= c.getCurso() %></p>
        
        <a href="Curso_llenado.jsp">Volver a llenar el formulario</a>
        <br><br>
        <a href="index.jsp">Elegir otro formulario para llenar</a>
        
    </body>
</html>
