/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.44
 * Generated at: 2023-07-18 07:26:28 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.board;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class replyDeleteView_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(5);
    _jspx_dependants.put("jar:file:/C:/dev/myproject/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/Pet/WEB-INF/lib/jstl-1.2.jar!/META-INF/fn.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("jar:file:/C:/dev/myproject/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/Pet/WEB-INF/lib/jstl-1.2.jar!/META-INF/fmt.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1617482270247L));
    _jspx_dependants.put("jar:file:/C:/dev/myproject/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/Pet/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/views/index.jsp", Long.valueOf(1689575812985L));
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
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<!-- 합쳐지고 최소화된 최신 CSS -->\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css\">\r\n");
      out.write("\t\t<!-- 부가적인 테마 -->\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css\">\r\n");
      out.write("\t\t<script src=\"//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\r\n");
      out.write("\t \t<title>게시판</title>\r\n");
      out.write("\t \t\r\n");
      out.write("\t \t<style>\r\n");
      out.write("\t \t\t#container {\r\n");
      out.write("\t\t\t\t  margin-top: -10px;\r\n");
      out.write("\t\t\t\t  font-family: 'SBAggroL'\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tp {\r\n");
      out.write("\t\t\t\tmargin-top: 20px;\r\n");
      out.write("\t\t\t\tfont-size:20px;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t \t</style>\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t$(document).ready(function(){\r\n");
      out.write("\t\t\tvar formObj = $(\"form[name='updateForm']\");\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t$(\".cancel_btn\").on(\"click\", function(){\r\n");
      out.write("\t\t\t\tlocation.href = \"/board/readView?bno=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${replyDelete.bno}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"\r\n");
      out.write("\t\t\t\t\t   + \"&page=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${scri.page}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"\r\n");
      out.write("\t\t\t\t\t   + \"&perPageNum=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${scri.perPageNum}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"\r\n");
      out.write("\t\t\t\t\t   + \"&searchType=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${scri.searchType}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"\r\n");
      out.write("\t\t\t\t\t   + \"&keyword=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${scri.keyword}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\";\r\n");
      out.write("\t\t\t})\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t})\r\n");
      out.write("\t\t\r\n");
      out.write("\t</script>\r\n");
      out.write("\t<body>\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t<title>Home</title>\r\n");
      out.write("\t\r\n");
      out.write("    \r\n");
      out.write("    <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/css/main.css\" rel=\"stylesheet\">\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<div id=\"page\">\r\n");
      out.write("\t\t<div id=\"header\">\r\n");
      out.write("\t\t\t<a href=\"/\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/img/mainlogo.png\" style=\"width:250px; height :150px; margin-top:-20px;\"></a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div class=\"nav\">\r\n");
      out.write("\t\t\t<div id=\"menu\" style=\"position: sticky;\">\r\n");
      out.write("\t\t\t\t<span><a href=\"/board/list\">자유게시판</a></span>\r\n");
      out.write("\t\t\t\t<span><a href=\"/\">My Pet 인스타그램</a></span>\r\n");
      out.write("\t\t\t\t<span><a href=\"/\">애견용품</a></span>\r\n");
      out.write("\t\t\t\t<span><a href=\"/\">동물병원찾기</a></span>\r\n");
      out.write("\t\t\t\t<span><a href=\"/\">로그인/회원가입</a></span>\r\n");
      out.write("\t\t\t\t<span><a href=\"/\">마이페이지</a></span>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<header>\r\n");
      out.write("\t\t\t\t<h1 style=\"font-family: 'SBAggroL'\">댓글삭제</h1>\r\n");
      out.write("\t\t\t</header>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<section id=\"container\">\r\n");
      out.write("\t\t\t\t<form name=\"updateForm\" role=\"form\" method=\"post\" action=\"/board/replyDelete\">\r\n");
      out.write("\t\t\t\t\t<input type=\"hidden\" name=\"bno\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${replyDelete.bno}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" readonly=\"readonly\"/>\r\n");
      out.write("\t\t\t\t\t<input type=\"hidden\" id=\"rno\" name=\"rno\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${replyDelete.rno}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" />\r\n");
      out.write("\t\t\t\t\t<input type=\"hidden\" id=\"page\" name=\"page\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${scri.page}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"> \r\n");
      out.write("\t\t\t\t\t<input type=\"hidden\" id=\"perPageNum\" name=\"perPageNum\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${scri.perPageNum}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"> \r\n");
      out.write("\t\t\t\t\t<input type=\"hidden\" id=\"searchType\" name=\"searchType\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${scri.searchType}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"> \r\n");
      out.write("\t\t\t\t\t<input type=\"hidden\" id=\"keyword\" name=\"keyword\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${scri.keyword}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"> \r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t<p>삭제 하시겠습니까?</p>\r\n");
      out.write("\t\t\t\t\t\t<button type=\"submit\" class=\"delete_btn btn btn-danger\">예 삭제합니다.</button>\r\n");
      out.write("\t\t\t\t\t\t<button type=\"button\" class=\"cancel_btn btn btn-warning\">아니오. 삭제하지 않습니다.</button>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t</section>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</body>\r\n");
      out.write("</html>");
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
