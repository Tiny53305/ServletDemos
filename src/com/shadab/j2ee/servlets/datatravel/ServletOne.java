package com.shadab.j2ee.servlets.datatravel;

import java.io.*;  
import javax.servlet.*;  
import javax.servlet.http.*;  
public class ServletOne extends HttpServlet{  
public void doGet(HttpServletRequest req,HttpServletResponse res)  
{  
	PrintWriter out=null;
try{  
  
res.setContentType("text/html");  
 out=res.getWriter();  
  
ServletContext context=getServletContext();  
context.setAttribute("Name","Shadab");  
  
out.println("Welcome to first servlet");  
out.println("<a href='servlettwo'>push data to another servlet</a>");  
out.close();  
  
}catch(Exception e){
	
	out.println(e);
	
}  
  
}}  
