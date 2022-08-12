<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<head>
	<title>Login</title>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, inital-scale=1">
	<link rel="stylesheet" href="assests/style.css">
	<link rel="preconnect" href="https://fonts.googleapis.com">
	<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
	<link href="https://fonts.googleapis.com/css2?family=Blaka&family=Sedgwick+Ave&family=Finger+Paint&family=Pacifico&display=swap" rel="stylesheet">
</head>
<body>
	<div id="con">
		<h1 id="title">Online Web Chat</h1>
	</div>
	<hr width="80%">

	

	<div id="outtie">
		<div id="bon">
			
			<p class="tle theme">Enter Messege</p>
			<p class="tl">Type your name and messege to submit to the chat!</p>
		</div>
		<div id="son">
			<form id="don" method=post action=LogCheck>
				<div id="ur" class="tot">
					<label class="theme">Enter Display Name:</label><input type="text" name=t1>
				</div>
				<div id="ps" class="tot">
					<label class="theme">Enter Message:</label><input type="text" name=t2>
				</div>
	
				<button class="log" type="submit" ><div class="theme" id="inner">Login</div></button>
			</form>
		</div>
	</div>

	<div id="outtie3">
		<div id="son2" >
			
			<p class="tle theme">View Chat Log</p>
			<p class="tl">Click below to view chat messeges!</p>
		</div>
		<form method=get action=ViewMess>
			<input type=submit value="ok">
		</form>
	</div>

	<hr width="80%">
	<br>
	<div id="df" display="inline-block" float="right">
		Presented to you by Safi, 2022
	</div>


	
</body>
