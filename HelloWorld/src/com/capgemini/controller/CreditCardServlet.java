package com.capgemini.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/creditcard")
public class CreditCardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public CreditCardServlet() {
        super();
       
    }

	
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
	     int cardno = Integer.parseInt(request.getParameter("cardnumber"));
	     int month = Integer.parseInt(request.getParameter("expirymonth"));
	     int year = Integer.parseInt(request.getParameter("expiryyear"));
	     int cvvv = Integer.parseInt(request.getParameter("cvv"));
	        
		out.println("Card number: " + cardno + "\nExpiry month: " + month + "\nExpiry year: " + year
							+ "\nCVV: " + cvvv ++ );
					out.close();
	}
	

}
