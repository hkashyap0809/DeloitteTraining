<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
	Login <br/>
	<form action=validate.jsp>
	Username : <input type="text" name="username"> <br/> <br/>
	Password : <input type="password" name="password"> <br/> <br/>
	<input type="submit" value="Login">
	</form>

<% String errorMessage = (String)session.getAttribute("errMsg");
if(errorMessage==null)
	errorMessage="";%>
	<br/>
	<font color="red"><%=errorMessage %></font>
</body>
</html>