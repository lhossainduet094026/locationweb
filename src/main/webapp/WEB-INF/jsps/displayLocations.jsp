<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Locations</title>

</head>
<body>
	<table style="background-color: #96D4D4" border=" 1px solid black">
		<tr>
			<th>Id</th>
			<th>Code</th>
			<th>Name</th>
			<th>Type</th>
		</tr>

		<c:forEach var="location" items="${locations}">
			<tr>
				<td>${location.id}</td>
				<td>${location.code}</td>
				<td>${location.name}</td>
				<td>${location.type}</td>
				<td><a href="editLocation?id=${location.id}">Edit</a></td>
				<td><a href="deleteLocation?id=${location.id}">Delete</a></td>
			</tr>
		</c:forEach>

	</table>
	<a href="showCreate">Add record</a>
</body>
</html>