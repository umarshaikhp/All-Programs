<%@page import="java.util.Iterator"%>
<%@page import="com.bean.UserBean"%>
<%@page import="java.util.List"%>
<%@page import="com.daoImpl.InsertDaoImpl"%>
<%@page import="com.dao.InsertDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Index page</title>
</head>
<body>
<h1 style="color:red" align="center">welcome student</h1>
<script type="text/javascript">
function update(id,name,email,password,contact,age){
	document.getElementById('id').value=id;
	document.getElementById('uname').value=name;
	document.getElementById('email').value=email;
	document.getElementById('pwd').value=password;
	document.getElementById('contact').value=contact;
	document.getElementById('age').value=age;
	document.getElementById('submit').value="update";

}
</script>
<form action="InsertController" method="post">
<table align="center" border="20">
<tr>
<td>id</td>
<td><input type="text" name="id"  id="id" readonly="readonly"></td>
</tr>
<tr>
<td>Username</td>
<td><input type="text" name="uname" id="uname"></td>
</tr>
<tr>
<td>Email</td>
<td><input type="email" name="email" id="email"></td>
</tr>
<tr>
<td>Password</td>
<td><input type="password" name="pwd" id="pwd"></td>
</tr>
<tr>
<td>Contact</td>
<td><input type="text" name="contact" id="contact"></td>
</tr>
<tr>
<td>Age</td>
<td><input type="text" name="age" id="age"></td>
</tr>
<tr>
<td></td>
<td><input type="submit" name="submit" value="save" id="submit"></td>
</tr>
<tr>  
<td>
<a  href="Login.jsp">logout</a>
</td>
</tr>
</table>
<table align="left" border="10" ">
<tr>
<th>ID</th>
<th>USERNAME</th>
<th>Email</th>
<th>Password</th>
<th>Contact</th>
<th>Age</th>
</tr>
<%
InsertDao insertDao=new InsertDaoImpl();
List<UserBean> list=insertDao.getvalues();
Iterator<UserBean> itr=list.iterator();
UserBean ubean=null;
while(itr.hasNext()){
	ubean=itr.next();
%>
<tr>
<td><%=ubean.getId() %></td>
<td><%=ubean.getUname() %></td>
<td><%=ubean.getEmail() %></td>
<td><%=ubean.getPwd() %></td>
<td><%=ubean.getContact() %></td>
<td><%=ubean.getAge() %></td>
<td><a href="#" onclick="update('<%=ubean.getId() %>','<%=ubean.getUname() %>','<%=ubean.getEmail()%>','<%=ubean.getPwd() %>','<%=ubean.getContact() %>','<%=ubean.getAge() %>')">update</a></td>
<td><a href="InsertController?id=<%=ubean.getId() %>">Delete</a></td>
</tr>	
<% }%>

</table>
</form>

<%


String k=(String) request.getAttribute("password");
if(k==null){
	RequestDispatcher dis=request.getRequestDispatcher("Login.jsp");
	dis.include(request, response);
}
out.println(k);
response.setHeader("Cache-Control", "no-cache");
response.setHeader("Cache-Control", "no-store");
response.setHeader("pragma", "no-cache");
response.setDateHeader("Expires", 0);

%>
</body>
</html>