package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.InsertDao;
import daoImpl.InsertDaoImpl;
import pojo.UserBean;

/**
 * Servlet implementation class InsertController
 */
@WebServlet("/InsertController")
public class InsertController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


	}



	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
UserBean userBean=new UserBean();
InsertDao insertDao=new InsertDaoImpl();
String uname=request.getParameter("uname");
String pwd=request.getParameter("pwd");
String email=request.getParameter("email");
userBean.setUname(uname);
userBean.setPwd(pwd);
userBean.setEmail(email);
userBean.setContact(request.getParameter("contact"));
userBean.setAge(Integer.parseInt(request.getParameter("age")));
String button=request.getParameter("submit");
if (button.equals("Save")) {
	insertDao.insertValues(userBean);
	
}
else if (button.equals("update")) {
	insertDao.updateValues(userBean);
	System.out.println(button);
	
}
response.sendRedirect("crud.jsp");




	}

}
