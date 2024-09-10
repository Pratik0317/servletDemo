package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Patient;
import com.service.HospitalMgntServiceImpl;
import com.service.HospitalMgntServices;

/**
 * Servlet implementation class PatientServlet
 */
@WebServlet("/PatientServlet")
public class PatientServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PatientServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		request.getRequestDispatcher("patient.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		Patient patient = new Patient();
		patient.setName(request.getParameter("first-name"));
		patient.setGender(request.getParameter("gender").charAt(0));
		patient.setPhone(request.getParameter("phone"));
		patient.setDob(request.getParameter("dob"));
		patient.setMarialStatus(request.getParameter("marital-status"));
		patient.setPresentAddress(request.getParameter("present-address"));
		patient.setCommunicationAddress(request.getParameter("communication-address"));
		patient.setPastMedicalHistory(request.getParameter("medical-history"));
		patient.setOtherDetails(request.getParameter("other-details"));
		
		HospitalMgntServices hospitalMgntServices = new HospitalMgntServiceImpl();
		hospitalMgntServices.addPatient(patient);
		request.getRequestDispatcher("home.jsp").forward(request, response);
	}

}
