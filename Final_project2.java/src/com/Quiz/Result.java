package com.Quiz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Driver;

public class Result {
	int num;
	public  Result(int num) {
		
		this.num=num;
		System.out.println("Result");
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con3= DriverManager.getConnection("jdbc:mysql://localhost:3306/quiz1", "root","atalantica@1");
			PreparedStatement ps3 = con3.prepareStatement("select * from quiz1.user3  ;");
		//	ps3.setInt(1,620);
		
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con2= DriverManager.getConnection("jdbc:mysql://localhost:3306/quiz1", "root","atalantica@1");
			PreparedStatement ps2 = con2.prepareStatement("select * from quiz1.user2 ;");
			//ps2.setInt(1, 146);
		ResultSet rs3= ps3.executeQuery();
		ResultSet rs2=ps2.executeQuery();
		
		System.out.println("List of all student.");
		while(rs3.next()&rs2.next()) {
			
		
			
			System.out.print("User name="+rs2.getString("name")+" ");
			System.out.print("Score= "+rs3.getString("Score")+"   ");
			System.out.println("User email="+rs2.getString("useremail"));
			System.out.println("Result");
		
		}
			System.out.println("==================End of Quiz====================");
		con3.close();
		ps3.close();
		rs3.close();
		
			con2.close()	;
			ps2.close();
			rs2.close();
			
		
			
			}catch(Exception e) {
				System.out.println(e);
			}
			
	}

}
