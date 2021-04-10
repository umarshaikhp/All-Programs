<%@page import=" javax.servlet.http.HttpServletRequest;" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>login</title>
</head>
<body>
<%String  k=(String) request.getAttribute("password");
if(k==null){
	RequestDispatcher dis=request.getRequestDispatcher("Login.jsp");
	
	
	response.setHeader("Cache-Control", "no-cache");
response.setHeader("Cache-Control", "no-store");
response.setHeader("pragma", "no-cache");
response.setDateHeader("Expires", 0);
}%>


<form action="LoginController" method="post">


<table align="left" border="1">


<tr>
<td>Username</td>
<td><input type="email" name="uname"></td>
</tr>
<tr>
<td>Password</td>
<td><input type="password" name="pwd"></td>
</tr>
<tr>
<td></td>
<td><input type="submit" value="login"></td>
</tr>
</table>
</form>

</body>
</html>