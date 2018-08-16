package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import uts.wsd.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
 User user = new User(); 
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Index Page</title>\n");
      out.write("        <style>\n");
      out.write("            .div {\n");
      out.write("                width: 500px;\n");
      out.write("                padding: 10px;\n");
      out.write("                border: 1px solid gray;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
 
         //if(session != null) {
         User loggedUser = (User)session.getAttribute("userLogged");
           
            
            if (loggedUser != null) {
                 
            
           
        
      out.write("\n");
      out.write("        \n");
      out.write("        <h1>Diary Keeper</h1>\n");
      out.write("        <div bgcolor=\"#808080\">\n");
      out.write("        <p >You are logged in as ");
      out.print( loggedUser.getName());
      out.write(" &lt; ");
      out.print( loggedUser.getEmail());
      out.write(" &gt; </p>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div style=\"float: right\"><a href=\"logout.jsp\">Logout</a></div>\n");
      out.write("        \n");
      out.write("        <ul><li><a href=\"edit_user.jsp\">Account<a></li></ul>\n");
      out.write("        ");
} else {
      out.write("\n");
      out.write("        \n");
      out.write("        <h1>Diary Keeper</h1>\n");
      out.write("        <div bgcolor=\"#808080\">\n");
      out.write("        <p >You are not logged in </p>\n");
      out.write("        </div>\n");
      out.write("        <div style=\"float: right\"><a href=\"register.jsp\">Register</a></div>\n");
      out.write("        ");
 }
      out.write("\n");
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
