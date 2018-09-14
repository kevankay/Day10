
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<form action="login" method="post">
<body bgcolor="Bisque" style="text-align:center" >
 
 <img src = "images/icicilogo.jpg" width="150" height="100" align="left"/>


	<h1>Login to your account</h1>
	
	<br><br>
		<label> Customer Email Id: </label> 
		<input type="email" name="customerEmail" required /> 
		<br> <br>
		<label> Password: </label> 
		<input type="password" name="customerPassword" size="10" required /> 
		<br> <br>
		<input type="submit" name="Login">
		<br><br>

<%@ include file = "footer.jsp" %>
</body>
</html>