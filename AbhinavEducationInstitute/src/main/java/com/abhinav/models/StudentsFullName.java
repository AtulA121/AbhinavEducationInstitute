package com.abhinav.models;

import javax.persistence.Embeddable;

@Embeddable
public class StudentsFullName
{
	String student_fname;
	String student_mname;
	String student_lname;
	
	public String getStudent_fname() {
		return student_fname;
	}
	public void setStudent_fname(String student_fname) {
		this.student_fname = student_fname;
	}
	public String getStudent_mname() {
		return student_mname;
	}
	public void setStudent_mname(String student_mname) {
		this.student_mname = student_mname;
	}
	public String getStudent_lname() {
		return student_lname;
	}
	public void setStudent_lname(String student_lname) {
		this.student_lname = student_lname;
	}
	@Override
	public String toString() {
		return "StudentsFullName [student_fname=" + student_fname + ", student_mname=" + student_mname
				+ ", student_lname=" + student_lname + "]";
	}
}