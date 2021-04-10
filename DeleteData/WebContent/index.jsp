<%@page import="java.util.Iterator"%>
<%@page import="com.bean.Bean"%>
<%@page import="java.util.List"%>
<%@page import="com.daoimpl.DaoImpl"%>
<%@page import="com.dao.Dao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-color:powderblue;">
<form action="Controller" method="post">
<table>
<tr><td>Username</td><td><input type="text" name="Username"></td></tr>
<tr><td>Password</td><td><input type="password" name="Password"></td></tr>
<tr><td><input type="submit" value="submit"></td></tr>
</table style="width:500%" >
<table align="center" border="1">

<th style="color:red">Username</th>
<th style="color:blue">Password</th>
<%
Dao dao=new DaoImpl();
List<Bean>list=dao.fetch();
Iterator<Bean> itr=list.iterator();
Bean bean=null;
while(itr.hasNext()){
	bean=itr.next();
%>
<tr>
<td><%=bean.getName() %></td>
<td><%=bean.getPassword() %></td>
<td><a href="Controller?Password=<%=bean.getPassword() %>">delete</a></td>
</tr>



<%} %>

</table>
</form>

</body>
</html>