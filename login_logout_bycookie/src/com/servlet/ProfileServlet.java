package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.jar.Attributes.Name;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ProfileServlet
 */

public class ProfileServlet extends HttpServlet {


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
response.setContentType("text/html");
PrintWriter out=response.getWriter();


request.getRequestDispatcher("link.html").include(request, response);
Cookie ck[]=request.getCookies();
if(ck!=null) {
	String name=ck[0].getValue();
	
if(!name.equals("")||name!=null) {
	out.print("<b>welcome to profile</b>");
	out.print("<br>Welcome "+name);
}
else {
	out.print("please login first");
	request.getRequestDispatcher("login.html").include(request, response);
	
}



	}
}
}
