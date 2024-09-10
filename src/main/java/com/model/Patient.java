package com.model;

public class Patient {

	private String name;
	private char gender;
	private String phone;
	private String dob;
	private String marialStatus;
	private String presentAddress;
	private String communicationAddress;
	private String pastMedicalHistory;
	private String otherDetails;
	
	
	public Patient(String name, char gender, String phone, String dob, String marialStatus, String presentAddress,
			String communicationAddress, String pastMedicalHistory, String otherDetails) {
		
		this.name = name;
		this.gender = gender;
		this.phone = phone;
		this.dob = dob;
		this.marialStatus = marialStatus;
		this.presentAddress = presentAddress;
		this.communicationAddress = communicationAddress;
		this.pastMedicalHistory = pastMedicalHistory;
		this.otherDetails = otherDetails;
	}
	
	
	public Patient() {
		
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getMarialStatus() {
		return marialStatus;
	}
	public void setMarialStatus(String marialStatus) {
		this.marialStatus = marialStatus;
	}
	public String getPresentAddress() {
		return presentAddress;
	}
	public void setPresentAddress(String presentAddress) {
		this.presentAddress = presentAddress;
	}
	public String getCommunicationAddress() {
		return communicationAddress;
	}
	public void setCommunicationAddress(String communicationAddress) {
		this.communicationAddress = communicationAddress;
	}
	public String getPastMedicalHistory() {
		return pastMedicalHistory;
	}
	public void setPastMedicalHistory(String pastMedicalHistory) {
		this.pastMedicalHistory = pastMedicalHistory;
	}
	public String getOtherDetails() {
		return otherDetails;
	}
	public void setOtherDetails(String otherDetails) {
		this.otherDetails = otherDetails;
	}
	
	
}
