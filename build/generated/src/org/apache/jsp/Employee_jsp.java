package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Employee_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>View Employee</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"Bootsrap/css/bootstrap.min_1.css\">\n");
      out.write("        <script src=\"Bootsrap/jqueary/jquery.min.js\"></script>\n");
      out.write("        <script src=\"Bootsrap/js/bootstrap.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container bg-info mb-5\">\n");
      out.write("\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-3\"></div>\n");
      out.write("                <div class=\"col-sm-6\">\n");
      out.write("                    <h1>LOAD EMPLOYEES</h1>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-3\"></div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-1\"></div>\n");
      out.write("                <div class=\"col-md-10\">\n");
      out.write("                    <table class=\"table table-light\" id=\"custab2\">\n");
      out.write("                        <tr>\n");
      out.write("                            <th>ID</th>\n");
      out.write("                            <th>EMP NO</th>\n");
      out.write("                            <th>FIRST NAME</th>\n");
      out.write("                            <th>LAST NAME</th>\n");
      out.write("                            <th>MOBILE</th>\n");
      out.write("                            <th>EMAIL</th>\n");
      out.write("                            <th>SALARY</th>\n");
      out.write("                            <th>ACCESS ACTION</th>\n");
      out.write("                            <th>DELETE ACTION</th>\n");
      out.write("                        </tr> \n");
      out.write("                        <tbody id=\"tabdes\"></tbody>\n");
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
      out.write("        <!--     modal-->\n");
      out.write("        <div class=\"modal fade\" id=\"exampleModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\n");
      out.write("            <div class=\"modal-dialog\" role=\"document\">\n");
      out.write("                <div class=\"modal-content\">\n");
      out.write("                    <div class=\"modal-header\">\n");
      out.write("                        <h5 class=\"modal-title\" id=\"exampleModalLabel\">Set Temporary User</h5>\n");
      out.write("                        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
      out.write("                            <span aria-hidden=\"true\">&times;</span>\n");
      out.write("                        </button>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"modal-body\">\n");
      out.write("                        <form action=\"Employee.jsp\" method=\"POST\">\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"recipient-name\" class=\"col-form-label\">Employee ID</label>\n");
      out.write("                                <input type=\"text\" class=\"form-control\" id=\"recipient-uid\" readonly>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"recipient-name\" class=\"col-form-label\">USer Name</label>\n");
      out.write("                                <input type=\"text\" class=\"form-control\" id=\"recipient-uname\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"recipient-name\" class=\"col-form-label\">Password</label>\n");
      out.write("                                <input type=\"text\" class=\"form-control\" id=\"recipient-pw\">\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"form-group  id_100\">\n");
      out.write("                                <label for=\"recipient-name\" class=\"col-form-label\">Status</label>\n");
      out.write("                                <select class=\"form-control\" id=\"recipient-stat\">\n");
      out.write("                                    <option value=\"1\">Active</option>\n");
      out.write("                                    <option value=\"0\">Inactive</option>\n");
      out.write("                                </select>\n");
      out.write("                            </div>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"modal-footer\">\n");
      out.write("                        <button type=\"button\" class=\"btn btn-primary\" onclick=\"userSave()\">Save User</button>\n");
      out.write("                        <button type=\"button\" class=\"btn btn-success\">Update User</button>\n");
      out.write("                        <button type=\"button\" class=\"btn btn-warning\" data-dismiss=\"modal\">Close</button>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("        $(document).ready(function () {\n");
      out.write("            searchTable();\n");
      out.write("        });\n");
      out.write("\n");
      out.write("\n");
      out.write("        function searchTable() {\n");
      out.write("            var xhttp = new XMLHttpRequest();\n");
      out.write("            xhttp.onload = function () {\n");
      out.write("                document.getElementById('tabdes').innerHTML = this.responseText;\n");
      out.write("            }\n");
      out.write("            xhttp.open(\"POST\", \"EmployeeSearch\");\n");
      out.write("            xhttp.send();\n");
      out.write("        }\n");
      out.write("        function load(uid) {\n");
      out.write("            $('#recipient-uid').val(uid);\n");
      out.write("        }\n");
      out.write("\n");
      out.write("\n");
      out.write("        function userSave() {\n");
      out.write("            var userid = document.getElementById('recipient-uid').value;\n");
      out.write("            var username = document.getElementById('recipient-uname').value;\n");
      out.write("            var password = document.getElementById('recipient-pw').value;\n");
      out.write("            var stat = document.getElementById('recipient-stat').value;\n");
      out.write("            alert(userid + \" \" + username + \" \" + password + \" \" + stat)\n");
      out.write("            var xhttp = new XMLHttpRequest();\n");
      out.write("            xhttp.onload = function () {\n");
      out.write("                $(\"input:text\").val(\"\");\n");
      out.write("                $(\"input:password\").val(\"\");\n");
      out.write("                $(\"div.id_100 select\").val(\"1\").change();\n");
      out.write("               \n");
      out.write("            }\n");
      out.write("            xhttp.open(\"POST\", \"SaveSystemUser?userid=\" + userid + \"&username=\" + username + \"&password=\" + password + \"&stat=\" + stat);\n");
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
