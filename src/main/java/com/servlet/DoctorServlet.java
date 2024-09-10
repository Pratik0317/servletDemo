package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Doctor;
import com.service.HospitalMgntServiceImpl;
import com.service.HospitalMgntServices;

/**
 * Servlet implementation class DoctorServlet
 */
@WebServlet("/DoctorServlet")
public class DoctorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DoctorServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		request.getRequestDispatcher("doctor.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		HospitalMgntServices hospitalMgntServices = new HospitalMgntServiceImpl();
		Doctor doctor = new Doctor();
		doctor.setName(request.getParameter("name"));
		doctor.setEmail(request.getParameter("emailId"));
		doctor.setSpecialization(request.getParameter("specialization"));
		doctor.setAddress(request.getParameter("address"));
		doctor.setMobile(request.getParameter("mobile"));
		doctor.setGender(request.getParameter("gender"));
		doctor.setNote(request.getParameter("note"));
		
		hospitalMgntServices.registerDoctors(doctor);
		request.getRequestDispatcher("home.jsp").forward(request, response);
	}

}
