package com.nt.bean;

import java.util.Date;

public class WishMessageGenerator {
	//bean property 
	private Date date;

	WishMessageGenerator(Date date){
		System.out.println("WishMessageGenerator::1 - param construtor");
		
		this.date=date;
	}
	public void setDate(Date date){
		this.date=date;
	}
	
	
	public String generateWishMessage(String user) {
		System.out.println("Date:"+date);
		int hour=0;
		//get cuurent hour of day
		hour=date.getHours();
		if(hour<12) {
			return "Good Morning :: "+user;
		}
		else if (hour<16) {
			return "Good Afternoon :: "+user;
		}
		else if (hour<20) {
			return "Good Evening :: "+user;
		}
		else {
			return "Good Night :: "+user;
		}
		
		
	}

}
