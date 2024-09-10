package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Appointment;
import com.service.HospitalMgntServiceImpl;
import com.service.HospitalMgntServices;

/**
 * Servlet implementation class AppointmentServlet
 */
@WebServlet("/AppointmentServlet")
public class AppointmentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AppointmentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		request.getRequestDispatcher("appointment.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		Appointment appointment = new Appointment();
		appointment.setDoctor(request.getParameter("doctor"));
		appointment.setDate(request.getParameter("date"));
		appointment.setSlotsNo(Integer.parseInt(request.getParameter("noOfSlots")));
		appointment.setDetails(request.getParameter("details"));
		appointment.setConsultationFee(Integer.parseInt(request.getParameter("consultationFee")));
		
		HospitalMgntServices hospitalMgntServices = new HospitalMgntServiceImpl();
		hospitalMgntServices.bookAppointment(appointment);
		request.getRequestDispatcher("home.jsp").forward(request, response);
	}

}
