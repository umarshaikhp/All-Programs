package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.SaleTransectionBean;
import com.dao.SaleTransectionDao;
import com.daoImpl.SaleTransectionDaoImpl;

/**
 * Servlet implementation class SaleTransectionController
 */
//@WebServlet("SaleTransectionController")
public class SaleTransectionController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		SaleTransectionBean saleTransectionBean=new SaleTransectionBean();
		String a=request.getParameter("CompName");
		System.out.println(a);
		
		saleTransectionBean.setCompName(request.getParameter("CompName"));
		saleTransectionBean.setTakeFrom(request.getParameter("takeFrom"));
		saleTransectionBean.setPlace(request.getParameter("place"));
		saleTransectionBean.setAmount(request.getParameter("amount"));
		SaleTransectionDao saleTransectionDao=new SaleTransectionDaoImpl();
		saleTransectionDao.inserValues(saleTransectionBean);
		response.sendRedirect("saleTransection.jsp");
			}


	}


