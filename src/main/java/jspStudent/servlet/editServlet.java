package jspStudent.servlet;

import java.io.IOException;
import java.util.List;

import jspStudent.dto.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import jspStudent.dao.*;

public class editServlet  extends HttpServlet{
 @Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
int id=Integer.parseInt(req.getParameter("id"));
String email=req.getParameter("email");
String name=req.getParameter("name");
String password=req.getParameter("password");
String address=req.getParameter("address");
long phone=Long.parseLong(req.getParameter("phone"));
ServletContext context=getServletContext();
String stringFees=context.getInitParameter("fees");
double fees=Double.parseDouble(stringFees);


Student student=new Student();
student.setAddress(address);
student.setFees(fees);
student.setPhone(phone);
student.setStudentEmail(email);
//student.setStudentId(id);
student.setStudentName(name);
student.setStudentPassword(password);

StudentDao dao=new StudentDao();
Student student1=dao.updateStudent(id,student);
List<Student> student2=dao.getAllStudents();

req.setAttribute("list", student2);
RequestDispatcher dispatcher=req.getRequestDispatcher("display.jsp");
dispatcher.forward(req, resp);




}
}
