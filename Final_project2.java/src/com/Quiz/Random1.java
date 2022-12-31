package com.Quiz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Random;

public class Random1 {
	ResultSet rs;
	static int count=0;
	 
public  ResultSet	random1(){
	
	
	try {
	
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection		 con= DriverManager.getConnection("jdbc:mysql://localhost:3306/quiz1", "root","atalantica@1");
			

			Random dice=new Random();
			int number=0;
				for(int o=1;o<=1;o++) {
					
					
					
					
		 number	=	dice.nextInt(10);
			//System.out.println(number);
				
			
					 	
			
				PreparedStatement ps = con.prepareStatement("select * from quiz1.student where id=?;");
		//if(number!=count) {
		//	count=number;
					ps.setInt(1,number);
			ResultSet 			 rs= ps.executeQuery();
		//}
			this.rs=rs;
		//con.close();
		//ps.close();
	//rs.close();
				}		
	}catch(Exception e) {
		
		
		System.out.println(e);
	}
	finally {
	
	}
	
	return rs;
	
	}

}
