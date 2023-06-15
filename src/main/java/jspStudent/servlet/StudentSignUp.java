
package jspStudent.servlet;
import jspStudent.dto.*;
import java.io.IOException;
import jspStudent.dao.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class StudentSignUp extends HttpServlet {

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
	int id=Integer.parseInt(req.getParameter("id"));
	String name=req.getParameter("name");
	String email=req.getParameter("email");
	String password=req.getParameter("password");
	String address=req.getParameter("address");
	long phone=Long.parseLong(req.getParameter("phone"));
	
	ServletContext context=getServletContext();
	String fee=context.getInitParameter("fees");
	double fees=Double.parseDouble(fee);
	
	Student student= new Student();
	student.setStudentId(id);
	student.setStudentName(name);
	student.setStudentEmail(email);
	student.setAddress(address);
	student.setPhone(phone);
	student.setFees(fees);
	student.setStudentPassword(password);
	
	StudentDao dao= new StudentDao();
	Student dbStudent=dao.saveStudent(student);
	if(dbStudent!=null) {
		req.setAttribute("message","SignedIn Succesfully");
		RequestDispatcher dispatcher=req.getRequestDispatcher("login.jsp");
		dispatcher.forward(req, resp);
	}
	
	
	}
}
