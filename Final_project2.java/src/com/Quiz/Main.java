	package com.Quiz;
	
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	
	
	import java.util.HashMap;


	import java.util.Map;

import java.util.Scanner;
	
	
	public class Main  {
	
 
	
		static {
			System.out.println("[This is your quiz. "+"All question should be attend.]");
			System.out.println("========================================================");
		}
		
	static int count=0;
	static int wrongcount=0;
    static int i=0;//user count.
    static int num1;
		public static void main(String[] args)throws Exception {
			
		
			
		
			for(int l=1;;l++) {
				count=0;
				System.out.println("User number no="+i);
			Userdetail ud = new Userdetail();
		    String result =	ud.name();
		    String result1 = ud.email();
		    System.out.println("Dont press any key question is loading");
		    
			Scanner sc = new Scanner(System.in);
			String ans1 = null;
			
			
			Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con1= DriverManager.getConnection("jdbc:mysql://localhost:3306/quiz1", "root","atalantica@1");
					PreparedStatement ps1 = con1.prepareStatement("insert into quiz1.user2 (name,useremail,studentanswer)values(?,?,?)");
					ps1.setString(1,result);
					ps1.setString(2, result1);
					ps1.setString(3,ans1 );
					 ps1.execute();
					con1.close();
					ps1.close();
					
			//HashSet hs=new HashSet();
		//hs.add("1");
		//hs.add("2");
	//	hs.add("3");
		//hs.add("4");
	//	hs.add("5");
	//	hs.add("6");
	//	hs.add("7");
	//	hs.add("8");
	//	hs.add("9");
	//	hs.add("10");
	//	System.out.println(hs);
			
			
			
	
					
			
			 
			try {
				
				
//			int l=1;
//			while(l<=10) {
//				Class.forName("com.mysql.cj.jdbc.Driver");
//				Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/quiz1", "root","atalantica@1");
//				
//	PreparedStatement ps = con.prepareStatement("select * from quiz1.student where id=?;");
//			
//				Random dice=new Random();
//					
//			int number	=	dice.nextInt(10);
//				System.out.println(number);
//					ps.setInt(1,number);
//					
//				 	 rs= ps.executeQuery();	
//						System.out.println("a");
//				
		
						//System.out.println(number);
			
				// System.out.println(number);
					int v=0;		//	System.out.println("a"+rs.getString(2));
			while(v<=10) {
					
				ResultSet1 re=new ResultSet1();
				ResultSet	 rs=		re.a();
			
								
				while(rs.next()) {
					
				
						
			
									
					
					

					
					System.out.println("================================");
				Map<String ,String> map1=new HashMap();	
				
				//System.out.println(map);
			//Question constractor was here.
	Question question=new Question(rs.getString(2),rs);
					//System.out.print(rs.getString("id"));
				   // System.out.print(rs.getString(1));
				   // System.out.println(rs.getString(2));
					//System.out.println(rs.getString(3));
					//System.out.println(rs.getString(4));
				//	System.out.println(rs.getString(5));
				//	System.out.println(rs.getString(6));
					
				
					
		
					
					
					System.out.println("Enter your ans");
				    ans1= sc.next();
				    String name=rs.getString(7);
				    
					//map.put(ans1,name);
					if(ans1.equals(name)) {
						System.out.println("your ans is right");
						count++;
					}else {
						wrongcount++;
						System.out.println("your ans is wrong");
					}
					
					System.out.println("------------------------");
					
					//System.out.println(map);
					
					Random1 r=new Random1();
					ResultSet rs3=	r.random1();
				
					
					}
				
				
				
		
			
				
				
				
				v++;
			}
			
				
					
			
				System.out.println("================================");
				System.out.println("your score is ="+count +" out of 10");
				System.out.println("you have given "+wrongcount+"wronganswer");
		System.out.println("============================================================");		
				if(count==10) {
					System.out.println("Your grade is Class A");
				}else if(count<=9) {
					System.out.println("your grade is Class B");
				}else if(count <=6) {
					System.out.println("your grade is Class C");
					}else if(count<=3) {
					System.out.println("your are Failed");
				}
				System.out.println("========================================================");
				
				
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con2= DriverManager.getConnection("jdbc:mysql://localhost:3306/quiz1", "root","atalantica@1");
				PreparedStatement ps2 = con2.prepareStatement("insert into quiz1.user3 (username,Score)values(?,?)");
				ps2.setString(1, result);
				ps2.setInt(2, count);
				ps2.execute();
				
				con2.close();
				ps2.close();
				System.out.println("=================================");
				System.out.println("=================================");
				System.out.println("User number= "+i+" has attended Quiz");
				System.out.println("=================================");
				
				System.out.println("Your Quiz has Ended");
				System.out.println("=================================");
				
			}
			catch(Exception e){
				System.out.println(e);
			}
			
			
			
			
			
			
Result re=new Result(l);

			}
		
			
	
			}
		}
		
		
	
	
	
	
