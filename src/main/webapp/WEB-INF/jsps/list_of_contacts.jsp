<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Contacts</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
	crossorigin="anonymous">
</head>
<body>
	<div class="container mt-4">
		<div class="row text-center">
			<h1>List of all Contacts</h1>
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
				<c:forEach items="${contacts}" var="contacts">
					<tr>
						<td>${contacts.id}</td>
						<td>${contacts.firstName}</td>
						<td>${contacts.lastName}</td>
						<td><a href="/mail/sendEmail?email=${contact.email}">${contacts.email}</a></td>
						<td>${contacts.mobile}</td>
						<td class="p-2">
						<a href="contactInfo?id=${contacts.id}"class="btn btn-success ms-3"style="font-size:12px">Contact Info</a>
						<a href="/bill/billing?id=${contacts.id}" class="btn btn-success ms-3"style="font-size:12px">Bill</a>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>