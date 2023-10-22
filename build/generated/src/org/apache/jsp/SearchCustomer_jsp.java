package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class SearchCustomer_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Search Customer</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"Bootsrap/css/bootstrap.min.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-2\"></div>\n");
      out.write("                <div class=\"col-md-8\">\n");
      out.write("                    <h1> Search Customer via Customer ID:</h1>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-2\"></div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-2\"></div>\n");
      out.write("                <div class=\"col-md-2\">\n");
      out.write("                    <label>Customer ID:</label>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-3\">\n");
      out.write("                    <input class=\"form-control\" type=\"text\" name=\"cusid\" id=\"cusid\"/>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-1\">\n");
      out.write("                    <button class=\"btn btn-warning btn-block\" onclick=\"search()\">Search</button>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-4\"></div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <br>\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-1\"></div>\n");
      out.write("                <div class=\"col-md-10\">\n");
      out.write("                    <table class=\"table table-light\" id=\"custab1\">\n");
      out.write("                        <tr>\n");
      out.write("                            <th>ID</th>\n");
      out.write("                            <th>FIRST NAME</th>\n");
      out.write("                            <th>LAST NAME</th>\n");
      out.write("                            <th>EMAIL</th>\n");
      out.write("                            <th>USERNAME</th>\n");
      out.write("                            <th>PASSWORD</th>\n");
      out.write("                            <th>STATUS</th>\n");
      out.write("                        </tr> \n");
      out.write("                        <tbody id=\"tabbody\"></tbody>\n");
      out.write("                    </table>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-1\"></div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </body> \n");
      out.write("    <script>\n");
      out.write("        function search() {\n");
      out.write("            var cusid = document.getElementById('cusid').value;\n");
      out.write("            var xhttp = new XMLHttpRequest();\n");
      out.write("                \n");
      out.write("            xhttp.onload = function () {\n");
      out.write("                var response = this.responseText;\n");
      out.write("                document.getElementById('tabbody').innerHTML = response;\n");
      out.write("            }\n");
      out.write("            xhttp.open('GET', 'CustomerSearch?cusid=' + cusid);\n");
      out.write("            xhttp.send();\n");
      out.write("        }\n");
      out.write("    </script>\n");
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
