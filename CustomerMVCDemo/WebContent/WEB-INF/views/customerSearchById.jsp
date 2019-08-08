<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
		<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Search Customer By ID</h2>

	<f:form action="searchCustomerByIdNEW.do">
		<table cellspacing="10" cellpadding="10" align="center">
			<tr>
				<td>Customer Id</td>
				<td><f:input type="text" path="customerId" id="customerId" name="customerId"></f:input></td>
			</tr>
			<tr>
				<td><input type="submit" value="Search"></td>
				<td><input type="reset" value="clear"></td>
			</tr>
			<tr>
				<td>Customer Name</td>
				<td><f:input type="text" path="customerName" id="customerName" name="customerName"></f:input></td>
			</tr>
			<tr>
				<td>Customer Address</td>
				<td><f:input type="text" path="customerAddress" id="customerAddress" name="customerAddress"></f:input></td>
			</tr>

			<tr>
				<td>Bill Amount</td>
				<td><f:input type="text" path="billAmount" id="billAmount" name="billAmount"></f:input></td>
			</tr>

			<tr>
				<td><input type="submit" value="SaveCustomer"></td>
				<td><input type="reset"></td>
			</tr>
		</table>
	</f:form>
	<%@page import="java.io.*" %>
	<%
	PrintWriter pw = response.getWriter();
	pw.write("P");%>
	
	<%pw.write("Q"); %>


</body>
</html>