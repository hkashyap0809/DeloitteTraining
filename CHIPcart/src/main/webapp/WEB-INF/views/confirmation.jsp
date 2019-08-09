<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*"%>
<%@ page import="com.sonar.model.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Order Confirmation</title>
<style>
body{
background-color: rgb(37,38,43);
font-color:white;
}
</style>
</head>
<body style="color:white">
<h2> BILLING DETAILS</h2>
	<%Login login = (Login)session.getAttribute("loginDetails");
	out.println(login.getCustomerName()+"<br/>");
	out.println(login.getEmailId()+"<br/>");
	%>
	<% Address address = (Address)session.getAttribute("billingDetails");
		out.println(address.getHouseNumber());
		out.println(address.getCity()+"<br/>");
		out.println(address.getState());
		out.println("("+address.getPincode()+")<br/>");
		out.println("Contact Number :"+address.getContactNumber()+"<br/>");
%>
	<%!ArrayList<Cart> cartList;%>
	<%!int totalBillAmount = 0;%>
	<%
		cartList = (ArrayList<Cart>) session.getAttribute("cartDetail");
	%>
	<table>
	<h3> Order Details</h3>
		<%
		totalBillAmount=0;
			out.println("<tr><td>PRODUCT NAME &nbsp;&nbsp;&nbsp;&nbsp;</td><td> &nbsp;&nbsp;&nbsp;&nbsp; PRODUCT PRICE </td><td>&nbsp;&nbsp;&nbsp;&nbsp; QUANTITY");
			for (Cart cart : cartList) {
				out.println("<tr><td>" + cart.getProductName() + "</td><td>&nbsp;&nbsp;&nbsp;&nbsp;" + cart.getProductprice() + "</td><td>&nbsp;&nbsp;&nbsp;&nbsp;"+cart.getQuantity()+"</td></tr>");
				totalBillAmount += cart.getProductprice()*cart.getQuantity();
			}
		%>
		<tr>
			<td>Total Bill Amount :</td>
			<td><%=totalBillAmount%></td>
		</tr>
	</table>
	
	<table>
	<a href=<core:url value='/logout'/>><font color="yellow">Pay Now and Logout</font></a>
	</table>

</body>
</html>