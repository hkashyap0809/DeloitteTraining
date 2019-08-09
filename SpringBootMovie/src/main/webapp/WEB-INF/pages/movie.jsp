<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form:form modelAttribute="movie">
<h2> Movie form</h2>
Movie ID : <from:input path="movieId" name="movieId" placeholder="MOVIE ID"/><br />
Movie Name : <from:input path="moveiName" name="movieName" placeholder="MOVIE NAME"/><br />
Director Name : <from:input path="directorName" name="directorName" placeholder="DIRECTOR NAME" /><br />
Budget : <from:input path="budget" type="number" name="budget" placeholder="BUDGET IN MILLION" /><br />
<input type="submit" value="save">
</form:form>

</body>
</html>