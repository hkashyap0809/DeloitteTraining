<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Validation</title>
</head>
<body>
<% String username = request.getParameter("username");
String password = request.getParameter("password");
if((username.equals("harshit"))&& (password.equals("kashyap")))
{
%>
<jsp:forward page="success.jsp"></jsp:forward>
<%}
else{
session.setAttribute("errMsg","Incorrect login credentials");
response.sendRedirect("Login.jsp");
}%>

</body>
</html>