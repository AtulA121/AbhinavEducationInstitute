package com.abhinav.controller.doa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import com.abhinav.models.Staffs;
import com.abhinav.models.Students;

@Service
public interface GetStaffDoa extends JpaRepository<Students,Integer>
{
	@Query("from Staffs where staff_password=?1 and staff_email=?2")
	Staffs fetchAll(String password,String username);

	@Query("from Staffs where staff_id=?1")
	Staffs fetchStaffDataById(int staffId);
}