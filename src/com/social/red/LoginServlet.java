package com.social.red;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import persistence.CRUD_Persona;

public class LoginServlet {

	private static final long serialVersionUID = 1L;
	CRUD_Persona c_persona = new CRUD_Persona();
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String user = req.getParameter("user");
		String pass = req.getParameter("password");
		if ("uptc".equals(user) && "uptc".equals(pass)) {
			resp.sendRedirect("tutoriales.jsp");
		} else {
			resp.sendRedirect("tutoriales.jsp");
		}
	}
}
