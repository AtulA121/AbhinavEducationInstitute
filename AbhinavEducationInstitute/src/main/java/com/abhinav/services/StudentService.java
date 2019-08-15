package com.abhinav.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abhinav.controller.doa.GetStudentDoa;
import com.abhinav.models.Students;

@Service
public class StudentService
{
	@Autowired
	GetStudentDoa doa;
	
	@Autowired
	Students student;
	
	@Autowired
	List<Students> list;
	
	public int getStudent(String password,String username)
	{
		int result=0;
		student=doa.fetchAll(password,username);
		
		if(student.getStudent_password().equals(""+password) && student.getStudent_email().equals(""+username))
		{
			result=student.getStudent_id();
		}
		return result;
	}
	
	public List<Students> getAllStudents()
	{
		list=doa.fetchAll();
		
		return list;
	}
	
	public Students fetchStudentDataById(int studentId)
	{
		student=doa.fetchStudentDataById(studentId);
		return student;
	}
}
