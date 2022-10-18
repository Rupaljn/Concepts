package com.rauten.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HomeView
 */
@WebServlet("/HomeView")
public class HomeView extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HomeView() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
PrintWriter out = response.getWriter();
out.print("<html>");
out.print("<body>");
out.print("<h1> Home View </h1>");
out.print("<h3> Welcome to home view page </h3>");
if(request.getAttribute("successMsg")!=null){
	String successMsg = (String) request.getAttribute("successMsg");
	out.print("<h1>");
	out.print(successMsg);
	out.print("</h1>");
}
else if(request.getAttribute("errorMsg")!=null){
	String errorMsg = (String)request.getAttribute("errorMsg");
	out.print("<h1>");
	out.print(errorMsg);
	out.print("</h1>");
}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
