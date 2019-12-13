<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<center>
	<%=request.getAttribute("username") %>
	<%="Succesfully Registered" %><br>
	<%=request.getAttribute("password") %><br>
	<%=request.getAttribute("fname") %><br>
	<%=request.getAttribute("lname") %><br>
	<%=request.getAttribute("email") %><br>
	<%=request.getAttribute("mob") %><br>
	</center>
</body>
</html>