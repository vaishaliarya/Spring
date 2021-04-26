<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <h1>Login Success Page</h1>
  <p>You are logged in with email ${user.email}.</p>
 
  <!-- Click here to view the session attributes -->
  
  <c:set var="contextPath" value="${pageContext.request.contextPath}"/>
  <a href="${contextPath}/info">session data</a>
 
 

  
 
</body>

</html>