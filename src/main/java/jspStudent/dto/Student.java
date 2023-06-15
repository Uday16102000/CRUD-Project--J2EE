package jspStudent.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student 
{
@Id
private int studentId;
private  String studentName;
private String studentEmail;
private String studentPassword;
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
private double fees;
private long phone;
private String address;
public int getStudentId() {
	return studentId;
}
public void setStudentId(int studentId) {
	this.studentId = studentId;
}
public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
}
public String getStudentEmail() {
	return studentEmail;
}
public void setStudentEmail(String studentEmail) {
	this.studentEmail = studentEmail;
}
public String getStudentPassword() {
	return studentPassword;
}
public void setStudentPassword(String studentPassword) {
	this.studentPassword = studentPassword;
}
public double getFees() {
	return fees;
}
public void setFees(double fees) {
	this.fees = fees;
}
public long getPhone() {
	return phone;
}
public void setPhone(long phone) {
	this.phone = phone;
}
@Override
public String toString() {
	return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentEmail=" + studentEmail
			+ ", studentPassword=" + studentPassword + ", fees=" + fees + ", phone=" + phone + "]";
}

	
}
