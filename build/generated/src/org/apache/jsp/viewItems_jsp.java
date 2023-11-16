package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import modal.Stock;
import java.util.Base64;
import java.io.File;
import org.apache.commons.io.FileUtils;
import modal.Item;
import java.util.List;
import DAO.ItemDAO;

public final class viewItems_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
