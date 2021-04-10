package com.DemoServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DemoServlet
 */
@WebServlet("/DemoServlet")
public class DemoServlet extends HttpServlet {


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
response.setContentType("text/html");
PrintWriter out = response.getWriter();

ServletConfig config = getServletConfig();

Enumeration<String> e = config.getInitParameterNames();
String string="";
while (e.hasMoreElements()) {
	string= e.nextElement();
	out.print("Name<br>:"+string);
	//out.print(config.getInitParameter(string));
	
}



		
		
	}

}
