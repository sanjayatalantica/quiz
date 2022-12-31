package com.Quiz;

import java.sql.ResultSet;

public class ResultSet1 {
	ResultSet rs1;
	public ResultSet a() {
		Random1 r=new Random1();
		ResultSet rs1=	r.random1();
		this.rs1=rs1;
		return rs1;
	}

}
