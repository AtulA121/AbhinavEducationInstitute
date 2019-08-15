package com.abhinav.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abhinav.controller.doa.GetAdminDoa;
import com.abhinav.models.Admins;

@Service
public class AdminService
{
	@Autowired
	GetAdminDoa doa;
	
	@Autowired
	List<Admins> list;
	
	@Autowired
	Admins admin;
	
	public int getAdmin(String password,String username)
	{
		int result=0;
		try
		{
			System.out.println("------ :"+password+" "+username);
			admin=doa.fetchAll(password,username);
			System.out.println("list is ------ :"+list);
			
			if(admin.getAdmin_password().equals(""+password) && admin.getAdmin_email().equals(""+username))
			{
				result=admin.getAdmin_id();
			}
		}
		catch(Exception e)
		{
			System.out.println(""+e);
		}
		return result;
	}
	
	public Admins fetchAdminDataById(String adminId)
	{
		try
		{
			if(adminId==null || adminId=="null" || adminId=="" || adminId.equals("") || adminId.equals("null"))
			{
				System.out.println("AdminId is null : "+adminId);
			}
			else
			{
				System.out.println("AdminId is not null : "+adminId);
				int adminIdd=Integer.decode(adminId);
				System.out.println("------ :"+adminId);
				admin=doa.fetchAdminDataById(adminIdd);
				System.out.println("------ :"+admin);
			}
		}
		catch(Exception e)
		{
			System.out.println("Exceptione in fetchAdminDataById : "+e);
		}
		return admin;
	}
}
