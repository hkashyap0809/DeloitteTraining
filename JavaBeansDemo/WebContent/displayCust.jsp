<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="cust" class="com.harshit.entity.Customer" scope="session"></jsp:useBean>
<jsp:setProperty property="customerId" name="cust" param="customerId"/>
<jsp:setProperty property="customerName" name="cust" param="customerName"/>
<jsp:setProperty property="customerAddress" name="cust" param="customerAddress"/>
<jsp:setProperty property="billAmount" name="cust" param="billAmount"/>

<jsp:forward page="displayCustomerDetails.jsp"></jsp:forward>

</body>
</html>