<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<img src = "images/icicilogo.jpg" width="150" height="80" align="left"/>
<br><br><br><br><br>
<%@ include file="header1.jsp" %>
<title>Check Balance</title>
</head>

<body bgcolor ="Bisque" style="text-align:center">
  
   
 <br><br><br><br><br>
<h1>Your current account balance is:  ${sessionScope.customer.customerAccount.accountBalance}</h1>		

</body>
</html>
