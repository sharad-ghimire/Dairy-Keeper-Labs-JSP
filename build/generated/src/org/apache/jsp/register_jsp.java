package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Register</h1>\n");
      out.write("        <form method=\"POST\" action=\"welcome.jsp\">\n");
      out.write("            <table>\n");
      out.write("                <tr><td>Email</td><td> <input name=\"email\" type=\"text\"></td><tr>\n");
      out.write("                <tr><td>Full name</td><td> <input name=\"name\" type=\"text\"></td><tr>\n");
      out.write("                <tr><td>Password</td><td> <input name=\"password\" type=\"password\"></td><tr>\n");
      out.write("                <tr><td>Gender</td><td> \n");
      out.write("                        <input type=\"radio\" name=\"gender\" value=\"male\"> Male<br>\n");
      out.write("                        <input type=\"radio\" name=\"gender\" value=\"female\"> Female<br>\n");
      out.write("\n");
      out.write("                    </td><tr>\n");
      out.write("                <tr><td>Favourite colour</td><td> \n");
      out.write("                        <select name=\"favcol\">\n");
      out.write("                            <option value=\"Red\">Red</option>\n");
      out.write("                            <option value=\"Green\">Green</option>\n");
      out.write("                            <option value=\"Blue\">Blue</option>\n");
      out.write("                            <option value=\"Yellow\">Yellow</option>\n");
      out.write("                            <option value=\"orange\">orange</option>\n");
      out.write("                            <option value=\"pink\">pink</option>\n");
      out.write("                        </select>\n");
      out.write("\n");
      out.write("                    </td><tr>\n");
      out.write("                <tr><td>Agree to TOS</td><td> \n");
      out.write("                        <input type=\"checkbox\" name=\"tos\" checked=\"false\"></td><tr>\n");
      out.write("                <tr><td></td><td> \n");
      out.write("                        <input type=\"submit\" value=\"Register\"></td><tr>\n");
      out.write("            </table>\n");
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
