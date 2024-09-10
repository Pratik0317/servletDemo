package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Specialization;
import com.service.HospitalMgntServiceImpl;
import com.service.HospitalMgntServices;

/**
 * Servlet implementation class SpecializationServlet
 */
@WebServlet("/SpecializationServlet")
public class SpecializationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SpecializationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		request.getRequestDispatcher("specialization.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		Specialization specialization = new Specialization();
		specialization.setCode(Integer.parseInt(request.getParameter("code")));
		specialization.setName(request.getParameter("name"));
		specialization.setNote(request.getParameter("note"));
		
		HospitalMgntServices hospitalMgntServices = new HospitalMgntServiceImpl();
		hospitalMgntServices.addSpecialization(specialization);
		request.getRequestDispatcher("home.jsp").forward(request, response);
	}

}
