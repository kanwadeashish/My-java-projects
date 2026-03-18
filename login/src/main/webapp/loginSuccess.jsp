<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<title>Login Result</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">

<!-- Bootstrap Icons -->
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.5/font/bootstrap-icons.css">

<style>

body{
background: linear-gradient(120deg,#1d3557,#457b9d);
height:100vh;
margin:0;
display:flex;
flex-direction:column;
}

.content{
flex:1;
display:flex;
justify-content:center;
align-items:center;
}

.card{
padding:40px;
border-radius:12px;
box-shadow:0 10px 30px rgba(0,0,0,0.3);
text-align:center;
}

.profile-icon{
font-size:26px;
cursor:pointer;
color:white;
}

</style>

</head>

<body>

<!-- Navbar -->
<nav class="navbar navbar-dark bg-dark">
<div class="container-fluid">

<a class="navbar-brand fw-bold">Xworkz</a>

<div class="dropdown">

<i class="bi bi-person-circle profile-icon"
data-bs-toggle="dropdown"></i>

<ul class="dropdown-menu dropdown-menu-end p-3">

<li>
<strong>${name}</strong>
</li>

<li class="text-muted">${email}</li>

<hr>

<li>
<button class="btn btn-primary w-100"
data-bs-toggle="modal"
data-bs-target="#profileModal">
Profile
</button>
</li>

</ul>

</div>

</div>
</nav>


<!-- Main Content -->

<div class="content">

<div class="card">

<h3 style="color:green">${loginSuccessfully}</h3>

<h3 style="color:red">${loginFailed}</h3>

<a href="home" class="btn btn-dark mt-3">Back to Home</a>

</div>

</div>


<!-- Profile Modal with FORM -->

<div class="modal fade" id="profileModal">
<div class="modal-dialog">
<div class="modal-content">

<div class="modal-header">
<h5 class="modal-title">User Profile</h5>
<button type="button" class="btn-close" data-bs-dismiss="modal"></button>
</div>

<div class="modal-body">

<form action="updateData" method="post">

    <!-- Hidden ID -->
    <div class="mb-3">
            <label class="form-label" hidden>Id</label>
            <input type="text" name="id" class="form-control" value="${id}" hidden>
    </div>

    <div class="mb-3">
        <label class="form-label">Name</label>
        <input type="text" name="name" class="form-control" value="${name}">
    </div>

    <div class="mb-3">
        <label class="form-label">User Name</label>
        <input type="text" name="userName" class="form-control" value="${userName}">
    </div>

    <div class="mb-3">
        <label class="form-label">Email</label>
        <input type="email" name="email" class="form-control" value="${email}" readonly>
    </div>

    <div class="mb-3">
        <label class="form-label">Contact Number</label>
        <input type="number" name="contactNumber" class="form-control" value="${contactNumber}" readonly>
    </div>

    <div class="d-grid">
        <button type="submit" class="btn btn-success">Update Profile</button>
    </div>

</form>

</div>

<div class="modal-footer">
<button class="btn btn-secondary" data-bs-dismiss="modal">
Close
</button>
</div>

</div>
</div>
</div>


<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>