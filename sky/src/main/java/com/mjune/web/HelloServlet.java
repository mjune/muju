package com.mjune.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Hello Sky Servlet Sky.11.11");
		PrintWriter pw = response.getWriter();
		pw.println("do11do11do11do11do11do11do11do11 Hello Sky Servlet Sky.11.11 .............do11do11.");
		pw.println("do22 Hello Sky Servlet Sky.11.11 ..............");
		pw.println("do33 Hello Sky Servlet Sky.11.11 .............. Sky Servlet Sky.aa ..............");
		pw.println("do44 Hello Sky Servlet Sky.11.11 .............. Sky Servlet Sky.aa ..............");
		pw.println("do55 Hello Sky Servlet Sky.11.11 .............. Sky Servlet Sky.bb ..............");
		pw.println("do66 Hello Sky Servlet Sky.11.11 .............. Sky Servlet Sky.bb ..............");
		pw.println("do77 do77do77do77do77do77do77do77do77do77do77do77do77do77Hello Sky Servlet Sky.11.11 .............. Sky Servlet Sky.cc ..............");
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("22222222222222222222222");
		PrintWriter pw = response.getWriter();
		pw.println("Hello Servlet Sky222................");
	}

}
