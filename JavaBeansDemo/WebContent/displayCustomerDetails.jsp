<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="/WEB-INF/customTag.tld" prefix="deloitte" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%= session.getAttribute("cust")%>
<deloitte:deloitteAddress></deloitte:deloitteAddress>>
</body>
</html>