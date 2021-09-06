package com.saraya.login;
import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



@WebServlet(urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet {
	UserValidation id =new UserValidation();
//	FormationService fs = new FormationService();
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		request.setAttribute("name", request.getParameter("name"));
		request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		
		String user = request.getParameter("uname");
		String pass = request.getParameter("password");
		
		
		boolean valid = id.isValid(user, pass);
		
		if (valid) {
			request.getSession().setAttribute("uname", user);
			request.getSession().setAttribute("password", pass);
			
			
			response.sendRedirect("/car.do");
								
		}
		else {
			request.setAttribute("error", "Error cridential");
			request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
		}
		
	}

}