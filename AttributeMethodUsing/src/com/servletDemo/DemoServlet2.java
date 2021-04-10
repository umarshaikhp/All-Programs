package com.servletDemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;





public class DemoServlet2 extends HttpServlet {


	protected void doGet(HttpServletRequest request, HttpServletResponse res) throws ServletException, IOException {
		  
		res.setContentType("text/html");  
		PrintWriter out=res.getWriter();  
		ServletContext context=getServletContext();  
		int n=(int)context.getAttribute("password");  
		  
		out.println("Welcome to "+n);  



}
}