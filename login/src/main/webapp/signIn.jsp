
<!DOCTYPE html>
<html>
<head>
<title>Login</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">

<style>

body{
background: linear-gradient(120deg,#1d3557,#457b9d);
height:100vh;
display:flex;
justify-content:center;
align-items:center;
}

.card{
border-radius:12px;
box-shadow:0 10px 25px rgba(0,0,0,0.3);
}

</style>

</head>

<body>

<div class="card p-4" style="width:350px">

<h3 class="text-center mb-4">Login</h3>

<form action="signIn" method="post">

<div class="mb-3">
<label>Email</label>
<input type="email" name="email" class="form-control" required>
</div>

<div class="mb-3">
<label>Password</label>
<input type="password" name="password" class="form-control" required>
</div>

<div class="d-grid">
<button class="btn btn-primary">Login</button>
</div>

<div class="text-center mt-3">
<a href="home">Back to Home</a>
</div>

</form>

</div>

</body>
</html>