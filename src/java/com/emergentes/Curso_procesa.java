
package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "Curso_procesa", urlPatterns = {"/Curso_procesa"})
public class Curso_procesa extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String nombre = request.getParameter("nombre");
        String apellidos = request.getParameter("apellidos");
        String curso = request.getParameter("curso");
        
        Curso cur = new Curso();
        
        cur.setNombre(nombre);
        cur.setApellidos(apellidos);
        cur.setCurso(curso);
        
        request.setAttribute("curs", cur);
        request.getRequestDispatcher("Curso_salida.jsp").forward(request, response);
        
        
    }
}
