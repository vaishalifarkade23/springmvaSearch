<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>${student }</h1>
<h1>name is: ${student.name }</h1>
<h2>id is: ${student.id }</h2>
<h2>courses is: ${student.course }</h2>
<h2>gender is: ${student.gender }</h2>
<h2>type is: ${student.type }</h2>
<h2>address  is: ${student.address.street }</h2>
<h2>address  is: ${student.address.city }</h2>
</body>
</html>