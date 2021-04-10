package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.SaleBean;
import com.dao.SaleDao;
import com.daoImpl.SaleDaoImpl;
import com.sun.javafx.binding.SelectBinding.AsLong;

/**
 * Servlet implementation class SaleController
 */
public class SaleController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
SaleBean saleBean=new SaleBean();
saleBean.setCompName(request.getParameter("CompName"));
saleBean.setMaterial(request.getParameter("material"));
saleBean.setQuantity(Float.parseFloat(request.getParameter("quantity")));
saleBean.setRate(Float.parseFloat(request.getParameter("rate")));
saleBean.setAmount(Float.parseFloat(request.getParameter("amount")));
SaleDao saleDao=new SaleDaoImpl();
saleDao.insertValues(saleBean);
response.sendRedirect("sale.jsp");
	}

}
