<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Test Form</title>
</head>
<body>
<form action="TestServlet" method="post">
	<label for="firstname">First Name:</label>
	<input type="text" id="firstname" name="firstname">
	<label for="lastname">Last Name:</label>
	<input type="text" id="lastname" name="lastname">
	<input type="submit" value="Submit"/>
</form>
</body>
</html>