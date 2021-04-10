package com.servletDemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DemoServlet2
 */

public class DemoServlet1 extends HttpServlet {


	protected void doGet(HttpServletRequest request, HttpServletResponse res) throws ServletException, IOException {
     res.setContentType("text/html");
     PrintWriter out=res.getWriter();
     ServletContext context=getServletContext();
     context.setAttribute("password", 1234);
     out.println("welcome to first servlet");
     out.println("<a href='servlet2'>visit</a>" );
     




	}

}
