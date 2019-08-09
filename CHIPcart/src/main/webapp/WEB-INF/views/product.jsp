<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page import="java.util.*"%>
<%@ page import="com.sonar.model.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product Catalog</title>
<style>
body{
background-color: rgb(37,38,43);
}

</style>
</head>
<body align="center" style="color:white;">

	<%!Login loginDetails;
	ArrayList<Product> productList;%>

	<h1 align="center">PRODUCTS LISTED</h1>

	<%
		loginDetails = (Login) session.getAttribute("loginDetails");
		out.println("<br/> <br/> HI " + loginDetails.getCustomerName()+"<br/> <br/>");
	%>

	<%
		productList = (ArrayList<Product>) session.getAttribute("productList");
	%>
<table align="center" border="1s" >
	<c:forEach items="${productList}" var="product">
		<tr>
			<td align="center" border="1">${product.productName}</td>
			<td align="center" border="1">${product.productPrice}</td>
			<td align="center" border="1"><a href=<c:url value='/add/${product.productId}/${loginDetails.getCustomerId()}'/> style="color:green;">Add to cart </a></td>
		</tr>
	</c:forEach>
	
	<td><a href=<c:url value='/billing'/>><font color="yellow">Proceed to Billing Details</font></a></td>
	</table>
	
	
</body>
</html>