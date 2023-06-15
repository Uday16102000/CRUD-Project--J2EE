package jspStudent.servlet;

import java.io.IOException;
import jspStudent.dao.*;
import jspStudent.dto.Student;
import jspStudent.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/update")
public class updateServlet extends HttpServlet {
  @Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	int id=Integer.parseInt(req.getParameter("id"));
	StudentDao dao= new StudentDao();
	Student student=dao.getStudentById(id);
	req.setAttribute("student", student);
	RequestDispatcher dispatcher=req.getRequestDispatcher("edit.jsp");
	dispatcher.forward(req, resp);
//	StudentDao dao= new StudentDao();
//	Student student=dao.getStudentById(id);
	
//	Student student1= dao.updateStudent(student1,id);
	
}
}
