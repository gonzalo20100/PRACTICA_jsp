
package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Usuarios_procesa", urlPatterns = {"/Usuarios_procesa"})
public class Usuarios_procesa extends HttpServlet {

     @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nombre = request.getParameter("nombre");
        String apellidos = request.getParameter("apellidos");
        String correo = request.getParameter("correo");
        String contra = request.getParameter("contra");
       
        Usuarios usu = new Usuarios();
        
        usu.setNombre(nombre);
        usu.setApellidos(apellidos);
        usu.setCorreo(correo);
        usu.setContra(contra);
        
        request.setAttribute("usus", usu);
        request.getRequestDispatcher("Usuarios_salida.jsp").forward(request, response);
        
    }

     
}
