package com.service;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.db.BD;
import com.model.Appointment;
import com.model.ApproveAppointment;
import com.model.Doctor;
import com.model.Patient;
import com.model.Specialization;

public class HospitalMgntServiceImpl implements HospitalMgntServices{

	@Override
	public void registerDoctors(Doctor doctor) {
		// TODO Auto-generated method stub
		String sql = "insert into doctor(name, email, specialization, address, mobile,  gender, note)values(?,?,?,?,?,?,?)";
		try {
			PreparedStatement ptms = BD.getConnect().prepareStatement(sql);
			ptms.setString(1, doctor.getName());
			ptms.setString(2, doctor.getEmail());
			ptms.setString(3, doctor.getSpecialization());
			ptms.setString(4, doctor.getAddress());
			ptms.setString(5, doctor.getMobile());
			ptms.setString(6, doctor.getGender());
			ptms.setString(7, doctor.getNote());
		    ptms.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void addSpecialization(Specialization specialization) {
		// TODO Auto-generated method stub
		String sql = "insert into specialization(code, name, note)values(?,?,?)";
		
		try {
			PreparedStatement ptms = BD.getConnect().prepareStatement(sql);
			ptms.setInt(1, specialization.getCode());
			ptms.setString(2, specialization.getName());
			ptms.setString(3, specialization.getNote());
			ptms.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void addPatient(Patient patient) {
		// TODO Auto-generated method stub
		String sql ="insert into patient(name, gender, phone, dob, marialStatus, presentAddress, communicationAddress, pastMedicalHistory,otherDetails)values(?,?,?,?,?,?,?,?,?)";
		try {
			PreparedStatement ptms = BD.getConnect().prepareStatement(sql);
			ptms.setString(1, patient.getName());
			ptms.setString(2, String.valueOf(patient.getGender()));
			ptms.setString(3, patient.getPhone());
			ptms.setString(4, patient.getDob());
			ptms.setString(5, patient.getMarialStatus());
			ptms.setString(6, patient.getPresentAddress());
			ptms.setString(7, patient.getCommunicationAddress());
			ptms.setString(8, patient.getPastMedicalHistory());
			ptms.setString(9, patient.getOtherDetails());
			ptms.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public void bookAppointment(Appointment appointment) {
		// TODO Auto-generated method stub
		String sql = "insert into appointment(doctor,date,slotsNo,details,consultationFee)values(?,?,?,?,?)";
		
		try {
			PreparedStatement ptms = BD.getConnect().prepareStatement(sql);
			ptms.setString(1, appointment.getDoctor());
			ptms.setString(2, appointment.getDate());
			ptms.setInt(3, appointment.getSlotsNo());
			ptms.setString(4, appointment.getDetails());
			ptms.setInt(5, appointment.getConsultationFee());
			ptms.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void approveAppointment(ApproveAppointment approveAppointment) {
		// TODO Auto-generated method stub
		
	}

}
