package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.Bean;
import com.dao.Dao;
import com.daoimpl.DaoImpl;

/**
 * Servlet implementation class Controller
 */
@WebServlet("/Controller")
public class Controller extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
Bean bean=new Bean();
bean.setPassword(request.getParameter("Password"));

Dao dao=new DaoImpl();
dao.delete(bean);
	}
	
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
String name=request.getParameter("Username");
String password=request.getParameter("Password");
System.out.println(name+" "+password);
Bean obj=new Bean();
obj.setName(name);
obj.setPassword(password);
Dao d=new DaoImpl();
d.insert(obj);



	}

}
