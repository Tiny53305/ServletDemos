package com.shadab.j2ee.servlets.filters;

import java.io.IOException;  
import java.io.PrintWriter;  
  
import javax.servlet.*;  
  
public class HttpFilterDemo implements Filter{  
  
public void init(FilterConfig arg0) throws ServletException {}  
      
public void doFilter(ServletRequest req, ServletResponse resp,  
    FilterChain chain) throws IOException, ServletException {  
          
    PrintWriter out=resp.getWriter();  
    out.print("filter is invoked");  
          
    chain.doFilter(req, resp);//sends request to next resource  
          
    out.print("filter completed");  
    }  
    public void destroy() {}  
}  