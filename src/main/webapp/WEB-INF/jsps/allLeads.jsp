<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All leads</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
	crossorigin="anonymous">
</head>
<body>
	<div class="container mt-4">
		<div class="row text-center">
			<h1>List of all Leads</h1>
		</div>

		<table class="table table-striped table-hover table-bordered">
			<thead class="table-dark">

				<tr>
					<th scope="col">Id</th>
					<th scope="col">First Name</th>
					<th scope="col">Last Name</th>
					<th scope="col"style="width:30%" >Email</th>
					<th scope="col">Mobile</th>
					<th scope="col">Actions</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${leads}" var="lead">
					<tr>
						<td>${lead.id}</td>
						<td>${lead.firstName}</td>
						<td>${lead.lastName}</td>
						<td><a href="/mail/sendEmail?email=${lead.email}">${lead.email}</a></td>
						<td>${lead.mobile}</td>
						<td class="p-2">
						<a href="delete?id=${lead.id}"class="btn btn-danger" style="font-size:14px">Delete</a>
						<a href="update?id=${lead.id}"class="btn btn-info ms-3"style="font-size:14px">Update</a>
						<a href="leadInfo?id=${lead.id}"class="btn btn-success ms-3"style="font-size:14px">Info</a>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	<div class="text-center" style="color:green">${msg}</div>
</body>
</html>