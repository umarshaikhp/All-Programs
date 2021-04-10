package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.RegisterBean;
import com.bean.UserBean;
import com.dao.RegisterDao;
import com.daoImpl.RegisterDaoImpl;

/**
 * Servlet implementation class RegisterController
 */
@WebServlet("/Register")
public class RegisterController extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	RegisterBean registerBean=new RegisterBean();
    registerBean.setFname(request.getParameter("fname"));
	//String name=request.getParameter("fname");
	//System.out.println(name);
     registerBean.setLname(request.getParameter("lname"));
     registerBean.setUsername(request.getParameter("username"));
     registerBean.setPassword(request.getParameter("pwd"));
     registerBean.setGender(request.getParameter("gender"));
     registerBean.setMno(request.getParameter("mno"));
     registerBean.setAno(request.getParameter("ano"));
     registerBean.setAddress(request.getParameter("address"));
     registerBean.setDte(request.getParameter("dte"));
    // System.out.println(registerBean.toString());
     RegisterDao registerDao=new RegisterDaoImpl();
     registerDao.registerAdd(registerBean);
     response.sendRedirect("Register.jsp");
	}
     
	}


