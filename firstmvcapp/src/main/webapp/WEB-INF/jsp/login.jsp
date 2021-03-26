<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>    
<html>
<body>
<h2>Hello World! welcome ${msg }</h2>
<form action="login" method="post">
<input type="text" name="userId" placeholder="enter user name">
<input type="text" name="pwd" placeholder="enter user pwd">
<button>login</button>
</form>
</body>
</html>