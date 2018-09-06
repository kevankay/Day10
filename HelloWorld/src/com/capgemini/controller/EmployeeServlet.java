package com.capgemini.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.capgemini.classes.Employee;

@WebServlet("/employeedetails")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	ArrayList<Employee> employee = new ArrayList();

	public EmployeeServlet() {
		super();

	}

	@Override
	public void init(ServletConfig config) throws ServletException {

		employee.add(new Employee(1234, "shiny", 15000, "java"));
		employee.add(new Employee(5555, "george", 45000, "sap"));
		employee.add(new Employee(9849, "keerthana", 20000, "oracle"));
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String employeeId = request.getParameter("employeeId");

		int empId = Integer.parseInt(employeeId);
        int count = 0;
		for (Employee e : employee) {
			if (e.getEmployeeId() == empId) {
				out.println("<table border='1'><tr><th>Employee ID</th><th>Name</th><th>Salary</th><th>Department</th>");
				out.println("<tr><td>" + e.getEmployeeId() + "</td><td>" + e.getName() + "</td><td>" + e.getSalary()
						+ "</td><td>" + e.getNameOfTheDepartment() + "</td></table>");
				count=1;
				break;
			}
		}
        
		if(count==0) {
		out.println("<h3>Employee doesn't exist</h3>");
		}
		out.close();
	}
}
