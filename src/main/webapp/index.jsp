<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="assests/basic.css">
<title>Login</title>
</head>
<body>
	<h1>Welcome to Form!</h1>
	<form method=post action=LogCheck>
	Enter Display Name: <input type=text name=t1>
	Enter Message: <input type=text name=t2>
	<br><br>
	<input type=submit value="Login">
	</form>
	
	<form method=get action=ViewMess>
	<h1>View Online Form</h1>
	<br><br>
	<input type=submit value="ok">
	</form>
	
	
	
</body>
</html>