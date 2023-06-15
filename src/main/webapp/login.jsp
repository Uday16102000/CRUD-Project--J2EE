<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>LogIn</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
</head>
<body class="p-3 mb-2 bg-dark text-white">
<h1 class="mx-auto p-2" style="width: 200px;">LOGINPAGE</h1>
<%String message= (String)request.getAttribute("message"); %>
<%if(message!=null) {%>
<h3 class="mx-auto p-2" style="width: 100px;"><%= message %></h3>
<br>

	
<%}%>
<form action="login" method="post" style="margin-left:40%">
Email:<input type="email"  name="email" class="form-control form-control-lg" class="p-3 mb-2 bg-danger-subtle text-emphasis-danger" style="width:40%;">
<br/>
Password:<input type="password"  name="password" class="form-control form-control-lg" class="p-3 mb-2 bg-danger-subtle text-emphasis-danger" style="width:40%;">
<br/>
<input type="submit" value="LogIn" class="btn btn-primary" style="margin:12px;  text-align:center">
</form>

</body>
</html>