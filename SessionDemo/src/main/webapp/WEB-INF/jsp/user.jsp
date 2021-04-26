<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>User profile Page</h1>
  <table>
    <tr>
      <td>First Name</td>
      <td>${user.fname}</td>
    </tr>
    <tr>
      <td>Middle Name</td>
      <td>${user.mname}</td>
    </tr>
    <tr>
      <td>Last Name</td>
      <td>${user.lname}</td>
    </tr>
    <tr>
      <td>Age</td>
      <td>${user.age}</td>
    </tr>
  </table>
  

</body>
</html>