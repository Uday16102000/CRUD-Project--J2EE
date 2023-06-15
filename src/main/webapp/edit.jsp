<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@page import="jspStudent.dto.Student" %>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
<meta charset="UTF-8">
<title>Edit</title>
</head>
<body class="p-3 mb-2 bg-dark text-white">

<% Student student=(Student)request.getAttribute("student"); %>
<table style="margin-left:40%">

<form  action="edit" method="post" >
<thead>
<tr>
<td>Id:<input type="number" name="id" value="<%= student.getStudentId() %>" readonly="readonly" class="form-control form-control-lg" class="p-3 mb-2 bg-danger-subtle text-emphasis-danger"></td>
</tr>
<tr>
<td>Name:<input type="text" name="name" value="<%= student.getStudentName() %>" required class="form-control form-control-lg" class="p-3 mb-2 bg-danger-subtle text-emphasis-danger"></td>
</tr>
<tr>
<td>Email:<input type="email" name="email" value="<%= student.getStudentEmail() %>" required class="form-control form-control-lg" class="p-3 mb-2 bg-danger-subtle text-emphasis-danger"></td>
</tr>
<tr>
<td>Password:<input type="password" name="password"  value="<%= student.getStudentPassword() %>" required class="form-control form-control-lg" class="p-3 mb-2 bg-danger-subtle text-emphasis-danger"></td>
</tr>

<tr>
<td>Phone:<input type="text" name="phone" value="<%= student.getPhone() %>" required class="form-control form-control-lg" class="p-3 mb-2 bg-danger-subtle text-emphasis-danger"></td>
</tr>

<tr>
<td>Address:<input type="text" name="address" value="<%= student.getAddress() %>" required class="form-control form-control-lg" class="p-3 mb-2 bg-danger-subtle text-emphasis-danger"></td>
</tr>
<tr>
<td><input type="submit" value="Edit" class="btn btn-success" style="margin:12px;"></td>
</tr>


</thead>
</form>
</table>


</body>
</html>