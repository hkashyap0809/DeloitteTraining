<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
     <%@ page import="java.util.*" %>
    <%@ page import="com.sonar.model.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Address Page</title>
<style>
body{
background-color: rgb(37,38,43);
font-color:white;
}

</style>
</head>
<body>
<h2 align="center" style="color:white">Fill the Billing Details</h2>

<table style="color:white" align="center">
<form:form modelAttribute="billing" action="billingDetails">
<tr> <td> HOUSE NUMBER: </td> <td> <form:input path="houseNumber" name="houseNumber" required="required"/></td> </tr>
<tr> <td> CITY : </td> <td> <form:input path="city" name="city" required="required" /></td> </tr>
<tr> <td> STATE : </td> <td> <form:input path="state" name="state" required="required" /></td> </tr>
<tr> <td> PIN-CODE : </td> <td> <form:input path="pincode" name="pincode" required="required" /></td> </tr>
<tr> <td> CONTACT NUMBER : </td> <td> <form:input path="contactNumber" name="contactNumber" required="required"/></td> </tr>
<tr> <td> <input type="submit" value="save"></td> </tr>
</form:form>
</table>	
</body>
</html>