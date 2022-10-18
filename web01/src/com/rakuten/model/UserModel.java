package com.rakuten.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.rakuten.entity.User;

public class UserModel {

	public boolean save(User user){
		boolean flag = false;
		
		String name = user.getName();
		String email = user.getEmail();
		String password = user.getPassword();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tofique","root","root");
			PreparedStatement ps = con.prepareStatement("insert into user values(?,?,?)");
			
			ps.setString(1, name);
			ps.setString(2, email);
			ps.setString(3, password);
			System.out.println("sadf");
			int row = ps.executeUpdate();
			if(row>0){
				flag = true;
			}
			con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return flag ;
		
	}
	
	
	
}
