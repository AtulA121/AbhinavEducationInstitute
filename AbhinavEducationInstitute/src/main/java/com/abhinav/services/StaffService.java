package com.abhinav.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abhinav.controller.doa.GetStaffDoa;
import com.abhinav.models.Staffs;

@Service
public class StaffService
{
	@Autowired
	GetStaffDoa doa;
	
	@Autowired
	Staffs staff;
	
	@Autowired
	List<Staffs> list;
	
	public int getStaff(String password,String username)
	{
		int result=0;
		staff=doa.fetchAll(password,username);
		if(staff.getStaff_password().equals(""+password) && staff.getStaff_email().equals(""+username))
		{
			result=staff.getStaff_id();
		}
		return result;
	}

	public Staffs fetchStaffDataById(int staffId)
	{
		staff=doa.fetchStaffDataById(staffId);
		return staff;
	}
}
