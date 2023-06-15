<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
 <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
<link rel="stylesheet" type="text/css" href="css/signup.css">

<meta charset="UTF-8">
<title>SignUp</title>
</head>
<body class="p-3 mb-2 bg-dark text-white">
<h1 class="mx-auto p-2" style="width: 200px;">SignUp</h1>

<table id="signupform" >
<form  action="signUp">
<thead>
<tr>
<td>Id :<input type="number" name="id" class="form-control form-control-lg" class="p-3 mb-2 bg-danger-subtle text-emphasis-danger"></td>
</tr>
<tr>
<td>Name:<input type="text" name="name"class="form-control form-control-lg"   class="p-3 mb-2 bg-danger-subtle text-emphasis-danger"></td>
</tr>
<tr>
<td>Email:<input type="email" name="email" class="form-control form-control-lg"  class="p-3 mb-2 bg-danger-subtle text-emphasis-danger"></td>
</tr>
<tr>
<td>Password:<input type="password" name="password" class="form-control form-control-lg"></td>
</tr>

<tr>
<td>Phone:<input type="text" name="phone" class="form-control form-control-lg"></td>
</tr>

<tr>
<td>Address:<input type="text" name="address" class="form-control form-control-lg"></td>
</tr>
<tr>
<td><input type="submit" value="submit" class="btn btn-primary" style="margin:8px;"></td>
</tr>


</thead>
</form>
</table>

</body>
</html>