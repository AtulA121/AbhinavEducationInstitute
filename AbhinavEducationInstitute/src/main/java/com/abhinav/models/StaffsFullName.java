package com.abhinav.models;

import javax.persistence.Embeddable;

@Embeddable
public class StaffsFullName
{
	String staff_fname;
	String staff_mname;
	String staff_lname;
	
	public String getStaff_fname() {
		return staff_fname;
	}
	public void setStaff_fname(String staff_fname) {
		this.staff_fname = staff_fname;
	}
	public String getStaff_mname() {
		return staff_mname;
	}
	public void setStaff_mname(String staff_mname) {
		this.staff_mname = staff_mname;
	}
	public String getStaff_lname() {
		return staff_lname;
	}
	public void setStaff_lname(String staff_lname) {
		this.staff_lname = staff_lname;
	}
	
	@Override
	public String toString() {
		return "StaffsFullName [staff_fname=" + staff_fname + ", staff_mname=" + staff_mname + ", staff_lname="
				+ staff_lname + "]";
	}
}
