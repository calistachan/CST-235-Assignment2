<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Test Response</title>
</head>
<body>
	<%= request.getParameter("firstname") %>
	<%= request.getParameter("lastname") %>
</body>
</html>