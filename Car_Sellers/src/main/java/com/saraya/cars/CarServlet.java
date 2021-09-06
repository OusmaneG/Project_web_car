package com.saraya.cars;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.saraya.model.CarService;


@WebServlet (urlPatterns ="/car.do") 
public class CarServlet extends HttpServlet {
	CarService cs = new CarService();
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		request.setAttribute("auto", cs.getAllCars() );
		request.getRequestDispatcher("/WEB-INF/views/page2.jsp").forward(request, response);
	}
	
	@Override 
	public void doPost (HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
						
		int id = Integer.parseInt(request.getParameter("id"));
		int year = Integer.parseInt(request.getParameter("yr"));
									
		String mark = request.getParameter("mk");
		
		String model = request.getParameter("md");
		
		String image = request.getParameter("im");
		
			
		cs.addCar(year, year, mark, model, image);
	   response.sendRedirect("/car.do");
	}
}
