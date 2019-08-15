package com.abhinav.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
@Entity
public class Students
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int student_id;
	
	public StudentsFullName getStudent_name() {
		return student_name;
	}
	public void setStudent_name(StudentsFullName student_name) {
		this.student_name = student_name;
	}
	StudentsFullName student_name;
	String student_dob;
	String student_gender;
	public String student_mobile;
	public String student_password;
	String student_email;
	String student_address;
	String student_photo;
	String stud_occ_colleg;
	String student_status;
	String student_adhar;
	String student_date;
	String student_time;
	
	public String getStudent_status() {
		return student_status;
	}
	public void setStudent_status(String student_status) {
		this.student_status = student_status;
	}
	public int getStudent_id() {
		return student_id;
	}
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	public String getStudent_dob() {
		return student_dob;
	}
	public void setStudent_dob(String student_dob) {
		this.student_dob = student_dob;
	}
	public String getStudent_gender() {
		return student_gender;
	}
	public void setStudent_gender(String student_gender) {
		this.student_gender = student_gender;
	}
	public String getStudent_mobile() {
		return student_mobile;
	}
	public void setStudent_mobile(String student_mobile) {
		this.student_mobile = student_mobile;
	}
	public String getStudent_password() {
		return student_password;
	}
	public void setStudent_password(String student_password) {
		this.student_password = student_password;
	}
	public String getStudent_email() {
		return student_email;
	}
	public void setStudent_email(String student_email) {
		this.student_email = student_email;
	}
	public String getStudent_address() {
		return student_address;
	}
	public void setStudent_address(String student_address) {
		this.student_address = student_address;
	}
	public String getStudent_photo() {
		return student_photo;
	}
	public void setStudent_photo(String student_photo) {
		this.student_photo = student_photo;
	}
	public String getStud_occ_colleg() {
		return stud_occ_colleg;
	}
	public void setStud_occ_colleg(String stud_occ_colleg) {
		this.stud_occ_colleg = stud_occ_colleg;
	}
	public String getStudent_adhar() {
		return student_adhar;
	}
	public void setStudent_adhar(String student_adhar) {
		this.student_adhar = student_adhar;
	}
	public String getStudent_date() {
		return student_date;
	}
	public void setStudent_date(String student_date) {
		this.student_date = student_date;
	}
	public String getStudent_time() {
		return student_time;
	}
	public void setStudent_time(String student_time) {
		this.student_time = student_time;
	}
	
	@Override
	public String toString() {
		return "Students [student_id=" + student_id + ", student_name=" + student_name + ", student_dob=" + student_dob
				+ ", student_gender=" + student_gender + ", student_mobile=" + student_mobile + ", student_password="
				+ student_password + ", student_email=" + student_email + ", student_address=" + student_address
				+ ", student_photo=" + student_photo + ", stud_occ_colleg=" + stud_occ_colleg + ", student_status="
				+ student_status + ", student_adhar=" + student_adhar + ", student_date=" + student_date
				+ ", student_time=" + student_time + "]";
	}
}
