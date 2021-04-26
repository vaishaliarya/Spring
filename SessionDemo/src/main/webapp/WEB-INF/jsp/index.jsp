<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<html>
<body>
<h2>Hello World!</h2>
<h1>User Login</h1>

  <form:form action="dologin" method="get" modelAttribute="user">
    <table>
      <tr>
        <td>Email</td>
        <td><form:input path="email" /></td>
      </tr>
      <tr>
        <td>Password</td>
        <td><form:password path="password" /></td>
      </tr>
      <tr>
        <td><button type="submit">Login</button></td>
      </tr>
    </table>
  </form:form>
 <a href="/">open login</a>
  <span style="color: red;">${message}</span>
</body>
</html>
