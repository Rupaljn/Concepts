package com.rakuten.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.rakuten.dto.User;

public class UserModel {
public boolean addUser(User user){
	boolean flag = false;
	String name = user.getName();
	String email = user.getEmail();
	String password = user.getPassword();
	
	try{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tofique", "root", "root");
		PreparedStatement ps = con.prepareStatement("insert into user values(?,?,?)");
		ps.setString(1, name);
		ps.setString(2, email);
		ps.setString(3, password);
		int row = ps.executeUpdate();
		if(row>0){
			flag = true;
		}
		con.close();
		
	}
	catch(ClassNotFoundException cnfe){
		cnfe.printStackTrace();
	}
	catch(SQLException se){
		se.printStackTrace();
	}
	
	return flag;
	
	
}
}
