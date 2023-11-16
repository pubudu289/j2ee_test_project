package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Base64;
import org.apache.commons.io.FileUtils;
import java.io.File;
import DAO.dto.SessionCartItem;
import DAO.dto.SessionCart;

public final class shoppingcart_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Item cart</title>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css\"\n");
      out.write("              rel=\"stylesheet\"/>\n");
      out.write("        <!--         Google Fonts -->\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Roboto:300,400,500,700&display=swap\"\n");
      out.write("              rel=\"stylesheet\"/>\n");
      out.write("        <!--         MDB -->\n");
      out.write("        <link href=\"https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/6.4.2/mdb.min.css\"\n");
      out.write("              rel=\"stylesheet\"/>\n");
      out.write("        <script type=\"text/javascript\" src=\"https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/6.4.2/mdb.min.js\" ></script>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <section class=\"h-100\" style=\"background-color: #eee;\">\n");
      out.write("        <div class=\"container h-100 py-5\">\n");
      out.write("            <div class=\"row d-flex justify-content-center align-items-center h-100\">\n");
      out.write("                <div class=\"col-10\">\n");
      out.write("\n");
      out.write("                    <div class=\"d-flex justify-content-between align-items-center mb-4\">\n");
      out.write("                        <h3 class=\"fw-normal mb-0 text-black\">Shopping Cart</h3>\n");
      out.write("                        <div>\n");
      out.write("                            <p class=\"mb-0\"><span class=\"text-muted\">Sort by:</span> <a href=\"#!\" class=\"text-body\">price <i\n");
      out.write("                                        class=\"fas fa-angle-down mt-1\"></i></a></p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    ");

                        if (session.getAttribute("cart") != null) {
                            SessionCart sessionCart = (SessionCart) session.getAttribute("cart");
                            if (sessionCart.getItemList() != null) {
                                for (SessionCartItem cartItem : sessionCart.getItemList()) {
                                    
                                    String imgPath = cartItem.getItem().getImgurl().replace("\\", "/");
                                    byte[] fileContent = FileUtils.readFileToByteArray(new File(imgPath));
                                    String encodedString = Base64.getEncoder().encodeToString(fileContent);
                                    String imgBase64 = "data:image/jpeg;base64," + encodedString;
                                    

                    
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <div class=\"card rounded-3 mb-4\">\n");
      out.write("                        <div class=\"card-body p-4\">\n");
      out.write("                            <div class=\"row d-flex justify-content-between align-items-center\">\n");
      out.write("                                <div class=\"col-md-2 col-lg-2 col-xl-2\">\n");
      out.write("                                    <img\n");
      out.write("                                        src=\"");
      out.print( imgBase64);
      out.write(" \"\n");
      out.write("                                        class=\"img-fluid rounded-3\" alt=\"Cotton T-shirt\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-md-3 col-lg-3 col-xl-3\">\n");
      out.write("                                    <p class=\"lead fw-normal mb-2\">");
      out.print( cartItem.getItem().getName());
      out.write(" </p>\n");
      out.write("                                    <p><span class=\"text-muted\">Size: </span>M <span class=\"text-muted\">Color: </span>Grey</p>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-md-3 col-lg-3 col-xl-2 d-flex\">\n");
      out.write("                                    <button class=\"btn btn-link px-2\" \n");
      out.write("                                            onclick=\"this.parentNode.querySelector('input[type=number]').stepDown()\">\n");
      out.write("                                        <i class=\"fas fa-minus\"></i>\n");
      out.write("                                    </button>\n");
      out.write("\n");
      out.write("                                    <input id=\"form1\" min=\"0\" name=\"quantity\" value=\"1\" type=\"number\"\n");
      out.write("                                           class=\"form-control form-control-sm \" disabled/>\n");
      out.write("\n");
      out.write("                                    <button class=\"btn btn-link px-2\"\n");
      out.write("                                            onclick=\"this.parentNode.querySelector('input[type=number]').stepUp()\">\n");
      out.write("                                        <i class=\"fas fa-plus\"></i>\n");
      out.write("                                    </button>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-md-3 col-lg-2 col-xl-2 offset-lg-1\">\n");
      out.write("                                    <h5 class=\"mb-0\" id=\"totalPrice\">LKR ");
      out.print( cartItem.getUnitprice());
      out.write(" </h5>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-md-1 col-lg-1 col-xl-1 text-end\">\n");
      out.write("                                    <a href=\"#!\" class=\"text-danger\"><i class=\"fas fa-trash fa-lg\"></i></a>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    ");
            }
                            }
                            
                        }

                    
      out.write("\n");
      out.write("\n");
      out.write("                    <div class=\"card mb-4\">\n");
      out.write("                        <div class=\"card-body p-4 d-flex flex-row\">\n");
      out.write("                            <div class=\"form-outline flex-fill\">\n");
      out.write("                                <input type=\"text\" id=\"form1\" class=\"form-control form-control-lg\" />\n");
      out.write("                                <label class=\"form-label\" for=\"form1\">Discound code</label>\n");
      out.write("                            </div>\n");
      out.write("                            <button type=\"button\" class=\"btn btn-outline-warning btn-lg ms-3\">Apply</button>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"card\">\n");
      out.write("                        <div class=\"card-body\">\n");
      out.write("                            <button type=\"button\" class=\"btn btn-warning btn-block btn-lg\">Proceed to Pay</button>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("    function stepUp(){\n");
      out.write("        console.log(\"haiii haaii\");\n");
      out.write("        alert(\"Hiiii\");\n");
      out.write("      \n");
      out.write("    }\n");
      out.write("//    function stepDown(){\n");
      out.write("//        \n");
      out.write("//    }\n");
      out.write("    \n");
      out.write("//    function calculation(oparation){\n");
      out.write("//        var qty = parseFloat(document.getElementById('form1').value);\n");
      out.write("//        var total = parseFloat(document.getElementById('totalPrice'));\n");
      out.write("//        \n");
      out.write("//        console.log(qty);\n");
      out.write("//    }\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("//   $(document).ready(function (){\n");
      out.write("//         $(\"#btnplus\").click(function () {\n");
      out.write("            \n");
      out.write("//            var inputnumber = $(\"#form1\").val();\n");
      out.write("//            \n");
      out.write("//            console.log(inputnumber);\n");
      out.write("//            var labelnumber =  $(\"\").val();\n");
      out.write("            \n");
      out.write("//        });\n");
      out.write("//    });\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("</script>\n");
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
