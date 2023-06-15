<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.util.List" %>
      <%@page import="jspStudent.dto.Student" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
<title>Insert title here</title>
</head>
<body class="text-bg-dark p-3">
 
<table border="1px"  class="table table-dark">
<%List<Student> students=(List) request.getAttribute("list"); %> 
<tr class="table-dark">
<th >ID</th>
<th>NAME</th>
<th>EMAIL</th>
<th>PASSWORD</th>
<th>ADDRESS</th>
<th>PHONE NO</th>
<th>FEES</th>
<th>Delete</th>
<th>Update</th>
</tr >
<%for(Student student:students){ %>
<tr class="table-light">
<td><%=student.getStudentId() %></td>
<td><%=student.getStudentName() %></td>
<td><%=student.getStudentEmail() %></td>
<td><%=student.getStudentPassword() %></td>
<td><%=student.getAddress() %></td>
<td><%=student.getPhone()%></td>
<td><%=student.getFees()%></td>
<td><a href="delete?id=<%=student.getStudentId() %>" class="btn btn-danger"> Delete</a></td>
<td><a href="update?id=<%=student.getStudentId() %>" class="btn btn-primary">Update</a></td>
</tr>
<%} %>
</tr>
</table>
</body>
</html>