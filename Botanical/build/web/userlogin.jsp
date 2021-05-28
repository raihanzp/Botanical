<%-- 
    Document   : userlogin
    Created on : Jul 22, 2020, 6:28:41 PM
    Author     : IQBAL NOTEBOOK
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>User Login</title>
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

	<a href="register.jsp" class="red-btn" >Register</a>	
	</header>

	<form class="box" action="LoginServlet" method="POST">
			<h1>Login User</h1>
			<input type="text" name="email" placeholder="Enter Email" required>

			<input type="Password" name="pass" placeholder="Enter Password" required>

			<input type="submit" value="Login">
	</form>

</body>
</html>
