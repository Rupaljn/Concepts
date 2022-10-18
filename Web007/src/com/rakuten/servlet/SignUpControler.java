package com.rakuten.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.tagplugins.jstl.core.Out;

import com.rakuten.dto.User;
import com.rakuten.model.UserModel;

/**
 * Servlet implementation class SignUpControler
 */
@WebServlet("/SignUpControler")
public class SignUpControler extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignUpControler() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
String name = request.getParameter("name");
String email = request.getParameter("email");
String password = request.getParameter("password");
User ur = new User();
ur.setName(name);
ur.setEmail(email);
ur.setPassword(password);
UserModel um = new UserModel();
boolean flag = um.addUser(ur);

if(flag==true){
	RequestDispatcher rd = request.getRequestDispatcher("HomeServlet");
	rd.forward(request, response);
}
else{
	RequestDispatcher rd = request.getRequestDispatcher("SignUpView");
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
