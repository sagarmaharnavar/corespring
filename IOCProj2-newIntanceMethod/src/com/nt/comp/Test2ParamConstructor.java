 package com.nt.comp;

public class Test2ParamConstructor {

	private int a;
	private int b;
	{
		System.out.println("static method in test");
	}
	
	public Test2ParamConstructor(){
		System.out.println("Test:: 0 - param constuctor");
	}
	
	public Test2ParamConstructor(int a, int b){
		System.out.println("Test:: 2 - param constuctor");
		this.a=a;
		this.b=b;
	}

	@Override
	public String toString() {
		return "Test2ParamConstructor [a=" + a + ", b=" + b + "]";
	} 
	
	
	

 }
