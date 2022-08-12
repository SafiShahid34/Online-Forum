<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@page import="Model.Base" %>
    <%@page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="assets/css/basic.css">
<title>Insert title here</title>
</head>
<body>
<h1>Chat logs!</h1>

<table>
<tr>
<th>ID</th>
<th>Display Name</th>
<th>Message</th>
</tr>

<%
ArrayList<Base> M = (ArrayList<Base>)request.getAttribute("data");

for(Base m: M){	
	%>
	<tr>
		<td><%=m.getId() %></td>
		<td><%= m.getName() %></td>
		<td><%=m.getMess()%></td>
	</tr>
	<%
	}
%>
</table>



</body>
</html>