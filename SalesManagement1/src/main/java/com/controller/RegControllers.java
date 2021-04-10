package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.RegBean;
import com.dao.RegDao;
import com.daoImpl.RegDaoImpl;

/**
 * Servlet implementation class RegControllers
 */
public class RegControllers extends HttpServlet {
	private static final long serialVersionUID = 1L;
       


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
RegBean regBean=new RegBean();
regBean.setCompanyName(request.getParameter("compName"));
regBean.setUserName(request.getParameter("uName"));
regBean.setMob(request.getParameter("mob"));
regBean.setEmail(request.getParameter("email"));
regBean.setPwd(request.getParameter("pwd"));
RegDao regDao=new RegDaoImpl();
regDao.insertValues(regBean);
response.sendRedirect("register.jsp");
	}
}
