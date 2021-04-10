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
 * Servlet implementation class LogoutServlet
 */
//@WebServlet("/LogoutServlet")

public class LogoutServlet extends HttpServlet {


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
response.setContentType("application/pdf");

PrintWriter out=response.getWriter();

request.getRequestDispatcher("link.html").include(request, response);

//Cookie ck=new Cookie("name", "");

//response.addCookie(ck);


Cookie ck1[]=request.getCookies();
if(ck1 !=null)
{
	for(Cookie c:ck1) {
		c.setMaxAge(0);
		c.setValue("");
		c.setPath("/");
		//response.addCookie(c);
	}
}
out.print("<h1>welcome </h1>"+ck1[0].getValue());

out.print("you are successfully logged out");

	}

}
