package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class MyUploader_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>file uploader</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"Bootsrap/css/bootstrap.min_1.css\">\n");
      out.write("        <script src=\"Bootsrap/jqueary/jquery.min.js\"></script>\n");
      out.write("        <script src=\"Bootsrap/js/bootstrap.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-sm-2\"></div>\n");
      out.write("            <div class=\"col-sm-8\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <form class=\"row g-3\" action=\"MyUpload\" enctype=\"multipart/form-data\" method=\"post\">\n");
      out.write("                            <div class=\"col-sm-8\">\n");
      out.write("                                <label class=\"fom-label\">File id</label>\n");
      out.write("                                <input type=\"text\" class=\"form-control\" id=\"id\" name=\"id\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-sm-8\">\n");
      out.write("                                <label class=\"fom-label\">File</label>\n");
      out.write("                                <input type=\"file\" class=\"form-control\" id=\"file\" name=\"file\">\n");
      out.write("                                \n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-sm-8 mb-3\">\n");
      out.write("                                <input type=\"submit\" class=\"btn btn-danger\" value=\"Upload\">\n");
      out.write("                            </div>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-sm-2\"></div>\n");
      out.write("        </div>\n");
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
