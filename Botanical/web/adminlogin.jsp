<%-- 
    Document   : adminlogin
    Created on : Jul 22, 2020, 6:26:25 PM
    Author     : IQBAL NOTEBOOK
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>Admin Login</title>
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
        
	<form class="box" action="AdminLoginServlet" method="post">
			<h1>Login Admin</h1>
			<input type="text" name="user" placeholder="Enter Username" required>

			<input type="Password" name="pass" placeholder="Enter Password" required>

			<input type="submit" value="Login">
	</form>

</body>
</html>