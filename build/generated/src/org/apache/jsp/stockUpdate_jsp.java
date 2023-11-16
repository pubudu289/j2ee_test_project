package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class stockUpdate_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Stock Update</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"Bootsrap/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"Bootsrap/jqueary/jquery.min.js\"></script>\n");
      out.write("        <script src=\"Bootsrap/js/bootstrap.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container mt-3\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-12\">\n");
      out.write("                    <h3 class=\"text-center\">Add Item Stock</h3>\n");
      out.write("                    <table class=\"table table-active table-striped\">\n");
      out.write("                        <tr>\n");
      out.write("                            <th>Item ID</th>\n");
      out.write("                            <th>Item Name</th>\n");
      out.write("                            <th>Status</th>\n");
      out.write("                            <th>Image</th>\n");
      out.write("                            <th>Add Stock</th>\n");
      out.write("                        </tr>\n");
      out.write("                        <tbody id=\"itemTable\">\n");
      out.write("\n");
      out.write("                        </tbody>\n");
      out.write("                    </table>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!--     modal-->\n");
      out.write("        <div class=\"modal fade\" id=\"exampleModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\n");
      out.write("            <div class=\"modal-dialog\" role=\"document\">\n");
      out.write("                <div class=\"modal-content\">\n");
      out.write("                    <div class=\"modal-header\">\n");
      out.write("                        <h5 class=\"modal-title\" id=\"exampleModalLabel\">Add Item Stock</h5>\n");
      out.write("                        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
      out.write("                            <span aria-hidden=\"true\">&times;</span>\n");
      out.write("                        </button>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"modal-body\">\n");
      out.write("                        <form action=\"stockUpdate.jsp\" method=\"POST\">\n");
      out.write("\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col-sm-8\">\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <label for=\"item-id\" class=\"col-form-label\">Item ID</label>\n");
      out.write("                                            <input type=\"text\" class=\"form-control\" id=\"item-id\" readonly>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <label for=\"item-name\" class=\"col-form-label\">Item Name</label>\n");
      out.write("                                            <input type=\"text\" class=\"form-control\" id=\"item-name\" readonly>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-sm-4\">\n");
      out.write("                                        <div class=\"card\">\n");
      out.write("                                            <img alt=\"Iem Image\" id=\"item-image\" src=\"\" height=\"150px\" width=\"120px\">\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"item-price\" class=\"col-form-label\">Item Price</label>\n");
      out.write("                                <input type=\"number\" class=\"form-control\" id=\"item-price\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"item-qty\" class=\"col-form-label\">Quantity</label>\n");
      out.write("                                <input type=\"number\" class=\"form-control\" id=\"item-qty\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"item-desc\" class=\"col-form-label\">Description</label>\n");
      out.write("                                <input type=\"text\" class=\"form-control\" id=\"item-desc\">\n");
      out.write("                            </div>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"modal-footer\">\n");
      out.write("                        <button type=\"button\" class=\"btn btn-primary\" onclick =\"stockItemSave()\" >Stock Save</button>\n");
      out.write("                        <button type=\"button\" class=\"btn btn-warning\" data-dismiss=\"modal\">Close</button>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("\n");
      out.write("        $(document).ready(function () {\n");
      out.write("            searchItemTable();\n");
      out.write("        });\n");
      out.write("        function searchItemTable() {\n");
      out.write("            var xhttp = new XMLHttpRequest();\n");
      out.write("            xhttp.onload = function () {\n");
      out.write("\n");
      out.write("                document.getElementById('itemTable').innerHTML = this.responseText;\n");
      out.write("            }\n");
      out.write("            xhttp.open(\"POST\", \"stockUpdate\");\n");
      out.write("            xhttp.send();\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        function stockSave(uid, name, image) {\n");
      out.write("            $('#item-id').val(uid);\n");
      out.write("            $('#item-name').val(name);\n");
      out.write("            $('#item-image').attr(\"src\", image);\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        function stockItemSave() {\n");
      out.write("            var id = document.getElementById(\"item-id\").value;\n");
      out.write("            var price = document.getElementById(\"item-price\").value;\n");
      out.write("            var qty = document.getElementById(\"item-qty\").value;\n");
      out.write("            var desc = document.getElementById(\"item-desc\").value;\n");
      out.write("            var xhttp = new XMLHttpRequest();\n");
      out.write("            xhttp.onload = function () {\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            xhttp.open(\"POST\", \"StockSave?id=\" + id + \"&price=\" + price + \"&qty=\" + qty + \"&desc=\" + desc \");\n");
      out.write("                    xhttp.send();\n");
      out.write("        }\n");
      out.write("\n");
      out.write("//        $(documnt).ready(function () {\n");
      out.write("//            $(\"#stockItemSave\").click(function () {\n");
      out.write("//                var id = $(\"item-id\").val();\n");
      out.write("//                var price = $(\"item-price\").val();\n");
      out.write("//                var qty = $(\"item-qty\").val();\n");
      out.write("//                var desc = $(\"item-desc\").val();\n");
      out.write("//                $.ajax({\n");
      out.write("//                    type: 'POST',\n");
      out.write("//                    url: \"StockSave\",\n");
      out.write("//                    data: {\"item-id\": id, \"item-price\": price, \"item-qty\": qty, \"item-desc\": desc},\n");
      out.write("//                    success: function (data) {\n");
      out.write("//                        window.location = \"stockUpdate.jsp\";\n");
      out.write("//                    },\n");
      out.write("//                    error: function () {\n");
      out.write("//\n");
      out.write("//                    }\n");
      out.write("//                });\n");
      out.write("//            });\n");
      out.write("//        });\n");
      out.write("\n");
      out.write("    </script>\n");
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
