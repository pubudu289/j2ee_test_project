package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import DAO.ItemDAO;
import modal.Stock;
import java.util.Base64;
import java.io.File;
import org.apache.commons.io.FileUtils;
import modal.Item;
import java.util.List;
import DAO.ItemDAO;

public final class Item_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/MyResourceFile.jsp");
    _jspx_dependants.add("/viewItems.jsp");
  }

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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Item Upload</title>\n");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        \n");
      out.write("         <link rel=\"stylesheet\" href=\"Bootsrap/css/bootstrap.min_1.css\">\n");
      out.write("        <script src=\"Bootsrap/jqueary/jquery.min.js\"></script>\n");
      out.write("        <script src=\"Bootsrap/js/bootstrap.min.js\"></script>\n");
      out.write("        \n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.7.2/css/all.css\">\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"Bootsrap/css/cardStyle.css\">\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-4 mt-3\">\n");
      out.write("                    <form class=\"row g-3\" action=\"ItemSave\" enctype=\"multipart/form-data\" method=\"post\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-sm-12  bg-light\">\n");
      out.write("                                <h1>ADD NEW ITEM</h1>\n");
      out.write("                                <!--                        <div class=\"form-group mb-3\">\n");
      out.write("                                                            <label class=\"form-label\">Item ID</label>\n");
      out.write("                                                            <input class=\"form-control\" type=\"text\" name=\"itemId\" id=\"itemId\" placeholder=\"Item ID\"/>\n");
      out.write("                                                        </div>-->\n");
      out.write("                                ");

                                    ItemDAO dAO = new ItemDAO();
                                    String itemSize = "I0" + (dAO.ItemsSearch().size() + 1);


                                
      out.write("\n");
      out.write("\n");
      out.write("                                <div class=\"form-group  mb-3\">\n");
      out.write("                                    <label class=\"form-label\">Item Name & (Current Item ID: ");
      out.print(itemSize);
      out.write(")</label>\n");
      out.write("                                    <input class=\"form-control\" type=\"text\" name=\"itemName\" id=\"itemName\" placeholder=\"Item Name\"/>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group mb-3\">\n");
      out.write("                                    <label class=\"form-label\">Select Image</label>\n");
      out.write("                                    <input type=\"file\" class=\"form-control\" id=\"file\" name=\"file\">\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <div class=\"form-check mb-3\">\n");
      out.write("                                    <input class=\"form-check-input\" type=\"checkbox\"  id=\"checkbox\" name=\"checkbox\" checked=\"\">\n");
      out.write("                                    <label class=\"form-check-label\" for=\"flexCheckDefault\">Item Status</label>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group mb-3\">\n");
      out.write("                                    <input type=\"submit\" class=\"btb btn-primary form-control\" id=\"saveItem\" value=\"Upload\">\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                                    <div class=\"form-group mb-3\">\n");
      out.write("                                        <input type=\"button\" class=\"btb btn-warning form-control\" id=\"viewItem\" value=\"View Item\">\n");
      out.write("                                    </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div> \n");
      out.write("                       \n");
      out.write("                    </form> \n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-8\">");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"row\">\n");
      out.write("    ");

        ItemDAO itemDAO = new ItemDAO();
        List<Item> searchActiveItems = itemDAO.ItemsActiveItems();

        for (Item seItem : searchActiveItems) {
            String imgPath = seItem.getImgurl().replace("\\", "/");
            byte[] fileContent = FileUtils.readFileToByteArray(new File(imgPath));
            String encodedString = Base64.getEncoder().encodeToString(fileContent);
            String imgBase64 = "data:image/jpeg;base64," + encodedString;


    
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <div class=\"col-sm-4\">\n");
      out.write("        <div class=\"container d-flex justify-content-center\">\n");
      out.write("            <figure class=\"card card-product-grid card-lg\"> <a href=\"#\" class=\"img-wrap\" data-abc=\"true\"><img src=\" ");
      out.print( imgBase64);
      out.write(" \" ></a>\n");
      out.write("                <figcaption class=\"info-wrap\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-12\"> <a href=\"#\" class=\"title\" data-abc=\"true\"><small>Item ID : ");
      out.print(seItem.getId());
      out.write("</small>  </a> </div>\n");
      out.write("                        <div class=\"col-md-12 text-center\" style=\"font-weight: bold;\"> <a href=\"#\" class=\"title\" data-abc=\"true\"> ");
      out.print(seItem.getName());
      out.write(" </a> </div>\n");
      out.write("                      \n");
      out.write("                       \n");
      out.write("                        <div class=\"col-md-12\">\n");
      out.write("                            <div class=\"rating text-right\"> <i class=\"fa fa-star\"></i> <i class=\"fa fa-star\"></i> <i class=\"fa fa-star\"></i> </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </figcaption>\n");
      out.write("                <div class=\"bottom-wrap\"> <a href=\"#\" class=\"btn btn-primary float-right\" data-abc=\"true\"> Buy now </a>\n");
      out.write("                    <div class=\"price-wrap\">\n");
      out.write("                        ");

                            if (!seItem.getStocks().isEmpty()) {
                                Stock stock = (Stock) seItem.getStocks().toArray()[0];

                        
      out.write("\n");
      out.write("                         \n");
      out.write("                        <span class=\"price h6\">Rs: ");
      out.print( stock.getPrice());
      out.write("</span> \n");
      out.write("                         <div class=\"col-md-12\"> <a href=\"#\" class=\"title\" data-abc=\"true\"><small class=\"text-danger\">Item Qty : ");
      out.print(stock.getQty());
      out.write("</small>  </a> </div>\n");
      out.write("                         <br> <small>");
      out.print( stock.getDescription());
      out.write("</small> \n");
      out.write("                    </div>\n");
      out.write("                        ");

                            }
                        
      out.write("\n");
      out.write("\n");
      out.write("                       \n");
      out.write("                </div>\n");
      out.write("            </figure>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    ");

        }

    
      out.write("\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("    <script>\n");
      out.write("\n");
      out.write("        $(document).ready(function () {\n");
      out.write("            $(\"#viewItem\").click(function () {\n");
      out.write("                window.location.replace(\"stockUpdate.jsp\");\n");
      out.write("            });\n");
      out.write("        });\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("//        $(document).ready(function (){\n");
      out.write("//            $(\"#saveItem\").click(function (){\n");
      out.write("//                var itemId = $(\"#itemId\").val();\n");
      out.write("//                var itemName = $(\"#itemName\").val();\n");
      out.write("//                var imgFile = $(\"#file\").val();\n");
      out.write("//                var checkbox = $(\"#checkbox\").val();\n");
      out.write("//                \n");
      out.write("//                $.ajax({\n");
      out.write("//                    type: 'POST',\n");
      out.write("//                    url: \"ItemSave\",\n");
      out.write("//                    enctype:\"multipart/form-data\",\n");
      out.write("//                    data:{\"itemId\":itemId, \"itemName\":itemName, \"checkbox\":checkbox},\n");
      out.write("//                    success:function (data){\n");
      out.write("//                        \n");
      out.write("//                    },\n");
      out.write("//                    error:function (){\n");
      out.write("//                        \n");
      out.write("//                    }\n");
      out.write("//                });\n");
      out.write("//            });\n");
      out.write("//        });\n");
      out.write("    </script>\n");
      out.write("\n");
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
