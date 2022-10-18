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
if(request.getAttribute("successMsg")!=null){
	String successMsg = (String)request.getAttribute("successMsg");
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
out.print("<form action = 'Registration'> ");
out.print("<h3> Full Name </h3>");
out.print("<input name = 'fullName' type = 'text'>");
out.print("<br>");
out.print("<h3> Email Id </h3>");
out.print("<input name = 'email Id' type = 'text'>");
out.print("<br>");
out.print("<h3> Contact Number </h3>");
out.print("<input name = 'contactNumber' type = 'contactNumber'>");
out.print("<br>");
out.print("<h3> Password </h3>");
out.print("<input name = 'password' type = 'password'>");
out.print("<br> <br> <br>");
out.print("<input type = 'submit'>");



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
