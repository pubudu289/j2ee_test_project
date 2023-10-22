package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!doctype html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>signing Page</title>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"Bootsrap/css/all.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"Bootsrap/css/bootstrap.min_1.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"Bootsrap/css/style.css\">\n");
      out.write("        <script src=\"Bootsrap/jqueary/jquery.min.js\"></script>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body class=\"bg-light\">\n");
      out.write("        ");

            if (request.getAttribute("UserData") != null) {
                response.sendRedirect("Home.jsp");
            }
            

        
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"container mt-10 pt-5\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-5 col-sm-5 col-nd-5 m-auto\">\n");
      out.write("                    <div class=\"card wrapper\">\n");
      out.write("                        <div class=\"card-body\">\n");
      out.write("                            <form action=\"#\">\n");
      out.write("                                <div class=\"mb-3 text-center\">\n");
      out.write("                                    <h1>Sign In Here</h1>\n");
      out.write("                                </div>\n");
      out.write("                                <input type=\"text\"  class=\"form-control my-4 py-2\" id=\"forUsername\" for=\"forUsername\" placeholder=\"User Name\">\n");
      out.write("                                <input type=\"text\" class=\"form-control  my-4 py-2\" id=\"forPassword\"  for=\"forPassword\"  placeholder=\"Password\">\n");
      out.write("                                <div class=\"mb-3\">\n");
      out.write("                                    <button type=\"button\" class=\"btn btn-success btn-block\" id=\"loginButton\"  onclick=\"login()\">Sign In</button>\n");
      out.write("                                </div>\n");
      out.write("                                <p class=\"text-center text-muted \" >Register Now for Free By Clicking <a class=\"term\" href=\"signup.jsp\">Register Now</a> Button</p>\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("    <script>\n");
      out.write("        \n");
      out.write("        $(document).ready(function () {\n");
      out.write("            $('#loginButton').click(function () {\n");
      out.write("                \n");
      out.write("                var userName = $('#forUsername').val();\n");
      out.write("                var password = $('#forPassword').val();\n");
      out.write("                \n");
      out.write("                $.ajax({\n");
      out.write("                    type: 'POST',\n");
      out.write("                    url: \"userLogin\",\n");
      out.write("                    data: {\"username\": userName, \"password\": password},\n");
      out.write("                    success: function (data) {\n");
      out.write("                        if (data === \"00\") {\n");
      out.write("                            window.location = \"Home.jsp\";\n");
      out.write("                        } else {\n");
      out.write("                            window.location = \"login.jsp\";\n");
      out.write("                        }\n");
      out.write("                    },\n");
      out.write("                    error: function () {\n");
      out.write("                        \n");
      out.write("                    }\n");
      out.write("                    \n");
      out.write("                });\n");
      out.write("                \n");
      out.write("            });\n");
      out.write("        });\n");
      out.write("    </script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
