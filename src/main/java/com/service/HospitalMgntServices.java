package com.service;
import com.model.Appointment;
import com.model.ApproveAppointment;
import com.model.Doctor;
import com.model.Patient;
import com.model.Specialization;

public interface HospitalMgntServices {

	void registerDoctors(Doctor doctor);
	void addSpecialization(Specialization specialization);
	void addPatient(Patient patient);
	void bookAppointment(Appointment appointment);
	void approveAppointment(ApproveAppointment approveAppointment);
}
