package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */

public class LoginServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
response.setContentType("text/html");
PrintWriter out=response.getWriter();

request.getRequestDispatcher("link.html").include(request, response);

String username=request.getParameter("username");
String password=request.getParameter("password");
if (password.equals("123")) {
	out.print("<you are successfully logged in!>");
	out.print("<br>Welcome,"+username);
	Cookie ck=new Cookie("password","123");
	response.addCookie(ck);
}
	else {
		out.print("sorry username or password error!");
		request.getRequestDispatcher("login.html").include(request, response);
	}
	}
	


	}


