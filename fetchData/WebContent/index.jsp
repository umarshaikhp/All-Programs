<%@page import="java.util.Iterator"%>
<%@page import="com.bean.Bean"%>
<%@page import="java.util.List"%>
<%@page import="com.daoimpl.DaoImpl"%>
<%@page import="com.dao.Dao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <script type="text/javascript">
    function update(name,password){
		document.getElementById('name').value=name;
		document.getElementById('password').value=password;
    document.getElementById('submit').value="update";
    }
</script>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-color:red">
<form action="Controller" method="post">   
<table style="background-color:blue size=5px">
<tr><td>Username</td><td><input type="text" id="name" name="Username"></td></tr>
<tr><td>Password</td><td><input type="password" id="password" name="Password"></td></tr>
<tr><td><input type="submit" id="submit" name="btn"  value="submit">
</table>
<table align="center" border="1">
<th>Username</th>
<th>Password</th>
<%
Dao d1=new DaoImpl();
List<Bean>list=d1.fetch();
Iterator<Bean> itr=list.iterator();
Bean bean1=null;
while(itr.hasNext()){
	bean1= itr.next();
	%>
<tr>
<td><%=bean1.getName()%></td>
<td><%=bean1.getPassword() %></td>
<td> <a href='#' onclick="update('<%=bean1.getName() %>','<%=bean1.getPassword()%>')">update</a></td>
</tr>

<% } %>
</table>
</form>

</body>
</html>