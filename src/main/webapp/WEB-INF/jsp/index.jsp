<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="styleSheet" href="/webjars/bootstrap/5.1.3/css/bootstrap.min.css">
</head>
<body>

	<div class="container cont">
		<h1 class="text-center">Product Page</h1>
		<p style="color:red">${erreur}</p>
		<form method="post" >
			<div class="mb-3 input-group-lg">
					<label class="form-label">Product name :</label>
					<input class="form-control" type="text" name="product" />
			 </div>
			<div class="mb-3 input-group-lg">
				<label class="form-label">Price :</label>
				<input class="form-control" type="text" name="price" />
			 </div>
			 <div class="d-flex justify-content-center">
				<div class="btn-group-lg" role="group" aria-label="Basic outlined example">
					<input type="submit" class=" btn btn-outline-primary" value="Add">
				</div>
			</div>
		</form>
	</div>
</body>
</html>