<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@include file="./main.jsp"%>


<title>add Details</title>
<script type="text/javascript">
function validateform()
{
	window.alert("hiii");

	var firstpassword=document.myForm.password.value;  
	var secondpassword=document.myForm.confirmPassword.value;  
	  
	if(firstpassword==secondpassword){  


	return true;  
	}  
	else{  
	alert("password must be same!");  


	return false;  
	}  
}

</script>
</head>
<body>
	<div class="container mt-1">

		<div class="row col-md-6 offset-md-3 container text-center">

			<h1 class="text-center mb-3 ml-3">Fill Details</h1>

			<form action="formHandle" name="myForm" method="post"
				onsubmit="return validateform();">


				<div class="form-group mt-0">
					<label for="firstName">First Name</label> <input type="text"
						class="form-control" id="firstName" name="firstName"
						placeholder="Enter First Name" autocomplete="off"
						> <span id="firstNameError"></span>
				</div>

				<div class="form-group mb-0">
					<label for="lastName">Last Name</label> <input type="text"
						class="form-control" id="lastName" name="lastName"
						placeholder="Enter Last Name" autocomplete="off"
						> <span id="lastNameError"
						style="display: none"></span>
				</div>


				<div class="form-group">
					<label for="fatherName">Father Name</label> <input type="text"
						class="form-control" id="fatherName" name="fatherName"
						placeholder="Enter Father Name" autocomplete="off"
						> <span id="fatherNameError"
						style="display: none"></span>
				</div>

				<div class="form-group">
					<label for="age">Age</label> <input type="text"
						class="form-control" id="age" name="age" autocomplete="off"
						placeholder="Enter Age">
				</div>

				<div class="form-group">
					<label for="address">Address</label>
					<textarea rows="3" type="text" class="form-control" id="address"
						name="address" placeholder="Enter Address"></textarea>
				</div>


				<div class="form-group">
					<label for="email">Email</label> <input type="text"
						class="form-control" id="email" name="email"
						placeholder="Enter Email" autocomplete="off">
				</div>


				<div class="form-group">
					<label for="password">Password</label> <input type="password"
						class="form-control" id="password" name="password"
						placeholder="Enter Password">
				</div>

				<div class="form-group">
					<label for="confirmPassword">Confirm Password</label> <input
						type="password" class="form-control" id="confirmPassword"
						name="confirmPassword" placeholder="Enter Confirm Password"
						>
				</div>

				<a href="success" class="btn btn-primary mt-3">Show Details</a>

				<button type="submit" class="btn btn-primary mt-3">Submit</button>

			</form>
		</div>
	</div>


</body>
</html>