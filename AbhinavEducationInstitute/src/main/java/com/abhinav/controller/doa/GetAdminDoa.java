package com.abhinav.controller.doa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import com.abhinav.models.Admins;

@Service
public interface GetAdminDoa extends JpaRepository<Admins,Integer>
{
	@Query("from Admins where admin_password=?1 and admin_email=?2")
	Admins fetchAll(String password,String username);

	@Query("from Admins where admin_id=?1")
	Admins fetchAdminDataById(int adminId);
	
}