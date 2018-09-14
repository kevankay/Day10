<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home page</title>
</head>
<body bgcolor ="Bisque" style="text-align:center">
  
   <img src = "images/icicilogo.jpg" width="150" height="80" align="left"/>
   <br><br><br>
   <body style="text-align:right">
   <h1>Welcome ${sessionScope.customer.customerName}</h1>
   </body>
 <%@ include file = "header1.jsp" %>
      
       
        
       <%@ include file = "footer.jsp" %>



</body>
</html>