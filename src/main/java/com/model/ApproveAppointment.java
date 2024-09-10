package com.model;

public class ApproveAppointment {

	private String patient;
	private String doctor;
	private String date;
	private boolean status;
	
	public ApproveAppointment(String patient, String doctor, String date, boolean status) {
		this.patient = patient;
		this.doctor = doctor;
		this.date = date;
		this.status = status;
	}
	
	public ApproveAppointment() {
		
	}

	public String getPatient() {
		return patient;
	}

	public void setPatient(String patient) {
		this.patient = patient;
	}

	public String getDoctor() {
		return doctor;
	}

	public void setDoctor(String doctor) {
		this.doctor = doctor;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
}
