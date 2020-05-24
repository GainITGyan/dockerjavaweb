<%@page import="com.gyanitgyan.dockerjavaweb.dto.UserDto"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Docker - Spring boot web application</title>
</head>
<body style="align-content: center;">
	<h1>Welcome to Docker -Spring Boot Demo</h1>
	

	<table border="1">
		<tr>
			<th>User Id</th>
			<th>Name</th>
			<th>Age</th>
		</tr>
		<%List<UserDto> users =(List<UserDto>) request.getAttribute("users");
		  for(UserDto user : users){
		%>
		<tr>
			<td><%=user.getId() %></td>
			<td><%=user.getName()%></td>
			<td><%=user.getAge() %></td>
		</tr>
		<%} %>
	</table>
	

</body>
</html>