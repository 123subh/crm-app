<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Lead</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
	crossorigin="anonymous">
</head>
<body>

	<div class="container d-flex justify-content-center mt-5 ">
	
		<div class="card" style="width: 40rem;">
			<div class="card-body">
				<h5 class="card-header text-center">Update Lead</h5>
				<form action="updateLead" method="post">
				<div class="mb-3">
						<label for="exampleInputEmail1" class="form-label">
						 </label> <input type="hidden" class="form-control" id="id"
							name="id" value="${lead.id}">
					</div>
					<div class="mb-3">
						<label for="exampleInputEmail1" class="form-label">First
							Name </label> <input type="text" class="form-control" id="firstName"
							name="firstName" value="${lead.firstName}">
					</div>
					<div class="mb-3">
						<label for="exampleInputEmail1" class="form-label">Last
							Name </label> <input type="text" class="form-control" id="lastName"
							name="lastName"  value="${lead.lastName}">
					</div>
					<div class="mb-3">
						<label for="exampleInputEmail1" class="form-label">Mobile
						</label> <input type="text" class="form-control" id="mobile" name="mobile" value="${lead.mobile}">
					</div>
					<div class="mb-3">
						<label for="email" class="form-label">Email address</label> <input
							type="email" class="form-control" id="email" name="email" value="${lead.email}">
					</div>


					<button type="submit" class="btn btn-primary">Submit</button>

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
