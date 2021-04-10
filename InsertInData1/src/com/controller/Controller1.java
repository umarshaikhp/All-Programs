package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

import com.mysql.cj.protocol.a.MysqlBinaryValueDecoder;

/**
 * Servlet implementation class Controller
 */
//@webServelet("/Controller")

public class Controller1 extends HttpServlet {

protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	System.out.println(request);
		String name=request.getParameter("username");
String password=request.getParameter("password");
request.setAttribute("name", name);

//PrintWriter out = response.getWriter();  
//out.println("<html><body><h1> My name Is"+name+ "<html><body><h1>");
//response.sendRedirect("Controller1");



		
		
	}

}
