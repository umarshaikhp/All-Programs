<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Page</title>
</head>
<body>
<form action="Register" method="post" >
<table align="center" border="1">
<tr>
<td>First Name</td>
<td><input name="fname"></td>
</tr>
<tr>
<td>Last Name</td>
<td><input name="lname"></td>
</tr>

<tr>
<td>Username</td>
<td><input type="email" name="username"></td>
</tr>
<tr>
<td>Password</td>
<td><input type="password" name="pwd"></td>
</tr>
<tr>
<td>Gender</td>
<td><input name="gender"></td>
</tr>
<tr>
<td>Mobile No</td>
<td><input name="mno"></td>
</tr>
<tr>
<td>Adhar No</td>
<td><input name="ano"></td>
</tr>
<tr>
<td>Address</td>
<td><input name="address"></td>
</tr>

<tr>
<td>D.O.B</td>
<td><input type="date" name="dte"></td>
</tr>
<tr>
<td></td>
<td><input type="submit" name="save"></td>
</tr>

</table>
</form>

</body>
</html>