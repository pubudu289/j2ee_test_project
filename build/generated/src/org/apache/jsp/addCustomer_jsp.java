package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addCustomer_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Add New Customer</title>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"Bootsrap/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"Bootsrap/jqueary/jquery.min.js\"></script>\n");
      out.write("        <script src=\"Bootsrap/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <div class=\"container bg-info mb-3\">\n");
      out.write("\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-3\"></div>\n");
      out.write("                <div class=\"col-sm-6\">\n");
      out.write("                    <h1>ADD NEW CUSTOMER</h1>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-3\"></div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-2\"></div>\n");
      out.write("                <div class=\"col-sm-8\">\n");
      out.write("                    <div class=\"form-group mb-3\">\n");
      out.write("                        <input class=\"form-control\" type=\"text\" name=\"cusid1\" id=\"cusid1\" placeholder=\"Customer ID\"/>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group  mb-3\">\n");
      out.write("                        <input class=\"form-control\" type=\"text\" name=\"fname\" id=\"fname\" placeholder=\"Customer First Name\"/>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group mb-3\">\n");
      out.write("                        <input class=\"form-control\" type=\"text\" name=\"lname\" id=\"lname\" placeholder=\"Customer Last Name\"/>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group  mb-3\">\n");
      out.write("                        <input class=\"form-control\" type=\"text\" name=\"email\" id=\"email\" placeholder=\"Customer Email\"/>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group mb-3\">\n");
      out.write("                        <input class=\"form-control\" type=\"text\" name=\"uname\" id=\"uname\" placeholder=\"Customer User Name\"/>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group  mb-3\">\n");
      out.write("                        <input class=\"form-control\" type=\"password\" name=\"pass1\" id=\"pass1\" placeholder=\"Password\"/>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group mb-3\">\n");
      out.write("                        <input class=\"form-control\" type=\"password\" name=\"pass2\" id=\"pass2\" placeholder=\"Confirm Password\"/>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group  mb-3 id_100\">\n");
      out.write("                        <select class=\"form-control\" id=\"stat\">\n");
      out.write("                            <option value=\"1\">Active</option>\n");
      out.write("                            <option value=\"0\">Inactive</option>\n");
      out.write("                        </select>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group mb-3\">\n");
      out.write("                        <button class=\"btn btn-primary btn-block\" onclick=\"CustomerSave()\">Save Customer</button>\n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-2\"></div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Modal -->\n");
      out.write("        <div class=\"modal fade\" id=\"myModal\" role=\"dialog\">\n");
      out.write("            <div class=\"modal-dialog\">\n");
      out.write("\n");
      out.write("                <!-- Modal content-->\n");
      out.write("                <div class=\"modal-content\">\n");
      out.write("                    <div class=\"modal-header\">\n");
      out.write("                        <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("                        <h4 class=\"modal-title\">Customer Saving</h4>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"modal-body\">\n");
      out.write("                        <p>Saving Success</p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"modal-footer\">\n");
      out.write("                        <button type=\"button\" class=\"btn btn-success\" data-dismiss=\"modal\">Close</button>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-1\"></div>\n");
      out.write("                <div class=\"col-md-10\">\n");
      out.write("                    <table class=\"table table-light\" id=\"custab2\">\n");
      out.write("                        <tr>\n");
      out.write("                            <th>ID</th>\n");
      out.write("                            <th>FIRST NAME</th>\n");
      out.write("                            <th>LAST NAME</th>\n");
      out.write("                            <th>EMAIL</th>\n");
      out.write("                            <th>USERNAME</th>\n");
      out.write("                            <th>PASSWORD</th>\n");
      out.write("                            <th>STATUS</th>\n");
      out.write("                            <th>UPDATE ACTION</th>\n");
      out.write("                            <th>DELETE ACTION</th>\n");
      out.write("                        </tr> \n");
      out.write("                        <tbody id=\"tab3\"></tbody>\n");
      out.write("\n");
      out.write("                    </table>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-1\"></div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("    <script>\n");
      out.write("        $(document).ready(function (){\n");
      out.write("            CustomersSearch() \n");
      out.write("        });\n");
      out.write("        \n");
      out.write("        function CustomerSave() {\n");
      out.write("            var id = document.getElementById('cusid1').value;\n");
      out.write("            var fname = document.getElementById('fname').value;\n");
      out.write("            var lname = document.getElementById('lname').value;\n");
      out.write("            var mail = document.getElementById('email').value;\n");
      out.write("            var uname = document.getElementById('uname').value;\n");
      out.write("            var pass1 = document.getElementById('pass1').value;\n");
      out.write("            var pass2 = document.getElementById('pass2').value;\n");
      out.write("            var stat = document.getElementById('stat').value;\n");
      out.write("\n");
      out.write("            var xhttp = new XMLHttpRequest();\n");
      out.write("\n");
      out.write("            xhttp.onload = function () {\n");
      out.write("                $(\"input:text\").val(\"\");\n");
      out.write("                $(\"input:password\").val(\"\");\n");
      out.write("                $(\"div.id_100 select\").val(\"1\").change();\n");
      out.write("                CustomersSearch();\n");
      out.write("                $('#myModal').modal('toggle');\n");
      out.write("            \n");
      out.write("            }\n");
      out.write("            xhttp.open(\"POST\", \"CustomerSave?cusid1=\" + id + \"&fname=\" + fname + \"&lname=\" + lname + \"&uname=\" + uname + \"&email=\" + mail + \"&pass1=\" + pass1 + \"&pass2=\" + pass2 + \"&stat=\" + stat);\n");
      out.write("            xhttp.send();\n");
      out.write("\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        function CustomersSearch() {\n");
      out.write("            var xhttp = new XMLHttpRequest();\n");
      out.write("            xhttp.onload = function () {\n");
      out.write("                document.getElementById('tab3').innerHTML = this.responseText;\n");
      out.write("            }\n");
      out.write("            xhttp.open(\"POST\", \"CustomersLoad\");\n");
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
