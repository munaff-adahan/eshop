/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.7
 * Generated at: 2023-08-18 06:11:28 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.frontend.auth;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/C:/Users/gggg/.m2/repository/lk/callidora/jsp/jsp-template-inheritance/1.0.1/jsp-template-inheritance-1.0.1.jar!/META-INF/jsp-inheritance.tld", Long.valueOf(1692219220000L));
    _jspx_dependants.put("file:/C:/Users/gggg/.m2/repository/lk/callidora/jsp/jsp-template-inheritance/1.0.1/jsp-template-inheritance-1.0.1.jar", Long.valueOf(1692244256740L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
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

  public boolean getErrorOnELNotFound() {
    return false;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
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

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
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

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write('\r');
      out.write('\n');
      if (_jspx_meth_layout_005fextends_005f0(_jspx_page_context))
        return;
      out.write('\r');
      out.write('\n');
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
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

  private boolean _jspx_meth_layout_005fextends_005f0(jakarta.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    jakarta.servlet.jsp.PageContext pageContext = _jspx_page_context;
    jakarta.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  layout:extends
    lk.callidora.jsp.inheritance.ExtendsTag _jspx_th_layout_005fextends_005f0 = new lk.callidora.jsp.inheritance.ExtendsTag();
    _jsp_getInstanceManager().newInstance(_jspx_th_layout_005fextends_005f0);
    try {
      _jspx_th_layout_005fextends_005f0.setJspContext(_jspx_page_context);
      // /WEB-INF/views/frontend/auth/login.jsp(2,0) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_layout_005fextends_005f0.setName("base");
      _jspx_th_layout_005fextends_005f0.setJspBody(new Helper( 0, _jspx_page_context, _jspx_th_layout_005fextends_005f0, null));
      _jspx_th_layout_005fextends_005f0.doTag();
    } finally {
      _jsp_getInstanceManager().destroyInstance(_jspx_th_layout_005fextends_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_layout_005fput_005f0(jakarta.servlet.jsp.tagext.JspTag _jspx_parent, jakarta.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    jakarta.servlet.jsp.PageContext pageContext = _jspx_page_context;
    jakarta.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  layout:put
    lk.callidora.jsp.inheritance.PutTag _jspx_th_layout_005fput_005f0 = new lk.callidora.jsp.inheritance.PutTag();
    _jsp_getInstanceManager().newInstance(_jspx_th_layout_005fput_005f0);
    try {
      _jspx_th_layout_005fput_005f0.setJspContext(_jspx_page_context);
      _jspx_th_layout_005fput_005f0.setParent(_jspx_parent);
      // /WEB-INF/views/frontend/auth/login.jsp(3,4) name = block type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_layout_005fput_005f0.setBlock("contents");
      _jspx_th_layout_005fput_005f0.setJspBody(new Helper( 1, _jspx_page_context, _jspx_th_layout_005fput_005f0, null));
      _jspx_th_layout_005fput_005f0.doTag();
    } finally {
      _jsp_getInstanceManager().destroyInstance(_jspx_th_layout_005fput_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_layout_005fput_005f1(jakarta.servlet.jsp.tagext.JspTag _jspx_parent, jakarta.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    jakarta.servlet.jsp.PageContext pageContext = _jspx_page_context;
    jakarta.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  layout:put
    lk.callidora.jsp.inheritance.PutTag _jspx_th_layout_005fput_005f1 = new lk.callidora.jsp.inheritance.PutTag();
    _jsp_getInstanceManager().newInstance(_jspx_th_layout_005fput_005f1);
    try {
      _jspx_th_layout_005fput_005f1.setJspContext(_jspx_page_context);
      _jspx_th_layout_005fput_005f1.setParent(_jspx_parent);
      // /WEB-INF/views/frontend/auth/login.jsp(116,4) name = block type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_layout_005fput_005f1.setBlock("script");
      _jspx_th_layout_005fput_005f1.setJspBody(new Helper( 2, _jspx_page_context, _jspx_th_layout_005fput_005f1, null));
      _jspx_th_layout_005fput_005f1.doTag();
    } finally {
      _jsp_getInstanceManager().destroyInstance(_jspx_th_layout_005fput_005f1);
    }
    return false;
  }

  private class Helper
      extends org.apache.jasper.runtime.JspFragmentHelper
  {
    private jakarta.servlet.jsp.tagext.JspTag _jspx_parent;
    private int[] _jspx_push_body_count;

    public Helper( int discriminator, jakarta.servlet.jsp.JspContext jspContext, jakarta.servlet.jsp.tagext.JspTag _jspx_parent, int[] _jspx_push_body_count ) {
      super( discriminator, jspContext, _jspx_parent );
      this._jspx_parent = _jspx_parent;
      this._jspx_push_body_count = _jspx_push_body_count;
    }
    public boolean invoke0( jakarta.servlet.jsp.JspWriter out ) 
      throws java.lang.Throwable
    {
      out.write("\r\n");
      out.write("    ");
      if (_jspx_meth_layout_005fput_005f0(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("    ");
      if (_jspx_meth_layout_005fput_005f1(_jspx_parent, _jspx_page_context))
        return true;
      out.write('\r');
      out.write('\n');
      return false;
    }
    public boolean invoke1( jakarta.servlet.jsp.JspWriter out ) 
      throws java.lang.Throwable
    {
      out.write("\r\n");
      out.write("        <!-- Start of Main -->\r\n");
      out.write("        <main class=\"main login-page\">\r\n");
      out.write("            <!-- Start of Page Header -->\r\n");
      out.write("            <div class=\"page-header\">\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                    <h1 class=\"page-title mb-0\">My Account</h1>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- End of Page Header -->\r\n");
      out.write("\r\n");
      out.write("            <!-- Start of Breadcrumb -->\r\n");
      out.write("            <nav class=\"breadcrumb-nav\">\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                    <ul class=\"breadcrumb\">\r\n");
      out.write("                        <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${BASE_URL}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">Home</a></li>\r\n");
      out.write("                        <li>My account</li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("            </nav>\r\n");
      out.write("            <!-- End of Breadcrumb -->\r\n");
      out.write("            <div class=\"page-content\">\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                    <div class=\"login-popup\">\r\n");
      out.write("                        <div class=\"tab tab-nav-boxed tab-nav-center tab-nav-underline\">\r\n");
      out.write("                            <ul class=\"nav nav-tabs text-uppercase\" role=\"tablist\">\r\n");
      out.write("                                <li class=\"nav-item\">\r\n");
      out.write("                                    <a href=\"#sign-in\" class=\"nav-link active\">Sign In</a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li class=\"nav-item\">\r\n");
      out.write("                                    <a href=\"#sign-up\" class=\"nav-link\">Sign Up</a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                            <div class=\"tab-content\">\r\n");
      out.write("                                <div class=\"tab-pane active\" id=\"sign-in\">\r\n");
      out.write("                                    <div class=\"form-group\">\r\n");
      out.write("                                        <label>Username or email address *</label>\r\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" name=\"username\" id=\"username\" required>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"form-group mb-0\">\r\n");
      out.write("                                        <label>Password *</label>\r\n");
      out.write("                                        <input type=\"password\" class=\"form-control\" name=\"password\" id=\"password\" required>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"form-checkbox d-flex align-items-center justify-content-between\">\r\n");
      out.write("                                        <input type=\"checkbox\" class=\"custom-checkbox\" id=\"remember1\" name=\"remember1\" required=\"\">\r\n");
      out.write("                                        <label for=\"remember1\">Remember me</label>\r\n");
      out.write("                                        <a href=\"#\">Lost your password?</a>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <a href=\"#\" class=\"btn btn-primary\">Sign In</a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"tab-pane\" id=\"sign-up\">\r\n");
      out.write("                                    <div class=\"form-group\">\r\n");
      out.write("                                        <label>Your email address *</label>\r\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" name=\"email_1\" id=\"email_1\" required>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"form-group mb-5\">\r\n");
      out.write("                                        <label>Password *</label>\r\n");
      out.write("                                        <input type=\"password\" class=\"form-control\" name=\"password_1\" id=\"password_1\" required>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"checkbox-content login-vendor\">\r\n");
      out.write("                                        <div class=\"form-group mb-5\">\r\n");
      out.write("                                            <label>First Name *</label>\r\n");
      out.write("                                            <input type=\"text\" class=\"form-control\" name=\"first-name\" id=\"first-name\" required>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"form-group mb-5\">\r\n");
      out.write("                                            <label>Last Name *</label>\r\n");
      out.write("                                            <input type=\"text\" class=\"form-control\" name=\"last-name\" id=\"last-name\" required>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"form-group mb-5\">\r\n");
      out.write("                                            <label>Shop Name *</label>\r\n");
      out.write("                                            <input type=\"text\" class=\"form-control\" name=\"shop-name\" id=\"shop-name\" required>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"form-group mb-5\">\r\n");
      out.write("                                            <label>Shop URL *</label>\r\n");
      out.write("                                            <input type=\"text\" class=\"form-control\" name=\"shop-url\" id=\"shop-url\" required>\r\n");
      out.write("                                            <small>https://d-themes.com/wordpress/wolmart/demo-1/store/</small>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"form-group mb-5\">\r\n");
      out.write("                                            <label>Phone Number *</label>\r\n");
      out.write("                                            <input type=\"text\" class=\"form-control\" name=\"phone-number\" id=\"phone-number\" required>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"form-checkbox user-checkbox mt-0\">\r\n");
      out.write("                                        <input type=\"checkbox\" class=\"custom-checkbox checkbox-round active\" id=\"check-customer\" name=\"check-customer\" required=\"\">\r\n");
      out.write("                                        <label for=\"check-customer\" class=\"check-customer mb-1\">I am a customer</label>\r\n");
      out.write("                                        <br>\r\n");
      out.write("                                        <input type=\"checkbox\" class=\"custom-checkbox checkbox-round\" id=\"check-seller\" name=\"check-seller\" required=\"\">\r\n");
      out.write("                                        <label for=\"check-seller\" class=\"check-seller\">I am a vendor</label>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <p>Your personal data will be used to support your experience\r\n");
      out.write("                                        throughout this website, to manage access to your account,\r\n");
      out.write("                                        and for other purposes described in our <a href=\"#\" class=\"text-primary\">privacy policy</a>.</p>\r\n");
      out.write("                                    <a href=\"#\" class=\"d-block mb-5 text-primary\">Signup as a vendor?</a>\r\n");
      out.write("                                    <div class=\"form-checkbox d-flex align-items-center justify-content-between mb-5\">\r\n");
      out.write("                                        <input type=\"checkbox\" class=\"custom-checkbox\" id=\"remember\" name=\"remember\" required=\"\">\r\n");
      out.write("                                        <label for=\"remember\" class=\"font-size-md\">I agree to the <a  href=\"#\" class=\"text-primary font-size-md\">privacy policy</a></label>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <a href=\"#\" class=\"btn btn-primary sign-up\">Sign Up</a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <p class=\"text-center\">Sign in with social account</p>\r\n");
      out.write("                            <div class=\"social-icons social-icon-border-color d-flex justify-content-center\">\r\n");
      out.write("                                <a href=\"#\" class=\"social-icon social-facebook w-icon-facebook\"></a>\r\n");
      out.write("                                <a href=\"#\" class=\"social-icon social-twitter w-icon-twitter\"></a>\r\n");
      out.write("                                <a href=\"#\" class=\"social-icon social-google fab fa-google\"></a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </main>\r\n");
      out.write("        <!-- End of Main -->\r\n");
      out.write("    ");
      return false;
    }
    public boolean invoke2( jakarta.servlet.jsp.JspWriter out ) 
      throws java.lang.Throwable
    {
      out.write("\r\n");
      out.write("        <script type=\"text/javascript\">\r\n");
      out.write("            document.getElementsByClassName('sign-up').item(0).addEventListener('click',function () {\r\n");
      out.write("                let email = document.getElementById('email_1').value;\r\n");
      out.write("                let password = document.getElementById('password_1').value;\r\n");
      out.write("\r\n");
      out.write("                fetch(");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${BASE_URL}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("'login',{\r\n");
      out.write("                    method:'post',\r\n");
      out.write("                    headers:{'Content-Type':'application/json'\r\n");
      out.write("                    },\r\n");
      out.write("                    body:JSON.stringify({\r\n");
      out.write("                        email : email,\r\n");
      out.write("                        password : password,\r\n");
      out.write("                    })\r\n");
      out.write("                })\r\n");
      out.write("            });\r\n");
      out.write("\r\n");
      out.write("        </script>\r\n");
      out.write("    ");
      return false;
    }
    public void invoke( java.io.Writer writer )
      throws jakarta.servlet.jsp.JspException
    {
      jakarta.servlet.jsp.JspWriter out = null;
      if( writer != null ) {
        out = this.jspContext.pushBody(writer);
      } else {
        out = this.jspContext.getOut();
      }
      try {
        Object _jspx_saved_JspContext = this.jspContext.getELContext().getContext(jakarta.servlet.jsp.JspContext.class);
        this.jspContext.getELContext().putContext(jakarta.servlet.jsp.JspContext.class,this.jspContext);
        switch( this.discriminator ) {
          case 0:
            invoke0( out );
            break;
          case 1:
            invoke1( out );
            break;
          case 2:
            invoke2( out );
            break;
        }
        jspContext.getELContext().putContext(jakarta.servlet.jsp.JspContext.class,_jspx_saved_JspContext);
      }
      catch( java.lang.Throwable e ) {
        if (e instanceof jakarta.servlet.jsp.SkipPageException)
            throw (jakarta.servlet.jsp.SkipPageException) e;
        throw new jakarta.servlet.jsp.JspException( e );
      }
      finally {
        if( writer != null ) {
          this.jspContext.popBody();
        }
      }
    }
  }
}
