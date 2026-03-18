<%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html>
<head>
<title>Student Portal</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">

<style>

body{
background: linear-gradient(135deg,#1d3557,#457b9d);
height:100vh;
margin:0;
display:flex;
flex-direction:column;
}

.portal-container{
flex:1;
display:flex;
justify-content:center;
align-items:center;
}

.portal-card{
background:white;
padding:40px;
border-radius:10px;
box-shadow:0 10px 30px rgba(0,0,0,0.2);
text-align:center;
width:350px;
}

.navbar-brand{
font-weight:bold;
font-size:22px;
}

</style>

</head>

<body>

<!-- Navbar -->
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
<div class="container-fluid">

<a class="navbar-brand" href="#">Xworkz</a>

<button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav">
<span class="navbar-toggler-icon"></span>
</button>

<div class="collapse navbar-collapse" id="navbarNav">

<ul class="navbar-nav ms-auto">

<li class="nav-item">
<a class="nav-link" href="home">Home</a>
</li>

<li class="nav-item">
<a class="nav-link" href="up">Sign Up</a>
</li>

<li class="nav-item">
<a class="nav-link" href="in">Sign In</a>
</li>

</ul>

</div>

</div>
</nav>


<!-- Main Content -->
<div class="portal-container">

<div class="portal-card">

<h2 class="mb-4">Student Portal</h2>

<h5 style="color:green">${success}</h5>
<h5 style="color:red">${errormsg}</h5>

<div class="d-grid gap-3 mt-4">

<a href="up" class="btn btn-success">Sign Up</a>

<a href="in" class="btn btn-primary">Sign In</a>

</div>

</div>

</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>