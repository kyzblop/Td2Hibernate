<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Commande</title>
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
			<label for="idClient" class="form-label">id du client</label> <input
				type="text" class="form-control" id="idClient"
				aria-describedby="emailHelp" name="idClient">
		</div>
		<div class="mb-3">
			<label for="desc" class="form-label">Description</label> <input
				type="text" class="form-control" id="desc"
				aria-describedby="emailHelp" name="description">
		</div>
		<div class="mb-3">
			<label for="date" class="form-label">Date de la commande</label> <input
				type="date" class="form-control" id="date" name="dateCom">
		</div>
		<button type="submit" class="btn btn-primary">Valider</button>
		<button type="reset" class="btn btn-primary">Annuler</button>
	</form>
</body>
</html>