<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    <%@ taglib uri="http://java.sun.com/jstl/core" prefix="core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Product</title>
<style>
body{
background-color: rgb(37,38,43);
font-color:white;
}
</style>
</head>

<body style="color:white" align="center">
<h2> ADD A PRODUCT</h2>
<table align="center">
<form:form modelAttribute="addProduct" action="addProduct">
<tr> <td>PRODUCT NAME : </td> <td> <form:input path="productName" name="productName" required="required" /></td> </tr>
<tr> <td>PRODUCT PRICE : </td> <td> <form:input path="productPrice" name="productPrice" required="required" /></td> </tr>
<tr> <td align="center"> <input type="submit" value="ADD PRODUCT"></td></tr>
</form:form>
</table>

</body>
</html>