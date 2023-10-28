package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import DAO.dto.Student;

public final class student_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Add New Student</title>\n");
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
      out.write("                    <h1>ADD NEW STUDENT</h1>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-3\"></div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-2\"></div>\n");
      out.write("                <div class=\"col-sm-8\">\n");
      out.write("                    <div class=\"form-group mb-3\">\n");
      out.write("                        <input class=\"form-control\" type=\"text\" name=\"stuid\" id=\"stuid\" placeholder=\"Student ID\"/>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group  mb-3\">\n");
      out.write("                        <input class=\"form-control\" type=\"text\" name=\"name\" id=\"name\" placeholder=\"Student Name\"/>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group mb-3\">\n");
      out.write("                        <input class=\"form-control\" type=\"text\" name=\"address\" id=\"age\" placeholder=\"Student Address\"/>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group mb-3\">\n");
      out.write("                        <button class=\"btn btn-primary btn-block\" onclick=\"StudentSave()\">Save Student</button>\n");
      out.write("\n");
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
      out.write("\n");
      out.write("                ");

                    if (session.getAttribute("studentList") != null) {


                
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"col-md-10\">\n");
      out.write("                    <table class=\"table table-light\" id=\"custab2\">\n");
      out.write("                        <tr>\n");
      out.write("                            <th>STUDENT ID</th>\n");
      out.write("                            <th>STUDENT NAME</th>\n");
      out.write("                            <th>STUDENT AGE</th>\n");
      out.write("                            <th>DELETE ACTION</th>\n");
      out.write("                        </tr> \n");
      out.write("                        <!--                        <tbody id=\"tab3\"></tbody>-->\n");
      out.write("                        ");
                            List<Student> list = (List<Student>) session.getAttribute("studentList");
                            for (Student student : list) {

                        
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                            <td>");
      out.print( student.getId());
      out.write("</td>\n");
      out.write("                            <td>");
      out.print( student.getName());
      out.write("</td>\n");
      out.write("                            <td>");
      out.print( student.getAge());
      out.write("</td>\n");
      out.write("                            <td><a></a></td>\n");
      out.write("                        </tr>\n");
      out.write("                        ");

                            }
                        
      out.write("\n");
      out.write("\n");
      out.write("                    </table>\n");
      out.write("                </div>\n");
      out.write("                ");

                    }

                
      out.write("\n");
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
      out.write("        $(document).ready(function () {\n");
      out.write("            StudentsSearch()\n");
      out.write("        });\n");
      out.write("\n");
      out.write("        function StudentSave() {\n");
      out.write("            var id = document.getElementById('stuid').value;\n");
      out.write("            var name = document.getElementById('name').value;\n");
      out.write("            var age = document.getElementById('age').value;\n");
      out.write("            var xhttp = new XMLHttpRequest();\n");
      out.write("\n");
      out.write("            xhttp.onload = function () {\n");
      out.write("//                $(\"input:text\").val(\"\");\n");
      out.write("//                $('#myModal').modal('toggle');\n");
      out.write("            }\n");
      out.write("            xhttp.open(\"POST\", \"StudentSave?stuid=\" + id + \"&name=\" + name + \"&age=\" + age);\n");
      out.write("            xhttp.send();\n");
      out.write("\n");
      out.write("        }\n");
      out.write("\n");
      out.write("//        function CustomersSearch() {\n");
      out.write("//            var xhttp = new XMLHttpRequest();\n");
      out.write("//            xhttp.onload = function () {\n");
      out.write("//                document.getElementById('tab3').innerHTML = this.responseText;\n");
      out.write("//            }\n");
      out.write("//            xhttp.open(\"POST\", \"CustomersLoad\");\n");
      out.write("//            xhttp.send();\n");
      out.write("//        }\n");
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
