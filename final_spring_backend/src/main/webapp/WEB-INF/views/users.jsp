<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored="false" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Users List</title>
</head>
<body>

 	<table border="1">
		<tr>
			<th>user id</th>
			<th>name</th>
			<th>phone no</th>
			<th>email</th>
			<th>address</th>
			<th>password</th>
			<th>upload image </th>
			<th>registration date</th>
			<th>Actions</th>
		</tr>

		<c:forEach var="user" items="${list }">
			<tr>
				<td>${user.userid }</td>
				<td>${user.name }</td>
				<td>${user.phoneno }</td>
				<td>${user.email }</td>
				<td>${user.address }</td>
				<td>${user.password }</td>
				<td>${user.uploadimg }</td>
				<td>${user.regdate }</td>
				<td>
					<a href="<c:url value='/delete-user/${user.userid }'/>">Delete</a>
					<a href="<c:url value='/update-user/${user.userid }'/>">Update</a>
				
				</td>
				
			</tr>
		</c:forEach>
	</table>   
	<br>
	<a href="addUser">Add new user</a>
</body>
</html>