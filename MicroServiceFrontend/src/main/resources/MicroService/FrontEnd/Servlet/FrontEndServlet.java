package MicroService.FrontEnd.Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import MicroService.MicroServiceBackend.Service.StudentService;


public class FrontEndServlet extends HttpServlet {
	
	
	StudentService ss=new StudentService();
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().println(ss.getDetails());
	}

	

}
