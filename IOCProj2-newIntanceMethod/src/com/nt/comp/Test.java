 package com.nt.comp;

public class Test {

	{
		System.out.println("static method in test");
	}
	
	public Test(){
		System.out.println("Test:: 0 - param constuctor");
	}
	
	@Override
	public String toString() {
		
		return "Test::";
	}

 }
