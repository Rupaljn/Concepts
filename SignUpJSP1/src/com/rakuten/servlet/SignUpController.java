package com.rakuten.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rakuten.dto.User;
import com.rakuten.model.UserModel;

/**
 * Servlet implementation class SignUpController
 */
@WebServlet("/SignUpController")
public class SignUpController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignUpController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
String fullName = request.getParameter("fullName");
String emailId = request.getParameter("emailId");
String contactNumber = request.getParameter("contactNumber");
String password = request.getParameter("password");
long cn = Long.parseLong(contactNumber);
User ur = new User();
ur.getFullName();
ur.getEmailId();
ur.getContactNumber();
ur.getPassword();
UserModel um = new UserModel();
boolean flag = um.addUser(ur);
	
if(flag==true){
	String successMsg = "Sign Up is successfull";
	request.setAttribute("successMsg", successMsg);
	RequestDispatcher rd = request.getRequestDispatcher("HomeView.jsp");
	rd.forward(request, response);
}
else{
	String errorMsg = "Sign Up is not successfull";
	request.setAttribute("errorMsg", errorMsg);
	RequestDispatcher rd = request.getRequestDispatcher("SignUpView.jsp");
    rd.forward(request, response);	
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
