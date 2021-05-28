<%-- 
    Document   : register
    Created on : Jul 22, 2020, 6:30:58 PM
    Author     : IQBAL NOTEBOOK
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>Register</title>
	<link rel="stylesheet" type="text/css" href="css/stylelogin.css">
</head>
<body>

	<header>
		<h1 class="logo">Botanical</h1>

		<nav>
			<ul class="nav_link">
				<li><a href="#" class="style">Home</a></li>
				<li><a href="#" class="style">About</a></li>
				<li><a href="#" class="style">Contact</a></li>
			</ul>
		</nav>

		
	</header>

	<form class="box" action="RegistrasiServlet" method="GET">
			<h1>Register User</h1>
			<input type="text" name="nama" placeholder="Enter Name" required>
                        
                        <input type="text" name="email" placeholder="Enter Email" required>

			<input type="Password" name="pass" placeholder="Enter Password" required>

			<input type="text" name="alamat" placeholder="Enter Address" required>
                        
			<input type="submit" value="Register">
	</form>

</body>
</html>
