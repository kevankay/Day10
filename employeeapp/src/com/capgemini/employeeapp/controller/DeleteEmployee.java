package com.capgemini.employeeapp.controller;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.capgemini.employeeapp.dao.EmployeeDao;
import com.capgemini.employeeapp.dao.impl.EmployeeDaoImpl;


@WebServlet("/DeleteEmployee")
public class DeleteEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private EmployeeDao employeeDao;
	private ServletContext context;
       
    
    public DeleteEmployee() {
        super();
        employeeDao = new EmployeeDaoImpl();
        
    }
    
    @Override
    public void init(ServletConfig config) throws ServletException {
    	context = config.getServletContext();
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                response.setContentType("text/html");
		
		      int empId = Integer.parseInt(request.getParameter("empId"));
	}

}
