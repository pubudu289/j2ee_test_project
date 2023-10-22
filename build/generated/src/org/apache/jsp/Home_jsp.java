package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css\"\n");
      out.write("              rel=\"stylesheet\"/>\n");
      out.write("        <!-- Google Fonts -->\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Roboto:300,400,500,700&display=swap\"\n");
      out.write("              rel=\"stylesheet\"/>\n");
      out.write("        <!-- MDB -->\n");
      out.write("        <link href=\"https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/6.4.2/mdb.min.css\"\n");
      out.write("              rel=\"stylesheet\"/>\n");
      out.write("        <script type=\"text/javascript\" src=\"https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/6.4.2/mdb.min.js\" ></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <nav class=\"navbar navbar-expand-lg navbar-light bg-light\">\n");
      out.write("            <!-- Container wrapper -->\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <!-- Toggle button -->\n");
      out.write("                <button\n");
      out.write("                    class=\"navbar-toggler\"\n");
      out.write("                    type=\"button\"\n");
      out.write("                    data-mdb-toggle=\"collapse\"\n");
      out.write("                    data-mdb-target=\"#navbarSupportedContent\"\n");
      out.write("                    aria-controls=\"navbarSupportedContent\"\n");
      out.write("                    aria-expanded=\"false\"\n");
      out.write("                    aria-label=\"Toggle navigation\"\n");
      out.write("                    >\n");
      out.write("                    <i class=\"fas fa-bars\"></i>\n");
      out.write("                </button>\n");
      out.write("\n");
      out.write("                <!-- Collapsible wrapper -->\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("                    <!-- Navbar brand -->\n");
      out.write("                    <a class=\"navbar-brand mt-2 mt-lg-0\" href=\"#\">\n");
      out.write("                        <img\n");
      out.write("                            src=\"https://mdbcdn.b-cdn.net/img/logo/mdb-transaprent-noshadows.webp\"\n");
      out.write("                            height=\"15\"\n");
      out.write("                            alt=\"MDB Logo\"\n");
      out.write("                            loading=\"lazy\"\n");
      out.write("                            />\n");
      out.write("                    </a>\n");
      out.write("                    <!-- Left links -->\n");
      out.write("                    <ul class=\"navbar-nav me-auto mb-2 mb-lg-0\">\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link\" href=\"#\">Dashboard</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link\" href=\"#\">Team</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link\" href=\"#\">Projects</a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                    <!-- Left links -->\n");
      out.write("                </div>\n");
      out.write("                <!-- Collapsible wrapper -->\n");
      out.write("\n");
      out.write("                <!-- Right elements -->\n");
      out.write("                <div class=\"d-flex align-items-center\">\n");
      out.write("                    <!-- Icon -->\n");
      out.write("                    <a class=\"text-reset me-3\" href=\"#\">\n");
      out.write("                        <i class=\"fas fa-shopping-cart\"></i>\n");
      out.write("                    </a>\n");
      out.write("\n");
      out.write("                    <!-- Notifications -->\n");
      out.write("                    <div class=\"dropdown\">\n");
      out.write("                        <a\n");
      out.write("                            class=\"text-reset me-3 dropdown-toggle hidden-arrow\"\n");
      out.write("                            href=\"#\"\n");
      out.write("                            id=\"navbarDropdownMenuLink\"\n");
      out.write("                            role=\"button\"\n");
      out.write("                            data-mdb-toggle=\"dropdown\"\n");
      out.write("                            aria-expanded=\"false\"\n");
      out.write("                            >\n");
      out.write("                            <i class=\"fas fa-bell\"></i>\n");
      out.write("                            <span class=\"badge rounded-pill badge-notification bg-danger\">1</span>\n");
      out.write("                        </a>\n");
      out.write("                        <ul\n");
      out.write("                            class=\"dropdown-menu dropdown-menu-end\"\n");
      out.write("                            aria-labelledby=\"navbarDropdownMenuLink\"\n");
      out.write("                            >\n");
      out.write("                            <li>\n");
      out.write("                                <a class=\"dropdown-item\" href=\"#\">Some news</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a class=\"dropdown-item\" href=\"#\">Another news</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a class=\"dropdown-item\" href=\"#\">Something else here</a>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- Avatar -->\n");
      out.write("                    <div class=\"dropdown\">\n");
      out.write("                        <a\n");
      out.write("                            class=\"dropdown-toggle d-flex align-items-center hidden-arrow\"\n");
      out.write("                            href=\"#\"\n");
      out.write("                            id=\"navbarDropdownMenuAvatar\"\n");
      out.write("                            role=\"button\"\n");
      out.write("                            data-mdb-toggle=\"dropdown\"\n");
      out.write("                            aria-expanded=\"false\"\n");
      out.write("                            >\n");
      out.write("                            <img\n");
      out.write("                                src=\"https://mdbcdn.b-cdn.net/img/new/avatars/2.webp\"\n");
      out.write("                                class=\"rounded-circle\"\n");
      out.write("                                height=\"25\"\n");
      out.write("                                alt=\"Black and White Portrait of a Man\"\n");
      out.write("                                loading=\"lazy\"\n");
      out.write("                                />\n");
      out.write("                        </a>\n");
      out.write("                        <ul\n");
      out.write("                            class=\"dropdown-menu dropdown-menu-end\"\n");
      out.write("                            aria-labelledby=\"navbarDropdownMenuAvatar\"\n");
      out.write("                            >\n");
      out.write("                            <li>\n");
      out.write("                                <a class=\"dropdown-item\" href=\"#\">My profile</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a class=\"dropdown-item\" href=\"#\">Settings</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a class=\"dropdown-item\" href=\"#\">Logout</a>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <!-- Right elements -->\n");
      out.write("            </div>\n");
      out.write("            <!-- Container wrapper -->\n");
      out.write("        </nav>\n");
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
