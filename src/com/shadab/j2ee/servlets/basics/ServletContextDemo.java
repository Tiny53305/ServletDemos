package com.shadab.j2ee.servlets.basics;
import java.io.*;  
import javax.servlet.*;  
import javax.servlet.http.*;  


public class ServletContextDemo extends HttpServlet{  
public void doGet(HttpServletRequest req,HttpServletResponse res)  
throws ServletException,IOException  
{  
res.setContentType("text/html");  
PrintWriter out=res.getWriter();  
  
//creating ServletContext object  
ServletContext context=getServletContext();  
  
//Getting the value of the initialization parameter and printing it  
String country=context.getInitParameter("country");  
out.println("country is: "+country);  
  
out.close();  
  
}}  