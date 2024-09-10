package com.model;

public class Specialization {

	private int code;
	private String name;
	private String note;
	
	public Specialization() {
		
	}
	public Specialization(int code, String name, String note) {
		this.code = code;
		this.name = name;
		this.note = note;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
}
