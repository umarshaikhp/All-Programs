<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 		<form action="InsertController" method="post">
		<table align="center" border="1">
			<tr>
				<td>id</td>
				<td><input type="text" name="id" id="id" readonly="readonly"></td>
			</tr>

			<tr>
				<td>username</td>
				<td><input type="text" name="uname" id="uname"></td>
			</tr>
			<tr>
				<td>password</td>
				<td><input type="password" name="pwd" id="password"></td>
			</tr>
			<tr>
				<td>email</td>
				<td><input type="email" name="email" id="email"></td>
			</tr>
			<tr>
				<td>contact</td>
				<td><input type="text" name="contact" id="contact"></td>
			</tr>
			<tr>
				<td>age</td>
				<td><input type="text" name="age" id="age"></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Save" name="submit" id="submit"></td>
			</tr>

		</table>
	</form>
</body>
</html>