<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>ADD Form</h2>
	<form:form action="register" method="Post" modelAttribute="user">
		<pre>
      Id                  : <form:input path="userid" />
			
      Name                : <form:input path="name" />
			
      Phone Number        : <form:input path="phoneno" />
			
	   Email               : <form:input path="email" />
	   
	  Address             : <form:input path="address" />
  
      Password            : <form:password path="password" />
			
      Photo				  : <form:input path="uploadimg" />
			
        Registration Date	  : <form:input path="regdate" />
			
     
    <input type="submit" value="Register" />    <input
				type="reset" value="Clear" />
   </pre>

	</form:form>
</body>
</html>