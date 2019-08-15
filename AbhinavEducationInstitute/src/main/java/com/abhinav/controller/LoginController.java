package com.abhinav.controller;

import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.abhinav.models.Admins;
import com.abhinav.models.Staffs;
import com.abhinav.models.Students;
import com.abhinav.services.AdminService;
import com.abhinav.services.StaffService;
import com.abhinav.services.StudentService;
import com.google.gson.Gson;

@Controller
public class LoginController
{
	@Autowired
	StudentService studentService;
	
	@Autowired
	StaffService staffService;
	
	@Autowired
	AdminService adminService;
	
	@Autowired
	List<Students> students;
	
	@Autowired
	List<Staffs> staffs;
	
	@Autowired
	List<Admins> admins;
	
	@Autowired
	Admins admin;
	
	@Autowired
	Students st;
	
	@RequestMapping("/")
	public String homepage()
	{
		return "index.jsp"; 
	}
	
	@CrossOrigin(origins = "http://127.0.0.1:5500")
//	@CrossOrigin(origins = "*")
	@RequestMapping(value="/getData",method=RequestMethod.POST)
	public void getData(HttpServletRequest request,HttpServletResponse response,@RequestBody Students stu)
	{
		System.out.println("data is : "+stu);
		try
		{
			PrintWriter out=response.getWriter();
			System.out.println("/getData request...");
			students=studentService.getAllStudents();
			
			Gson gson=new Gson();
			String json=gson.toJson(students);
			System.out.println("Json is  :"+json);
			out.println(json);
		}
		catch(Exception e)
		{
			System.out.println("Exception : "+e);
		}
	}
	
	@GetMapping("LoginController")
	@ResponseBody
	public String loginController(HttpServletRequest request)
	{
		int result=0;
		String applicant=request.getParameter("applicant");
		
		if(applicant.equals("students"))
		{
			try
			{
				String password=request.getParameter("password");
				String username=request.getParameter("username");
				result=studentService.getStudent(password,username);
				System.out.println("result is : "+result);
			}
			catch(Exception e)
			{
				System.out.println("Exception in LoginController of students :"+e);
			}
		}
		else if(applicant.equals("staffs"))
		{
			try
			{
				String password=request.getParameter("password");
				String username=request.getParameter("username");
				result=staffService.getStaff(password,username);
				System.out.println("result is : "+result);
			}
			catch(Exception e)
			{
				System.out.println("Exception in LoginController of staffs :"+e);
			}
		}
		else if(applicant.equals("admins"))
		{
			try
			{
				String password=request.getParameter("password");
				String username=request.getParameter("username");
				result=adminService.getAdmin(password,username);
				System.out.println("result is : "+result);
			}
			catch(Exception e)
			{
				System.out.println("Exception in LoginController of admins :"+e);
			}
		}
		else
		{
			System.out.println("No match found :"+result);
		}
		return ""+result;
	}
}
