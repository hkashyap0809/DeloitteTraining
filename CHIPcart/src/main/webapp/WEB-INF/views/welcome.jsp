<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
    <%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome To ChipCart </title>
<style>
body{

background-color: rgb(37,38,43);
font-color:"black";
}

<table>
<tr background-color:white>
<td><img src="a1.jpg" align="center" length="300" width="300"></td>
<td><h1 align="center" style="color:white;"> WELCOME TO CHIPCART</h1></td>
</tr>
</table>
</style>

</head>
<body>
<table>
<tr background-color:white>
<td><img src="a1.jpg" align="center" length="300" width="300"></td>
<td><h1 align="center" style="color:white;"> WELCOME TO CHIPCART</h1></td>
</tr>
</table>


<br/>
<div align="center">
<table>
<form:form modelAttribute="login" action="login">
<tr> <td style="color:white;"> USERNAME : </td> <td> <form:input type="text" path="username" required="required" /> </td></tr>
<tr> <td style="color:white;"> PASSWORD : </td> <td> <form:input type="password" path="password" required="required" /> </td> </tr>
<tr> <td align="center"> <input type="submit" value="LOGIN">
</form:form>
<br/><br/>
</table>
<table>
<tr><td style="color:white";> Not a member ? Register</td></tr> 

<form:form modelAttribute="signup" action="signup">
<tr> <td style="color:white;"> NAME : </td> <td> <form:input type="text" path="customerName" required="required" /> </td> </tr>
<tr> <td style="color:white;"> EMAIL-ID : </td> <td> <form:input type="email" path="emailId" required="required" /> </td> </tr>
<tr> <td style="color:white;"> USERNAME : </td> <td> <form:input type="text" path="username" required="required" /> </td></tr>
<tr> <td style="color:white;"> PASSWORD : </td> <td> <form:input type="password" path="password" required="required" /> </td> </tr>
<tr> <td align="center"> <input type="submit" value="SIGN-UP"></td></tr>
</form:form>
</table>
</div>




</body>
</html>