package jspStudent.servlet;
import jspStudent.dao.*;
import jspStudent.dto.*;
import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/delete")
public class deleteServlet  extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
	int id=Integer.parseInt(req.getParameter("id"));
	
	StudentDao dao= new StudentDao();
Student student=	dao.deleteStudentById(id);
List<Student> student1=dao.getAllStudents();
if(student!=null) {
	req.setAttribute("list", student1);
	RequestDispatcher dispatcher=req.getRequestDispatcher("display.jsp");
	dispatcher.forward(req, resp);
}
	}
} 
