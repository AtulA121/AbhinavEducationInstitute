package com.abhinav.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
@Entity
public class Admins
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int admin_id;
	String admin_name;
	String admin_dob;
	String admin_gender;
	String admin_mobile;
	String admin_email;
	String admin_address;
	String admin_photo;
	String admin_password;
	String admin_date;
	String admin_time;
	
	public int getAdmin_id() {
		return admin_id;
	}
	public void setAdmin_id(int admin_id) {
		this.admin_id = admin_id;
	}
	public String getAdmin_name() {
		return admin_name;
	}
	public void setAdmin_name(String admin_name) {
		this.admin_name = admin_name;
	}
	public String getAdmin_dob() {
		return admin_dob;
	}
	public void setAdmin_dob(String admin_dob) {
		this.admin_dob = admin_dob;
	}
	public String getAdmin_gender() {
		return admin_gender;
	}
	public void setAdmin_gender(String admin_gender) {
		this.admin_gender = admin_gender;
	}
	public String getAdmin_mobile() {
		return admin_mobile;
	}
	public void setAdmin_mobile(String admin_mobile) {
		this.admin_mobile = admin_mobile;
	}
	public String getAdmin_email() {
		return admin_email;
	}
	public void setAdmin_email(String admin_email) {
		this.admin_email = admin_email;
	}
	public String getAdmin_address() {
		return admin_address;
	}
	public void setAdmin_address(String admin_address) {
		this.admin_address = admin_address;
	}
	public String getAdmin_photo() {
		return admin_photo;
	}
	public void setAdmin_photo(String admin_photo) {
		this.admin_photo = admin_photo;
	}
	public String getAdmin_password() {
		return admin_password;
	}
	public void setAdmin_password(String admin_password) {
		this.admin_password = admin_password;
	}
	public String getAdmin_date() {
		return admin_date;
	}
	public void setAdmin_date(String admin_date) {
		this.admin_date = admin_date;
	}
	public String getAdmin_time() {
		return admin_time;
	}
	public void setAdmin_time(String admin_time) {
		this.admin_time = admin_time;
	}
	
	@Override
	public String toString() {
		return "Admins [admin_id=" + admin_id + ", admin_name=" + admin_name + ", admin_dob=" + admin_dob
				+ ", admin_gender=" + admin_gender + ", admin_mobile=" + admin_mobile + ", admin_email=" + admin_email
				+ ", admin_address=" + admin_address + ", admin_photo=" + admin_photo + ", admin_password="
				+ admin_password + ", admin_date=" + admin_date + ", admin_time=" + admin_time + "]";
	}
}
