<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>  

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="resources/css/my-test.css"
    rel="stylesheet">

<title>Insert title here</title>
</head>
<body>
<h1>Welcome Page </h1>
<form:form action="login" method="post" modelAttribute="EmpModel">
EmpName: <form:input path="empname" />
EmpId: <form:input path="empid" />
<form:button>Login</form:button>
</form:form>

</body>
</html>