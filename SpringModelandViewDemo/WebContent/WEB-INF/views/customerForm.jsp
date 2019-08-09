<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="addCustomer" method="post">

		<table cellspacing="10" cellpadding="10" align="center">
			<tr>
				<td>Customer Id</td>
				<td><input type="text" id="customerId" name="customerId"></td>
			</tr>
			<tr>
				<td>Customer Name</td>
				<td><input type="text" id="customerName" name="customerName"></td>
			</tr>
			<tr>
				<td>Customer Address</td>
				<td><input type id="customerAddress" name="customerAddress"></td>
			</tr>

			<tr>
				<td>Bill Amount</td>
				<td><input type="text" id="billAmount" name="billAmount"></td>
			</tr>

			<tr>
				<td><input type="submit" value="SaveCustomer"></td>
				<td><input type="reset"></td>
			</tr>
		</table>
	</form>
</body>
</html>