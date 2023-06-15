package jspStudent.dao;

import java.lang.annotation.Target;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.query.Query;

import jspStudent.dto.Student;

public class StudentDao {
	
	public  EntityManager getManager() {
		return Persistence.createEntityManagerFactory("uday").createEntityManager();
	}

	public Student saveStudent(Student student)
	{
		EntityManager manager=getManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		manager.merge(student);
	transaction.commit();
	return student;
	}
	public List<Student> getAllStudents()
	{
		EntityManager manager=getManager();
//		EntityTransaction transaction=manager.getTransaction();
	javax.persistence.Query query=	manager.createQuery("select a from Student a");
	
	List<Student> list=query.getResultList();
	return list;
	}
	
	public Student getStudentByEmail(String email)
	{
		
		EntityManager manager=getManager();
		EntityTransaction transaction=manager.getTransaction();
		javax.persistence.Query query=manager.createQuery("select a from Student a  where a.studentEmail=?1");
		
		query.setParameter(1, email);
		Student student=(Student) query.getSingleResult();
		
				return student;
	}
	public Student deleteStudentById(int id) {
		EntityManager manager=getManager();
		EntityTransaction transaction=manager.getTransaction();
		Student student =manager.find(Student.class, id);
		if(student!=null) {
		transaction.begin();
		manager.remove(student);
		transaction.commit();
		return student;
		}
		return null;
	}

	public Student updateStudent(int id,Student student)
	
	{
		EntityManager manager=getManager();
		Student studentdb =manager.find(Student.class, id);
		if(studentdb!=null)
		{
			EntityTransaction transaction=manager.getTransaction();
			studentdb.setAddress(student.getAddress());
			studentdb.setFees(student.getFees());
			studentdb.setPhone(student.getPhone());
			studentdb.setStudentEmail(student.getStudentEmail());
			studentdb.setStudentName(student.getStudentName());
			studentdb.setStudentPassword(student.getStudentPassword());
			
			
			transaction.begin();
			manager.merge(studentdb);
			transaction.commit();
			return studentdb;
			
		}
		return null;
	}
	public Student getStudentById(int id){
		EntityManager manager=getManager();
		Student student =manager.find(Student.class, id);
		return student;
	}
}
