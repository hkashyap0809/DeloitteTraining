<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%!int num1,num2; %>
<% num1 = Integer.parseInt(request.getParameter("num1"));
	num2 = Integer.parseInt(request.getParameter("num2"));
	int total = num1+num2;
	session.setAttribute("total" , total);
%>
	<jsp:forward page ="result.jsp"></jsp:forward>

</body>
</html>