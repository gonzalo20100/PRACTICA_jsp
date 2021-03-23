
package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Productos_procesa", urlPatterns = {"/Productos_procesa"})
public class Productos_procesa extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String producto = request.getParameter("producto");
        String categoria = request.getParameter("categoria");
        String exis = request.getParameter("existencia");
        int existencia = Integer.parseInt(exis);
        String pres = request.getParameter("precio");
        double precio = Double.parseDouble(pres);
        
        Productos pro = new Productos();
        
        pro.setProducto(producto);
        pro.setCategoria(categoria);
        pro.setExistencia(existencia);
        pro.setPrecio(precio);
        
        request.setAttribute("prod", pro);
        request.getRequestDispatcher("Productos_salida.jsp").forward(request, response);
        
    }

}
