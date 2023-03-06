<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Formulaire</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js" integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN" crossorigin="anonymous"></script>
</head>
<body>
	
	<form method="post">
  <div class="mb-3">
    <label for="login" class="form-label">Login</label>
    <input type="text" class="form-control" name="login" aria-describedby="emailHelp" required="required">
    <div id="emailHelp" class="form-text">We'll never share your email with anyone else.</div>
  </div>
  <div class="mb-3">
    <label for="mdp" class="form-label">Mot de passe</label>
    <input type="password" class="form-control" name="mdp" required="required">
  </div>
  <div class="mb-3">
    <label for="adresse" class="form-label">Adresse</label>
    <input type="text" class="form-control" name="adresse" aria-describedby="emailHelp">
  </div>
  <div class="mb-3">
    <label for="cp" class="form-label">Code postal</label>
    <input type="number" class="form-control" name="cp" aria-describedby="emailHelp">
  </div>
  <div class="mb-3">
    <label for="ville" class="form-label">Ville</label>
    <input type="text" class="form-control" name="ville" aria-describedby="emailHelp">
  </div>
   <div class="mb-3">
    <label for="email" class="form-label">Email</label>
    <input type="email" class="form-control" name="email" aria-describedby="emailHelp">
  </div>
  <div class="mb-3">
    <label for="tel" class="form-label">Telephone</label>
    <input type="tel" class="form-control" name="tel" aria-describedby="emailHelp">
  </div>
  
  <input type="radio" class="btn-check" name="formule" id="option1" autocomplete="on" checked value="classique">
<label class="btn btn-secondary" for="option1">Classique</label>
  
  <input type="radio" class="btn-check" name="formule" id="option2" autocomplete="off" checked value="abonne">
<label class="btn btn-secondary" for="option2">Abonné</label>
  
  <input type="radio" class="btn-check" name="formule" id="option3" autocomplete="off" checked>
<label class="btn btn-secondary" for="option3">VIP</label>
  
  
  <button type="submit" class="btn btn-primary">Valider</button>
  <button type="reset" class="btn btn-primary">Annuler</button>
</form>
	
</body>
</html>