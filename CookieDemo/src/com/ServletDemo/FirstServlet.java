package com.ServletDemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstServlet
 */

public class FirstServlet extends HttpServlet {

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
response.setContentType("text/html");
PrintWriter out= response.getWriter();
System.out.println("kfmgfg");
System.out.println(request);
System.out.println(response);
System.out.println(request.getRequestDispatcher("index.jsp"));
String username=request.getParameter("username");
String password=request.getParameter("password");
out.print("welcome"+username);
Cookie ck=new Cookie("uname", "umar");
response.addCookie(ck);
out.print("<form action='servlet2' method='post'>");
out.print("<input type='submit' value='go'>");
out.print("</form>");

	}}


