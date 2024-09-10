package com.model;

public class Appointment {

	private String doctor;
	private String date;
	private int slotsNo;
	private String details;
	private int consultationFee;
	
	public Appointment(String doctor, String date, int slotsNo, String details, int consultationFee) {
		this.doctor = doctor;
		this.date = date;
		this.slotsNo = slotsNo;
		this.details = details;
		this.consultationFee = consultationFee;
	}
	public Appointment() {
		
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
	public int getSlotsNo() {
		return slotsNo;
	}
	public void setSlotsNo(int slotsNo) {
		this.slotsNo = slotsNo;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public int getConsultationFee() {
		return consultationFee;
	}
	public void setConsultationFee(int consultationFee) {
		this.consultationFee = consultationFee;
	}
	
	
}
