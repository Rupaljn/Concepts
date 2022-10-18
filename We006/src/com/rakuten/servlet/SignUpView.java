package com.rakuten.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SignUpView
 */
@WebServlet("/SignUpView")
public class SignUpView extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignUpView() {
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
	out.print("<h1 align = 'center'> SignUp View </h1>");
	out.print("<form action = 'SignUpControler'>");
	out.print("<h3> Name </h3>");
	out.print("<input name = 'name' type = 'text'>");
	out.print("<h3> Email </h3>");
	out.print("<input name =  'email' type = 'text'>");
	out.print("<h3> password </h3>");
	out.print("<input name = 'password' type = 'password' >");
	out.print("<input  type = 'submit'>");
	
	out.print("</form>");
	out.print("</body>");
	out.print("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
