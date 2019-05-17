<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="/PersonSpringMVC/app/person/new" method="post">
	Enter your Id: <input type="number" name="personId"/><br/>
	Enter your name: <input type="text" name="personName"/><br/>
	<input type="submit" value="Save"/> 
</form>
</body>
</html>