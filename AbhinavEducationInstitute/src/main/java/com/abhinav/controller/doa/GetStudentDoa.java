package com.abhinav.controller.doa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import com.abhinav.models.Students;

@Service
public interface GetStudentDoa extends JpaRepository<Students,Integer>
{
	@Query("from Students where student_password=?1 and student_email=?2")
	Students fetchAll(String password,String username);

	@Query("from Students where student_id=?1")
	Students fetchStudentDataById(int studentId);
	
	@Query("from Students")
	List<Students> fetchAll();
}
