package com.dartc.helloword.servlet;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
	
	@WebServlet("/calculer")
	public class CalculerServlet extends HttpServlet {

	private static final Logger LOG = Logger.getLogger(CalculerServlet.class.getName());

	private static final long serialVersionUID = 1L;

	@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
				throws ServletException{
					LOG.log(Level.INFO, "Hello Word is about to work :)");
					String parameter1 = req.getParameter("number1");
					String parameter2 = req.getParameter("number2");
					
					int nombre1 = Integer.parseInt(parameter1);
					int nombre2 = Integer.parseInt(parameter2);
					
					int result = nombre1 + nombre2;
					
					LOG.log(Level.INFO, "Result addition :"+ result);
	}
}
