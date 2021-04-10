package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.RegisterBean;
import com.dao.LoginDao;
import com.daoImpl.LoginDaoImpl;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    PrintWriter out = response.getWriter();                

		RegisterBean registerBean=new RegisterBean();

   // registerBean.setUsername(request.getParameter("uname"));
   // registerBean.setPassword(request.getParameter("pwd"));
    String username=request.getParameter("uname");
    String password=request.getParameter("pwd");
    registerBean.setUsername(username);
    registerBean.setPassword(password);
    System.out.println(username+" "+password);
    LoginDao loginDao=new LoginDaoImpl();
    if(loginDao.checkauthentication(registerBean)) {
    	//response.sendRedirect("crud.jsp");
			
			  RequestDispatcher dis=request.getRequestDispatcher("crud.jsp");
			  request.setAttribute("password", password);
			  
			  dis.forward(request, response);
			  
    	
    }
    else {

    	//response.sendRedirect("failed.jsp");

    	  out.println("<b><font color='red'>This  name is Not A Valid Name. Try Again!</font></b>");
       RequestDispatcher dis=request.getRequestDispatcher("Login.jsp");
       dis.include(request, response);              
    }
	}

}
