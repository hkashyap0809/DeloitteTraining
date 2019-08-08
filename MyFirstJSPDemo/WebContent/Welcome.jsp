<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome</title>
</head>
<body>

<form action="Operation.jsp">
Enter two numbers<br/>
Number 1 : <input type="number" name="number1" placeholder="enter first number "> <br/> <br/>
Number 2 : <input type="number" name="number2" placeholder="enter second number" > <br/> <br/>
<input type="submit" name="operation" value="addition">
<input type="submit" name="operation" value="subtraction">
<input type="submit" name="operation" value="multiplication">
<input type="submit" name="operation" value="division">
</form>
</body>
</html>