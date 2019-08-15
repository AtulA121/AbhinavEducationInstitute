package com.abhinav.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
@Entity
public class Staffs
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int staff_id;
	StaffsFullName staff_name;
	String staff_dob;
	String staff_gender;
	String staff_mobile;
	String staff_password;
	String staff_email;
	String staff_address;
	String staff_photo;
	String staff_qualification;
	String staff_experience;
	String staff_resume;
	String staff_adhar;
	String staff_selection;
	String staff_salary;
	String staff_date;
	String staff_time;
	
	public int getStaff_id() {
		return staff_id;
	}
	public void setStaff_id(int staff_id) {
		this.staff_id = staff_id;
	}
	public StaffsFullName getStaff_name() {
		return staff_name;
	}
	public void setStaff_name(StaffsFullName staff_name) {
		this.staff_name = staff_name;
	}
	public String getStaff_dob() {
		return staff_dob;
	}
	public void setStaff_dob(String staff_dob) {
		this.staff_dob = staff_dob;
	}
	public String getStaff_gender() {
		return staff_gender;
	}
	public void setStaff_gender(String staff_gender) {
		this.staff_gender = staff_gender;
	}
	public String getStaff_mobile() {
		return staff_mobile;
	}
	public void setStaff_mobile(String staff_mobile) {
		this.staff_mobile = staff_mobile;
	}
	public String getStaff_password() {
		return staff_password;
	}
	public void setStaff_password(String staff_password) {
		this.staff_password = staff_password;
	}
	public String getStaff_email() {
		return staff_email;
	}
	public void setStaff_email(String staff_email) {
		this.staff_email = staff_email;
	}
	public String getStaff_address() {
		return staff_address;
	}
	public void setStaff_address(String staff_address) {
		this.staff_address = staff_address;
	}
	public String getStaff_photo() {
		return staff_photo;
	}
	public void setStaff_photo(String staff_photo) {
		this.staff_photo = staff_photo;
	}
	public String getStaff_qualification() {
		return staff_qualification;
	}
	public void setStaff_qualification(String staff_qualification) {
		this.staff_qualification = staff_qualification;
	}
	public String getStaff_experience() {
		return staff_experience;
	}
	public void setStaff_experience(String staff_experience) {
		this.staff_experience = staff_experience;
	}
	public String getStaff_resume() {
		return staff_resume;
	}
	public void setStaff_resume(String staff_resume) {
		this.staff_resume = staff_resume;
	}
	public String getStaff_adhar() {
		return staff_adhar;
	}
	public void setStaff_adhar(String staff_adhar) {
		this.staff_adhar = staff_adhar;
	}
	public String getStaff_selection() {
		return staff_selection;
	}
	public void setStaff_selection(String staff_selection) {
		this.staff_selection = staff_selection;
	}
	public String getStaff_salary() {
		return staff_salary;
	}
	public void setStaff_salary(String staff_salary) {
		this.staff_salary = staff_salary;
	}
	public String getStaff_date() {
		return staff_date;
	}
	public void setStaff_date(String staff_date) {
		this.staff_date = staff_date;
	}
	public String getStaff_time() {
		return staff_time;
	}
	public void setStaff_time(String staff_time) {
		this.staff_time = staff_time;
	}
	
	@Override
	public String toString() {
		return "Staffs [staff_id=" + staff_id + ", staff_name=" + staff_name + ", staff_dob=" + staff_dob
				+ ", staff_gender=" + staff_gender + ", staff_mobile=" + staff_mobile + ", staff_password="
				+ staff_password + ", staff_email=" + staff_email + ", staff_address=" + staff_address
				+ ", staff_photo=" + staff_photo + ", staff_qualification=" + staff_qualification
				+ ", staff_experience=" + staff_experience + ", staff_resume=" + staff_resume + ", staff_adhar="
				+ staff_adhar + ", staff_selection=" + staff_selection + ", staff_salary=" + staff_salary
				+ ", staff_date=" + staff_date + ", staff_time=" + staff_time + "]";
	}
}
