<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>login</title>
</head>
<body>
<form action="LoginController" method="post">
        <table align="center" border="1">
              
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
                    <td><input type="submit" value="Login"></td>
             </tr>        
                   
        </table>

</form>

</body>
</html>