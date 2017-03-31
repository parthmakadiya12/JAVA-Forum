package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Reg_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/Header.jsp");
    _jspx_dependants.add("/Footer.jsp");
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
      out.write("<!docktype html>\n");
      out.write("<html>\n");
      out.write("\t<head>\n");
      out.write("\t<meta charset=\"utf-8\">\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" >\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/bootstrap.min.css\"><!-   https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.5/css/bootstrap-theme.css->\n");
      out.write("\t<title>Trying Bootstrap</title>\n");
      out.write("\t</head>\n");
      out.write("       \n");
      out.write("<style>\n");
      out.write(".no-margin\n");
      out.write("{\n");
      out.write("margin:0px;\n");
      out.write("}\n");
      out.write(".no-padding\n");
      out.write("{\n");
      out.write("padding:0px;\n");
      out.write("}\n");
      out.write(".pg-align\n");
      out.write("{\n");
      out.write("    \n");
      out.write("\t margin: 0 auto;\n");
      out.write("}\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("<body>\n");
      out.write("    ");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<body>\n");
      out.write("<nav class=\"navbar-inverse navbar-default\" role=\"navigation\"> <!--inverse color we can also add navbar-static top-->\n");
      out.write("\t\t<div class=\"container-fluid\">\n");
      out.write("\t\t\n");
      out.write("\t\t\n");
      out.write("\t\t<div class=\"navbar-header\">\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#xxxx\">\n");
      out.write("\t\t\t\t<span class=\"sr-only\">Toggle Navigation</span>\n");
      out.write("\t\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t</button>\n");
      out.write("\t\t<a class=\"navbar-brand\" href=\"#\">All Tricks</a><!--add logo by img src=\"immg/alltricks.png\"-->\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"collapse navbar-collapse navbar-right\" id=\"xxxx\">\n");
      out.write("\t\t\t\t<ul class=\"nav navbar-nav nav-tabs\">\t\t\t\t\n");
      out.write("\t\t\t\t<li><a href=\"index.jsp\">Home</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">About</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"Contact.jsp\">Contact</a></li>\n");
      out.write("\t\t\t\t\t<li class=\"dropdown\">\n");
      out.write("\t\t\t\t\t<a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">Dropdowns<b class=\"caret\"></b></a>\n");
      out.write("\t\t\t\t\t<ul class=\"dropdown-menu\">\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">Link 1</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">Link 1</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">Link 1</a></li>\n");
      out.write("\t\t\t\t\t<li class=\"divider\"></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">div 1</a></li>\n");
      out.write("\t\t\t\t\t<li class=\"divider\"></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">Div 2</a></li>\n");
      out.write("\t\t\t\t\t<li class=\"divider\"></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">Div 3</a></li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t</div>\t\t\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("</nav>\n");
      out.write("    <div class=\"page-header no-margin no-padding\">\n");
      out.write("\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\t\t<div class=\"row\">\n");
      out.write("\t\t<img src=\"atlogo.png\" class=\"img-responsive center-block\" alt=\"Demo\">\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("    \n");
      out.write("</body>\n");
      out.write("</html>");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    \n");
      out.write("  \n");
      out.write("    <div class=\"container \" class=\".col-xs-4\" align=\"center\" style=\"border: thin solid black \">    \n");
      out.write("        <form action=\"DB\" method=\"post\">\n");
      out.write("        <h2>AllTricks <small>- Register Here </small></h2><br/>\n");
      out.write("   \n");
      out.write("  <div class=\"form-group\">\n");
      out.write("    <label for=\"inputEmail3\" class=\"col-sm-3 control-label\">Email</label>\n");
      out.write("    <div class=\"col-sm-6\">\n");
      out.write("        <input type=\"email\" class=\"form-control\" id=\"inputEmail3\" placeholder=\"Email\" name=\"Email\"  style=\"width:250px;\">\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("        <br/>\n");
      out.write("         <div class=\"form-group\">\n");
      out.write("    <label for=\"\" class=\"col-sm-3 control-label\">Full Name</label>\n");
      out.write("    <div class=\"col-sm-6\">\n");
      out.write("        <input type=\"text\" class=\"form-control\" id=\"\" placeholder=\"Full Name(Name+Surname)\" name=\"Name\" style=\"width:250px;\">\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("        <br/>\n");
      out.write("         <div class=\"form-group\">\n");
      out.write("    <label for=\"\" class=\"col-sm-3 control-label\">Date Of Birth</label>\n");
      out.write("    <div class=\"col-sm-6\">\n");
      out.write("        <input type=\"date\" class=\"form-control\" name=\"DOB\" style=\"width:250px;\">\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("        <br/>\n");
      out.write("     \n");
      out.write("        <div class=\"form-group\">\n");
      out.write("    <label for=\"\" class=\"col-sm-3 control-label\">Nationality</label>\n");
      out.write("    <div class=\"col-sm-6\">        \n");
      out.write("        <select class=\"form-control\" id=\"sel1\" name=\"Country\" style=\"width:250px;\">\n");
      out.write("    <option>India</option>\n");
      out.write("    <option>USA</option>\n");
      out.write("    <option>China</option>\n");
      out.write("    <option>Russia</option>\n");
      out.write("    <option>Bangla</option>\n");
      out.write("    <option>Nepal</option>\n");
      out.write("    <option>UK</option>\n");
      out.write("    <option>Germeny</option>\n");
      out.write("    <option>Brazil</option>\n");
      out.write("    <option>Pakistan</option>\n");
      out.write("    <option>other</option>\n");
      out.write("  </select>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("        <br/>\n");
      out.write("    <div class=\"form-group\">\n");
      out.write("    <label for=\"inputPhone\" class=\"col-sm-3 control-label\">Cell no.</label>\n");
      out.write("    <div class=\"col-sm-6\">\n");
      out.write("      <input type=\"text\" class=\"form-control\" id=\"inputCellno\" placeholder=\"Phone\" name=\"Phone\" style=\"width:250px;\">\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("        <br/>\n");
      out.write("  <div class=\"form-group\">\n");
      out.write("    <label for=\"inputPassword3\" class=\"col-sm-3 control-label\">Password</label>\n");
      out.write("    <div class=\"col-sm-6\">\n");
      out.write("      <input type=\"password\" class=\"form-control\" id=\"inputPassword3\" placeholder=\"Password\" name=\"pwd\" style=\"width:250px;\">\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("        <br/>\n");
      out.write("  <div class=\"form-group\">\n");
      out.write("    <label for=\"inputPassword3\" class=\"col-sm-3 control-label\">Confirm Password</label>\n");
      out.write("    <div class=\"col-sm-6\">\n");
      out.write("        <input type=\"password\" class=\"form-control\" id=\"inputPassword3\" placeholder=\"Password\" name=\"cpwd\" style=\"width:250px;\">\n");
      out.write("    </div>\n");
      out.write("  </div>      \n");
      out.write("  \n");
      out.write("  <div class=\"form-group\">\n");
      out.write("    <div class=\"col-sm-offset-3 col-sm-6\">\n");
      out.write("        <a href=\"index.jsp\"><button type=\"button\" class=\"btn btn-default\">Sign in</button></a>\n");
      out.write("        <button type=\"submit\" value=\"reg\" class=\"btn btn-default\">Register</button>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("        </form>\n");
      out.write("</div>\n");
      out.write("   ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"panel panel-info\">\n");
      out.write("      <div align=\"center\" class=\"panel-heading\">A Leading IT Innovating Company - All Tricks 007</div>\n");
      out.write("      <div align=\"center\" class=\"panel-body\">All Tricks News and Tips About Hacking,SEO,Blogger,Facebook and all Latest Technologies and We also provide Latest Updates.</div>\n");
      out.write("    </div>");
      out.write("\n");
      out.write("\n");
      out.write("<script src=\"js/jquery-2.1.4.js\"></script>\n");
      out.write("<script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("</body>\n");
      out.write("</html>");
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
