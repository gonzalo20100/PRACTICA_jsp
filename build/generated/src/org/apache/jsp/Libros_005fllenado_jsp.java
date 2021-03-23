package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Libros_005fllenado_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Registro de libros</h1>\n");
      out.write("        <form action=\"Libros_procesa\" method=\"POST\">\n");
      out.write("            <b>Titulo:</b> <input type=\"text\" name=\"titulo\" value=\"\" />\n");
      out.write("            <br><br>\n");
      out.write("            <b>Autor:</b> <input type=\"text\" name=\"autor\" value=\"\" />\n");
      out.write("            <br><br>\n");
      out.write("            <b>Resumen:</b><textarea name=\"comentarios\" rows=\"10\" cols=\"30\"></textarea>\n");
      out.write("            <br><br>\n");
      out.write("            <b>Medio</b>\n");
      out.write("\t\t<br>\n");
      out.write("\t\t<input type=\"radio\" name=\"medio\" value=\"Fisico\" id=\"mu\">\n");
      out.write("\t\t<label form=\"mu\">Fisico</label>\n");
      out.write("\t\t<br>\n");
      out.write("\t\t<input type=\"radio\" name=\"sexo\" value=\"magnetico\" id=\"hom\">\n");
      out.write("\t\t<label form=\"ho\">Magnetico</label>\n");
      out.write("\t\t\n");
      out.write("                <br><br>\n");
      out.write("            <input type=\"submit\" value=\"Enviar\" />  \n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
