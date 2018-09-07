<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete Employee Page</title>
</head>
<body bgcolor="cyan">
<h1>Delete Employee</h1>
   <hr>
   <form action="deleteEmployee" method="post">
      <label>Employee ID: </label>
      <input type="number" name="empId" required/>
   </form>
      <br><br>
    <input type="submit" value="Delete Employee"/>
</body>
</html>