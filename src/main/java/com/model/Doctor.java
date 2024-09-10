package com.model;

public class Doctor {

	private String name;
	private String email;
	private String specialization;
	private String address;
	private String mobile;
	private String gender;
	private String note;
	
	
	public Doctor(String name, String email, String specialization, String address, String mobile, String gender,String note) {
		this.name = name;
		this.email = email;
		this.specialization = specialization;
		this.address = address;
		this.mobile = mobile;
		this.gender = gender;
		this.note = note;
	}
	
	public Doctor() {
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	
	
}
