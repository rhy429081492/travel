/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.22
 * Generated at: 2019-09-02 17:45:25 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class agencyupdatebusiness_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("file:/D:/apache-maven-3.6.1/repo/org/springframework/spring-webmvc/5.1.9.RELEASE/spring-webmvc-5.1.9.RELEASE.jar", Long.valueOf(1565356371333L));
    _jspx_dependants.put("jar:file:/D:/apache-maven-3.6.1/repo/org/springframework/spring-webmvc/5.1.9.RELEASE/spring-webmvc-5.1.9.RELEASE.jar!/META-INF/spring-form.tld", Long.valueOf(1564706636000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
String path = request.getContextPath();
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <title>景点信息修改</title>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <title>管理员界面</title>\r\n");
      out.write("\r\n");
      out.write("    <link href=\"");
      out.print(path);
      out.write("/assets/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"");
      out.print(path);
      out.write("/assets/css/datepicker3.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"");
      out.print(path);
      out.write("/assets/css/adminmain.css\" rel=\"stylesheet\">\r\n");
      out.write("    <!--[if lt IE 9]>\r\n");
      out.write("    <script src=\"");
      out.print(path);
      out.write("/assets/js/html5shiv.min.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.print(path);
      out.write("/assets/js/respond.min.js\"></script>\r\n");
      out.write("    <![endif]-->\r\n");
      out.write("    <script>\r\n");
      out.write("        function sub() {\r\n");
      out.write("            var form = document.getElementById('form');\r\n");
      out.write("            form.submit();\r\n");
      out.write("        }\r\n");
      out.write("    </script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"col-sm-9 col-lg-10 col-sm-offset-1 main\">\r\n");
      out.write("\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("        <div class=\"col-lg-12\">\r\n");
      out.write("            <h1 class=\"page-header\">景点信息上传</h1>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div><!--/.row-->\r\n");
      out.write("\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("        <div class=\"col-lg-12\">\r\n");
      out.write("            <div class=\"panel panel-default\">\r\n");
      out.write("                <div class=\"panel-heading\">景点信息</div>\r\n");
      out.write("                <div class=\"panel-body\">\r\n");
      out.write("                    <div class=\"col-md-12\">\r\n");
      out.write("                        <form role=\"form\" method=\"post\" action=\"agency/updatebusiness\" name=\"form\" id=\"form\" enctype=\"multipart/form-data\">\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                                <label>业务名称</label>\r\n");
      out.write("                                <input class=\"form-control\" placeholder=\"Placeholder\" name=\"form-bname\">\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                                <label>景点名称</label>\r\n");
      out.write("                                <input class=\"form-control\" placeholder=\"Placeholder\" name=\"form-sname\">\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                                <label>开始日期</label>\r\n");
      out.write("                                <input class=\"form-control\" placeholder=\"Placeholder\" name=\"form-begintime\">\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                                <label>结束日期</label>\r\n");
      out.write("                                <input class=\"form-control\" placeholder=\"Placeholder\" name=\"form-endtime\">\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                                <label>价格</label>\r\n");
      out.write("                                <input class=\"form-control\" placeholder=\"Placeholder\" name=\"form-price\">\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                                <label>规模</label>\r\n");
      out.write("                                <select class=\"form-control\" name=\"form-scale\">\r\n");
      out.write("                                    <option value=\"小\">小</option>\r\n");
      out.write("                                    <option value=\"中\">中</option>\r\n");
      out.write("                                    <option value=\"大\">大</option>\r\n");
      out.write("                                </select>\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                                <label>总人数</label>\r\n");
      out.write("                                <input class=\"form-control\" placeholder=\"Placeholder\" name=\"form-nop\">\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                                <label>出发地</label>\r\n");
      out.write("                                <input class=\"form-control\" placeholder=\"Placeholder\" name=\"form-beginplace\">\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                                <label>交通工具</label>\r\n");
      out.write("                                <input class=\"form-control\" placeholder=\"Placeholder\" name=\"form-vehicle\">\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                                <label>景点简介</label>\r\n");
      out.write("                                <textarea class=\"form-control\" placeholder=\"Placeholder\" rows=\"5\" name=\"form-introduce\"></textarea>\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                                <div><label>景点图片</label></div>\r\n");
      out.write("\r\n");
      out.write("                                <div class=\"a-upload\">\r\n");
      out.write("                                    <input type=\"file\" name=\"form-file\" id=\"form-file[0]\">\r\n");
      out.write("                                    <p class=\"help-block\">上传景点图片1</p>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"a-upload\">\r\n");
      out.write("                                    <input type=\"file\" name=\"form-file\" id=\"form-file[1]\">\r\n");
      out.write("                                    <p class=\"help-block\">上传景点图片2</p>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"a-upload\">\r\n");
      out.write("                                    <input type=\"file\" name=\"form-file\" id=\"form-file[2]\">\r\n");
      out.write("                                    <p class=\"help-block\">上传景点图片3</p>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"a-upload\">\r\n");
      out.write("                                    <input type=\"file\" name=\"form-file\" id=\"form-file[3]\">\r\n");
      out.write("                                    <p class=\"help-block\">上传景点图片4</p>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"a-upload\">\r\n");
      out.write("                                    <input type=\"file\" name=\"form-file\" id=\"form-file[4]\">\r\n");
      out.write("                                    <p class=\"help-block\">上传景点图片5</p>\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                        </form>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div><!-- /.col-->\r\n");
      out.write("        </div><!-- /.row -->\r\n");
      out.write("        <button type=\"button\" style=\"float: right\" class=\"btn\" onclick=\"sub()\">确认修改</button>\r\n");
      out.write("        <button type=\"button\" style=\"float: right;margin-right: 10px\" class=\"btn\" onclick=\"window.location.href='/travel/agencymain.jsp'\">返回主页</button>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!--/.main-->\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("<script src=\"");
      out.print(path);
      out.write("/assets/js/jquery-1.11.1.min.js\"></script>\r\n");
      out.write("<script src=\"");
      out.print(path);
      out.write("/assets/js/bootstrap.min.js\"></script>\r\n");
      out.write("<script src=\"");
      out.print(path);
      out.write("/assets/js/bootstrap-datepicker.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(path);
      out.write("/assets/js/b.page.js\" ></script>\r\n");
      out.write("<script>\r\n");
      out.write("    $('#calendar').datepicker({\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("    !function ($) {\r\n");
      out.write("        $(document).on(\"click\",\"ul.nav li.parent > a > span.icon\", function(){\r\n");
      out.write("            $(this).find('em:first').toggleClass(\"glyphicon-minus\");\r\n");
      out.write("        });\r\n");
      out.write("        $(\".sidebar span.icon\").find('em:first').addClass(\"glyphicon-plus\");\r\n");
      out.write("    }(window.jQuery);\r\n");
      out.write("\r\n");
      out.write("    $(window).on('resize', function () {\r\n");
      out.write("        if ($(window).width() > 768) $('#sidebar-collapse').collapse('show')\r\n");
      out.write("    })\r\n");
      out.write("    $(window).on('resize', function () {\r\n");
      out.write("        if ($(window).width() <= 767) $('#sidebar-collapse').collapse('hide')\r\n");
      out.write("    })\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
