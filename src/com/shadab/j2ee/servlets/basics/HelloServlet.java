package com.shadab.j2ee.servlets.basics;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
public class HelloServlet extends HttpServlet {

    
	 public void doGet (HttpServletRequest req,
            HttpServletResponse res)
throws ServletException, IOException
{
PrintWriter out = res.getWriter();

out.println("<html><head></head><body>");
out.println("Hello This is First Page</body></html>");
out.close();
}

}
