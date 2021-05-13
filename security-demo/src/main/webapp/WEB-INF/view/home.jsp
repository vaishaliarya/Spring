<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>security demo app</title>
</head>
<body>
<h2> Security Demo App</h2>

<!-- display user name and role -->
	
<hr>
<p> 
 <!-- Displaying the user name -->
 User: <security:authentication property="principal.username"/>
 <br>
 <br>
 <!-- To display the user roles -->
 Roles: <security:authentication property="principal.authorities"/>
</p>


<hr>



<form:form action="logout" method="post">
<input type="submit" value="Logout"/>
</form:form>
</body>
</html>