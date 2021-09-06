package com.saraya.login;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.saraya.model.CarService;


@WebServlet(urlPatterns = "/delete.do")
public class DeleteServlet extends HttpServlet {
		CarService fs = new CarService();
		
		@Override
		protected void doGet(HttpServletRequest request, HttpServletResponse response)
				throws IOException, ServletException {
			int id = Integer.parseInt(request.getParameter("id"));
			
			fs.deleteCar(id);
			response.sendRedirect("/car.do");
		}
}