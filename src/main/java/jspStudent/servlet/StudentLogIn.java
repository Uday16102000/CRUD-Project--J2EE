package jspStudent.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import jspStudent.dao.*;
import jspStudent.dto.Student;

import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class StudentLogIn  extends HttpServlet{
  @Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
//PrintWriter printWriter= resp.getWriter();
//printWriter.println("Login url hit");
	  String email=req.getParameter("email");
	  String password=req.getParameter("password");
	  StudentDao dao= new StudentDao();
	  List<Student> student=dao.getAllStudents();
	  boolean value=false;
	  for(Student student1:student)
	  {
		  if(student1.getStudentPassword().equals(password)) {
			  value=true;
			  break;
		  }
	  }
	  if(value==false) {
		  req.setAttribute("message", "INCORRECT EMAIL");
		  RequestDispatcher dispatcher=req.getRequestDispatcher("login.jsp");
		  dispatcher.include(req, resp);
	  }else {
		  Student student1 =dao.getStudentByEmail(email);
		  if(student1.getStudentPassword().equals(password)){
		  
			  req.setAttribute("list",student);
			  RequestDispatcher dispatcher=req.getRequestDispatcher("display.jsp");
		dispatcher.forward(req, resp);
		  }else {
			  req.setAttribute("message", "Incorrect password");
			  RequestDispatcher dispatcher=req.getRequestDispatcher("login.jsp");
						dispatcher.forward(req, resp);}
	  }
	
}
}
