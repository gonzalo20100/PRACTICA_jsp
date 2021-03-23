
package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Libros_proceso", urlPatterns = {"/Libros_proceso"})
public class Libros_proceso extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String titulo = request.getParameter("titulo");
        String autor = request.getParameter("autor");
        String resumen = request.getParameter("resumen");
        String medio = request.getParameter("medio");
        
        Libros li = new Libros();
        
        li.setAutor(autor);
        li.setTitulo(titulo);
        li.setResumen(resumen);
        li.setMedio(medio);
        
        request.setAttribute("lib", li);
        request.getRequestDispatcher("Libros_salida.jsp").forward(request, response);
    }
}
