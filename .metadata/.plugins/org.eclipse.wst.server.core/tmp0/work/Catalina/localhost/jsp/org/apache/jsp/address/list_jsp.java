/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.73
 * Generated at: 2022-01-10 06:10:33 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.address;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.test.jdbc.DBUtil;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public final class list_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/inc/asset.jsp", Long.valueOf(1641536466739L));
    _jspx_dependants.put("/address/inc/asset.jsp", Long.valueOf(1641784588547L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.sql.Connection");
    _jspx_imports_classes.add("java.sql.ResultSet");
    _jspx_imports_classes.add("java.sql.Statement");
    _jspx_imports_classes.add("com.test.jdbc.DBUtil");
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

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
      return;
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
      out.write("\r\n");
      out.write("\r\n");
 

	//1. DB 작업 > select
	//2. ResultSet > 테이블 출력
	
	//1.
	Connection conn = null;
	Statement stat = null;
	ResultSet rs = null;

	conn = DBUtil.open();
	
	String sql = "select * from tblAddress order by seq desc";
	
	stat = conn.createStatement();
	rs = stat.executeQuery(sql);
	

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>주소록</title>\r\n");
      out.write("\r\n");
      out.write("<!-- asset.jsp -->\r\n");
      out.write("\r\n");

	String root = request.getContextPath();

      out.write("\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print( root );
      out.write("/asset/css/bootstrap.css\">\r\n");
      out.write("\r\n");
      out.write("<script src=\"");
      out.print( root );
      out.write("/asset/js/jquery-1.12.4.js\"></script>\r\n");
      out.write("<script src=\"");
      out.print( root );
      out.write("/asset/js/bootstrap.js\"></script>\r\n");
      out.write("<script src=\"");
      out.print( root );
      out.write("/asset/js/cookie.js\"></script>");
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("<!-- asset.jsp -->\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/jsp/address/asset/main.css\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<!-- template.jsp > list.jsp -->\r\n");
      out.write("	<div class=\"container\">\r\n");
      out.write("		<h1 class=\"page-header\">주소록 <small>목록보기</small></h1>\r\n");
      out.write("		\r\n");
      out.write("		<table class=\"table table-bordered horizontal\">\r\n");
      out.write("			<tr>\r\n");
      out.write("				<th>번호</th>\r\n");
      out.write("				<th>이름</th>\r\n");
      out.write("				<th>나이</th>\r\n");
      out.write("				<th>연락처</th>\r\n");
      out.write("				<th>주소</th>\r\n");
      out.write("				<th>처리</th>\r\n");
      out.write("			</tr>\r\n");
      out.write("			\r\n");
      out.write("			");
 while (rs.next()) { 
      out.write("\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td>");
      out.print( rs.getString("seq") );
      out.write("</td>\r\n");
      out.write("				<td>");
      out.print( rs.getString("name") );
      out.write("</td>\r\n");
      out.write("				<td>");
      out.print( rs.getString("age") );
      out.write("</td>\r\n");
      out.write("				<td>");
      out.print( rs.getString("tel") );
      out.write("</td>\r\n");
      out.write("				<td>");
      out.print( rs.getString("address") );
      out.write("</td>\r\n");
      out.write("				<td>\r\n");
      out.write("					<span class=\"glyphicon glyphicon-edit\" title=\"수정하기\" data-toggle=\"tooltip\"\r\n");
      out.write("								 onclick=\"location.href='/jsp/address/edit.jsp?seq=");
      out.print(rs.getString("seq"));
      out.write("';\"></span>\r\n");
      out.write("					<span class=\"glyphicon glyphicon-remove-sign\" title=\"삭제하기\" data-toggle=\"tooltip\"\r\n");
      out.write("								data-placement=\"top\" onclick=\"location.href='/jsp/address/del.jsp?seq=");
      out.print(rs.getString("seq"));
      out.write("';\"></span>	\r\n");
      out.write("				</td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			");
 } 
      out.write("\r\n");
      out.write("			\r\n");
      out.write("		</table>\r\n");
      out.write("		\r\n");
      out.write("		<div class=\"btns\">\r\n");
      out.write("			<button type=\"button\" class=\"btn btn-primary\" onclick=\"location.href='/jsp/address/add.jsp';\">\r\n");
      out.write("				<span class=\"glyphicon glyphicon-pencil\"></span>\r\n");
      out.write("				추가하기					\r\n");
      out.write("			</button>\r\n");
      out.write("		</div>\r\n");
      out.write("			\r\n");
      out.write("	</div>\r\n");
      out.write("	\r\n");
      out.write("	<script>\r\n");
      out.write("		$('[data-toggle=\"tooltip\"]').tooltip();	\r\n");
      out.write("	</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");


	rs.close();
	stat.close();
	conn.close();


      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
