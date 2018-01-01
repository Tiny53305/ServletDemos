package com.shadab.j2ee.servlets.datatravel;


import java.io.*;  
import javax.servlet.*;  
import javax.servlet.http.*;  
public class ServletTwo extends HttpServlet{  
public void doGet(HttpServletRequest req,HttpServletResponse res)  
{  
	
	PrintWriter out=null;
try{  
  
res.setContentType("text/html");  
 out=res.getWriter();  
  
ServletContext context=getServletContext();  
String name=(String)context.getAttribute("Name");  
  
out.println("Name is: "+name);  
out.close();  
  
}catch(Exception e){out.println(e);}  
}}  