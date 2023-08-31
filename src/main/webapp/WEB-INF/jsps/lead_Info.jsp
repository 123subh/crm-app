<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lead Info</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
	crossorigin="anonymous">
</head>
</head>
<body>
<div class="container d-flex flex-column justify-content-center mt-5 align-items-center">
<div class="card" style="width: 25rem;">
  <div class="card-header">
   <h3> Lead Info</h3>
  </div>
  <ul class="list-group list-group-flush">
    <li class="list-group-item">First Name	: ${lead.firstName}</li>
    <li class="list-group-item">Last Name	: ${lead.lastName}</li>
    <li class="list-group-item">Mobile	: ${lead.mobile}</li>
    <li class="list-group-item">E-mail : ${lead.email}</li>
  </ul>
  <div class="card-body d-flex justify-content-between">
  <form action="/mail/sendEmail" method="post">
			<input type="hidden" name="email" value="${lead.email}"/>
			<input class="btn btn-primary" type="submit" value="Send Mail"/>
		</form>
  <form action="/contact/convert" method="post">
			<input type="hidden" name="id" value="${lead.id}"/>
			<input class="btn btn-primary" type="submit" value="convert"/>
		</form>
		</div>
</div>

		
	</div>	
		<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
		crossorigin="anonymous"></script>
</body>
</html>