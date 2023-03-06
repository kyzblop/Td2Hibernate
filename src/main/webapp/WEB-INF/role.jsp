<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN"
	crossorigin="anonymous"></script>
</head>
<body>
	<form method="post">
		<div class="mb-3">
			<label for="idClient" class="form-label">id du user</label> <input
				type="text" class="form-control" id="idClient"
				aria-describedby="emailHelp" name="idUser">
		</div>
		<div class="mb-3 form-check">
			<input type="checkbox" class="form-check-input" id="exampleCheck1" name="role" value="client">
			<label class="form-check-label" for="exampleCheck1">Client</label>
		</div>
		<div class="mb-3 form-check">
			<input type="checkbox" class="form-check-input" id="exampleCheck1" name="role" value="moderateur">
			<label class="form-check-label" for="exampleCheck1">Moderateur</label>
		</div>

		<button type="submit" class="btn btn-primary">Valider</button>
		<button type="reset" class="btn btn-primary">Annuler</button>
	</form>
</body>
</html>