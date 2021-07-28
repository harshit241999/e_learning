<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update user window</title>
</head>
<body>
	<h2>UPDATE Form</h2>
	<c:url var="updateUrl" value="/update-user"></c:url>
	<form:form action="${updateUrl }" method="post" modelAttribute="user">
		<pre>
      Id                  : <form:input path="userid" />
			
      Name                : <form:input path="name" />
			
      Phone Number        : <form:input path="phoneno" />
			
	   Email               : <form:input path="email" />
	   
	  Address             : <form:input path="address" />
  
      Password            : <form:password path="password" />
			
      Photo				  : <form:input path="uploadimg" />
			
        Registration Date	  : <form:input path="regdate" />
			
     
    <input type="submit" value="Update User" />    <input type="reset"
				value="Clear" />
   </pre>

	</form:form>
</body>
</html>