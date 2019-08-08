<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% String operation = request.getParameter("operation");
 int num1 =Integer.parseInt(request.getParameter("number1"));
int num2 = Integer.parseInt(request.getParameter("number2"));
out.println("<br/>the addition of the numbers is "+(num1+num2));
out.println("<br/>the subtraction of the numbers is "+(num1-num2));
out.println("<br/>the multiplication of the numbers is "+(num1*num2));
out.println("<br/>the division of the numbers is "+(num1/num2));
%>
</body>
</html>