<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Save location</title>
<form action="saveloc" method="post">
	<pre>
	Id:<input type="text" name="id"> 
	Code:<input type="text" name="code">
	Name:<input type="text" name="name"> 
	Type: Urban<input type="radio" name="type" value="URBAN">
	Rural:<input type="radio" name="type" value="RURAL">
	<input type="submit" value="Save">
	</pre>
</head>
<body>${successMessage}
<br/>
<a href="displayLocations">View all</a>
</body>
</html>